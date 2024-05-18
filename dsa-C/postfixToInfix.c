// postfix to infix DSA
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

#define MAX_SIZE 100

char stack[MAX_SIZE];
int top = -1;

void push(char c)
{
    stack[++top] = c;
}

char pop()
{
    return stack[top--];
}

int isOperator(char c)
{
    return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
}

void convertPostfixToInfix(char postfix[])
{
    char infix[MAX_SIZE] = "";
    int i, j;

    for (i = 0; postfix[i] != '\0'; i++)
    {
        char c = postfix[i];

        if (isOperator(c))
        {
            char op1 = pop();
            char op2 = pop();
            char temp[MAX_SIZE];
            sprintf(temp, "(%c%c%c)", op2, c, op1);
            strcat(infix, temp);
            push(temp[0]);
        }
        else
        {
            char temp[2] = {c, '\0'};
            push(c);
            strcat(infix, temp);
        }
    }

    printf("Infix expression: %s\n", infix);
}

int main()
{
    char postfix[MAX_SIZE];
    printf("Enter a postfix expression: ");
    scanf("%s", postfix);

    convertPostfixToInfix(postfix);

    return 0;
}