/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
void main()
{
    float a[10][3];
    float bmi;
    int n;  
    printf("enter no of persons:");
    scanf("%d",&n);
 for (int i=0;i<n;i++)
 {
      printf("enter the hieght  and weight of person %d\n",i+1);
     for (int j=0;j<2;j++)
     {
      scanf("%f",&a[i][j]);
     }
 }
 for(int i=0;i<n;i++)
 {
     bmi=a[i][1]/((a[i][0])*(a[i][0]));
     a[i][2]=bmi;
     
 }
 printf("height\t\tweight\t\tBmi\n ");
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<3;j++)
     {
         printf("%f\t",a[i][j]);
         
     }
     printf("\n");
 }
}






