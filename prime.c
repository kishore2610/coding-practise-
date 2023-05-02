/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

void main()
{
   int n,num,rem,sum=0;
   printf("enter the number:");
   scanf("%d",&num);
   n=num;
   while(num>0)
   {
       rem=num%10;
       sum=sum*10+rem;
       num=num/10;
   }
   if(sum==n)
   {
       printf("%d number is palindrome",n);
   }
   else
   {
       printf("%d number is not palindrome",n);
   }
}


