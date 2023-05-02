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
	    double amo,emi1,emi2;
	    double year,inte1,inte2;
	    amo=s.nextInt();
	    year=s.nextInt();
	    inte1=s.nextInt();
	    inte2=s.nextInt();
	    
	    emi1=amo*inte1/(1-1/Math.pow((1+inte1),(year*12)));
	    emi2=amo*inte2/(1-1/Math.pow((1+inte2),(year*12)));
	    System.out.println(emi1);
	    System.out.println(emi2);
	    if(emi1<emi2)
	        System.out.println("bankA");
	    else 
	        System.out.println("bankB");
	    
		
	}
}
