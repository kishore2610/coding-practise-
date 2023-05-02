/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
void main()
{
    int i,j,a[20],count=0,n,max,modevalue=0;
    printf("enter number of elements\n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("the number of elements are\n");
    for(i=0;i<n;i++)
    {
        printf("%d\n",a[i]);
    }
    for(i=0;i<n;i++)
    {
       for(j=i+1;j<n;j++) 
       {
           if(a[i]==a[j])
           {
               count++;
           }
       }
       if(count>modevalue)
       {
           max=a[i];
           modevalue=count;
       }
    }
    printf("the modevalue is\n");
    printf("%d",max);
  
}


