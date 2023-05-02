/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void main()
{
    int num,fact=1,i=1;
    printf("enter a number:");
    scanf("%d",&num);
    if(num>0)
    {
    while(i<=num)
    {
        fact=fact*i;
        i++;
    }
    printf("the factorial of number a given number is %d",fact);
    }
    else
    {
        printf("the factorial of %d is 1",num);
    }
    
}
