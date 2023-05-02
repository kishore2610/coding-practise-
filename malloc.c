#include <stdio.h>
struct node
{
    int data;
    struct node *next;
}*head=NULL,*tail=NULL,*n,*t,*tp;
void main()
{
   int num=10;
   n=(struct node *)malloc(sizeof(struct node));
   n->next=NULL;
   n->data=num;
   if(head==NULL)
   {
       head=n;
       tail=n;
   }
   else
   {
       n->next=head;
       head=n;
   }
   printf("%d",n);
}
