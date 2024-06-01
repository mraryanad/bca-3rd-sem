#include <stdio.h>
#include <stdlib.h>

#define SIZE 5

typedef struct
{
    int items[SIZE];
    int front;
    int rear;
} CircularQueue;

// Function prototypes
void initializeQueue(CircularQueue *q);
int isFull(CircularQueue *q);
int isEmpty(CircularQueue *q);
void enqueue(CircularQueue *q, int value);
int dequeue(CircularQueue *q);
int getFront(CircularQueue *q);
int getRear(CircularQueue *q);
void viewQueue(CircularQueue *q);

int main()
{
    CircularQueue q;
    initializeQueue(&q);

    enqueue(&q, 10);
    enqueue(&q, 20);
    enqueue(&q, 30);
    enqueue(&q, 40);
    enqueue(&q, 50);

    viewQueue(&q);

    dequeue(&q);
    dequeue(&q);

    viewQueue(&q);

    enqueue(&q, 60);
    enqueue(&q, 70);

    viewQueue(&q);

    printf("Front element is %d\n", getFront(&q));
    printf("Rear element is %d\n", getRear(&q));

    return 0;
}

void initializeQueue(CircularQueue *q)
{
    q->front = -1;
    q->rear = -1;
}

int isFull(CircularQueue *q)
{
    if ((q->front == 0 && q->rear == SIZE - 1) || (q->rear == (q->front - 1) % SIZE))
        return 1;
    else
        return 0;
}

int isEmpty(CircularQueue *q)
{
    if (q->front == -1)
        return 1;
    else
        return 0;
}

void enqueue(CircularQueue *q, int value)
{
    if (isFull(q))
    {
        printf("Queue is full!\n");
    }
    else
    {
        if (q->front == -1) // Inserting the first element
            q->front = 0;
        q->rear = (q->rear + 1) % SIZE;
        q->items[q->rear] = value;
        printf("Inserted %d\n", value);
    }
}

int dequeue(CircularQueue *q)
{
    int item;
    if (isEmpty(q))
    {
        printf("Queue is empty!\n");
        return -1;
    }
    else
    {
        item = q->items[q->front];
        if (q->front == q->rear)
        { // Queue has only one element, so we reset the queue after dequeuing it
            q->front = -1;
            q->rear = -1;
        }
        else
        {
            q->front = (q->front + 1) % SIZE;
        }
        printf("Removed %d\n", item);
        return item;
    }
}

int getFront(CircularQueue *q)
{
    if (isEmpty(q))
    {
        printf("Queue is empty!\n");
        return -1;
    }
    else
    {
        return q->items[q->front];
    }
}

int getRear(CircularQueue *q)
{
    if (isEmpty(q))
    {
        printf("Queue is empty!\n");
        return -1;
    }
    else
    {
        return q->items[q->rear];
    }
}

void viewQueue(CircularQueue *q)
{
    if (isEmpty(q))
    {
        printf("Queue is empty!\n");
    }
    else
    {
        printf("Queue elements: ");
        int i = q->front;
        while (1)
        {
            printf("%d ", q->items[i]);
            if (i == q->rear)
                break;
            i = (i + 1) % SIZE;
        }
        printf("\n");
    }
}
