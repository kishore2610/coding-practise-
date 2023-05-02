#include<stdio.h>
void sort(int *a,int n);
void sort(int *a,int n)
{
int i,j,temp;
for(i=0;i<n-1;i++)
{
 for(j=i+1;j<n;j++)
  {
    if(a[i]>a[j])
     {
       temp=a[i];
       a[i]=a[j];
       a[j]=temp;
     }
  }
}
}
void main()
{
int n;
int i;
int a[10];
printf("Enter the number of values:");
scanf("%d",&n);
printf("Enter the array elements\n");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
printf("\nBefore sorting\n");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
printf("\nAfter sorting\n");
sort(a,n);
for(i=0;i<n;i++)
printf("%d\t",a[i]);
}