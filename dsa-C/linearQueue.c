#include <stdio.h>
#include <stdlib.h>

#define SIZE 5

typedef struct
{
    int items[SIZE];
    int front;
    int rear;
} Queue;

// Function prototypes
void initializeQueue(Queue *q);
int isFull(Queue *q);
int isEmpty(Queue *q);
void enqueue(Queue *q, int value);
int dequeue(Queue *q);
int getFront(Queue *q);
int getRear(Queue *q);
void viewQueue(Queue *q);

int main()
{
    Queue q;
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

    printf("Front element is %d\n", getFront(&q));
    printf("Rear element is %d\n", getRear(&q));

    return 0;
}

void initializeQueue(Queue *q)
{
    q->front = -1;
    q->rear = -1;
}

int isFull(Queue *q)
{
    if (q->rear == SIZE - 1)
        return 1;
    else
        return 0;
}

int isEmpty(Queue *q)
{
    if (q->front == -1 || q->front > q->rear)
        return 1;
    else
        return 0;
}

void enqueue(Queue *q, int value)
{
    if (isFull(q))
    {
        printf("Queue is full!\n");
    }
    else
    {
        if (q->front == -1) // Inserting the first element
            q->front = 0;
        q->rear++;
        q->items[q->rear] = value;
        printf("Inserted %d\n", value);
    }
}

int dequeue(Queue *q)
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
        q->front++;
        if (q->front > q->rear)
        { // Reset the queue
            q->front = q->rear = -1;
        }
        printf("Removed %d\n", item);
        return item;
    }
}

int getFront(Queue *q)
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

int getRear(Queue *q)
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

void viewQueue(Queue *q)
{
    if (isEmpty(q))
    {
        printf("Queue is empty!\n");
    }
    else
    {
        printf("Queue elements: ");
        for (int i = q->front; i <= q->rear; i++)
        {
            printf("%d ", q->items[i]);
        }
        printf("\n");
    }
}
