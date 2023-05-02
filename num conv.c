/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

void main()
{
	int i,flag=1,num=6;
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			flag=0;
		}
	}
	if(flag)
	{
	    printf("%d is prime number",num);
	}
	else
	{
	    printf("%d is not a prime number",num);
	}
}
