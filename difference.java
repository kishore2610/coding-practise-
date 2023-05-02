/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a[]=new int[10];
	    int n=s.nextInt();
	    int x=s.nextInt();
	    int d,c=0;
	    for(int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	       for(int j=i+1;j<n;j++)
	       {
	           d=a[j]-a[i];
	           if(Math.abs(d)==x)
	             c++;
	       }
	    }
		System.out.println(c);
	}
}
