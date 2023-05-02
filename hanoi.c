/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include<stdio.h>
void hanoi(int n,char f,char t,char a);
void hanoi(int n,char f,char t,char a)
{
	if(n==1)
	{
		printf("Move disc 1 from pole %c to pole %c\n",f,t);
		return;
	}
	hanoi(n-1,f,a,t);
	printf("Move disc %d from pole %c to pole %c\n",n,f,t);
	hanoi(n-1,a,t,f);
}
void main()
{
	int n=3;
	hanoi(n,'A','C','B');
}


