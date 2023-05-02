/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a;
		int p=s.nextInt();
		int m=n-p;
		if(p<m)
		    a=p/2;
		else 
		{
		    if(m%2==0)
		    {
		       a=m/2; 
		    }
		    else{
		        a=(m/2)+1;
		    }
		    
		}
		
		System.out.println(a);
	}
}
