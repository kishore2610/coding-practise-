import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
	{
int m, sum=0;
String n;
int a[]=new int[100]; 
Scanner s=new Scanner(System.in);
n=s.nextLine();
m=n.length();
int x=Integer.parseInt(n);
int y=x;
for(int i=0;i<m;i++) 
{
a[i]=x%10;
x=x/10;
} 
for(int i=0;i<m;i++)
{
sum= (int)(sum+Math.pow(a[i],m));
}
if(y==sum)
{
  System.out.println("YES");
 
}
else
{
System.out.println("NO");
}
}
}