
#include <stdio.h>

void main()
{
   int n,t,j,c=0;
   scanf("%d",&n);
   int a[n];
   for(int i=0;i<n;i++)
   {
       scanf("%d",&a[i]);
   }
   for(int i=1;i<n;i++)
   {
       t=a[i];
       j=i-1;
       if(j>=0&&t<a[j])
       {
       while(j>=0&&t<a[j])
       {
           a[j+1]=a[j];
           j--;
       }
       }
       else
       {
           c++;
       }
       a[j+1]=t;
   }
   printf("%d",c);
}
