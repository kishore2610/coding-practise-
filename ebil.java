import java.util.Scanner;
class Main
{
 static int consumerno,pmr,cmr,type;
 static String consumername;
 //pmr = Previous month reading  cmr = Current month reading   type = type of connection(i.e domestic or commercial)

 public static void details()
 {
   Scanner scan = new Scanner(System.in);
   System.out.print("\nEnter the consumer no  ::: ");
   consumerno = scan.nextInt();
   System.out.print("\nEnter the consumer name  ::: ");
   consumername = scan.next();
   System.out.print("\nEnter the previos month reading  ::: ");
   pmr = scan.nextInt();
   System.out.print("\n Enter the current month reading  ::: ");
   cmr = scan.nextInt();
 }
 public static void domestic()
 {
  double total = 0;
  System.out.print("\n\nYou are a Domestic user");
  if(cmr <= 100)
  {
   System.out.print("\n\nYour Electricity Bill ::: "+cmr);
   return;
  }
  if(cmr>100)
  {
   cmr = cmr -100;
   total = total + 100 * 1;
   if(cmr>100)
   {
     cmr = cmr -100;
     total = total + (100 * 2.5) ;
     if(cmr>300)
     {
      cmr = cmr - 300;
      total = total + 300 * 4;
      total = total + cmr * 6;
     }
     else
     {
      total = total + cmr * 4;
     }
   }
   else
   {
    total = total + cmr * 2.5;
   }
  }
  System.out.print("\nYour Electricity Bill ::: "+total+" Rupees");
 }
  public static void commercial()
 {
  double total = 0;
  System.out.print("\nYou are a Commercial user ");
  if(cmr <= 100)
  {
   System.out.print("\nYour Electricity Bill ::: "+cmr*2);
   return;
  }
  if(cmr>100)
  {
   cmr = cmr -100;
   total = total + 100 * 2;
   if(cmr>100)
   {
       cmr = cmr -100;
     total = total + (100 * 4.5) ;
     if(cmr>300)
     {
      cmr = cmr - 300;
      total = total + 300 * 6;
      total = total + cmr * 7;
     }
     else
     {
      total = total + cmr * 6;
     }
   }
   else
   {
    total = total + cmr * 4.5;
   }
  }
  System.out.print("\nYour Electricity Bill ::: "+total+" Rupees");
 }
  public static void main(String args[])
 {
  int ch,c;
  int r = 1;
  Scanner scan = new Scanner(System.in);
   while(r == 1)
   {
    System.out.print("\n\n			 Electricity bill generation");
    System.out.print("\n Please enter your choice");
    System.out.print("\n1.Generate electricity bill\n2.exit  ::: "); 
    c = scan.nextInt();
      switch(c)
    {
      case 1:
             details();
             System.out.print("\nSelect your EB connection");
             System.out.print("\n1.Domestic\n2.Commercial  ::: ");
             ch = scan.nextInt();
  
             if(ch == 1)
             {
              domestic();
             }
             else if(ch == 2)
             {
              commercial();
             }
             else
             {
              System.out.print("Enter the correct details");
             }
             break;
      case 2:
             r = 0;
             break;
      default:
             System.out.print("Enter the correct choice"); 
     }
    } }}
