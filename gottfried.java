import java.util.Scanner;
public class Main{  
public static void main(String args[])
{  
    int n;
    int a[]=new int[100000];
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        String t=Integer.toBinaryString(a[i]);
        int n1=t.length();
        char c=t.charAt(n1-1);
        if(c=='0')
           System.out.println("Yes");
        else
           System.out.println("No");
    }
    
}} 