import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   int a[][]=new int[10][10];
   int n,m,c=0;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   m=s.nextInt();
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<m;j++)
       {
           if(i*i+j==n&&i+j*j==m)
           {
               c++;
           }
       }
   }
   System.out.println(c);
  }
}