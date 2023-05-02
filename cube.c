/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>


void main()
{
	int i,num=126,s;
	for(i=2;i<=num/2;i++)
	{
	    if((i*i*i)==num)
		{
			s=i*i*i;
		}
	}
	if(s==num)
	{
    	printf("%d is perfect cube",num);
	} 	
	else
	{
	   printf("%d is not perfect cube",num);
	} 
   
}

