#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

// Define the maximum size of the stack
#define MAX 100

// Stack structure
typedef struct
{
    char *items[MAX];
    int top;
} Stack;

// Function to initialize the stack
void initStack(Stack *s)
{
    s->top = -1;
}

// Function to check if the stack is empty
int isEmpty(Stack *s)
{
    return s->top == -1;
}

// Function to check if the stack is full
int isFull(Stack *s)
{
    return s->top == MAX - 1;
}

// Function to push an element onto the stack
void push(Stack *s, char *item)
{
    if (isFull(s))
    {
        printf("Stack overflow\n");
        exit(EXIT_FAILURE);
    }
    s->items[++s->top] = item;
}

// Function to pop an element from the stack
char *pop(Stack *s)
{
    if (isEmpty(s))
    {
        printf("Stack underflow\n");
        exit(EXIT_FAILURE);
    }
    return s->items[s->top--];
}

// Function to create a new string from two operands and an operator
char *createInfix(char *op1, char *op2, char op)
{
    char *infix = (char *)malloc(strlen(op1) + strlen(op2) + 4);
    if (!infix)
    {
        printf("Memory allocation error\n");
        exit(EXIT_FAILURE);
    }
    sprintf(infix, "(%s%c%s)", op1, op, op2);
    return infix;
}

// Function to check if a character is an operator
int isOperator(char ch)
{
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}

// Function to convert postfix to infix
char *postfixToInfix(char *postfix)
{
    Stack s;
    initStack(&s);

    for (int i = 0; postfix[i] != '\0'; i++)
    {
        char ch = postfix[i];

        if (isalnum(ch))
        {
            char *operand = (char *)malloc(2);
            if (!operand)
            {
                printf("Memory allocation error\n");
                exit(EXIT_FAILURE);
            }
            operand[0] = ch;
            operand[1] = '\0';
            push(&s, operand);
        }
        else if (isOperator(ch))
        {
            char *op2 = pop(&s);
            char *op1 = pop(&s);
            char *infix = createInfix(op1, op2, ch);
            push(&s, infix);
            free(op1);
            free(op2);
        }
    }

    char *result = pop(&s);
    return result;
}

int main()
{
    char postfix[MAX];
    printf("Enter a postfix expression: ");
    scanf("%s", postfix);

    char *infix = postfixToInfix(postfix);
    printf("Infix expression: %s\n", infix);

    free(infix);
    return 0;
}
