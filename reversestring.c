/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

#include<stdio.h>
#include<ctype.h>
#include<string.h>
void main()
{
char s[20],t;
int n,r;
printf("enter the string:");
scanf("%s",s);
n=0; 
r=strlen(s)-1;
while(n<=r)
{
if(isalpha(s[n]))
{
  if(isalpha(s[r]))
   {
      t=s[n];
      s[n]=s[r];
      s[r]=t;
      n++;
      r--;
   }
   else
   {
      r=r-1;
   }
}
else
{
   n=n+1;
}
}
printf("the reversed string is %s",s);
}

