import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter a positive or negative no:");
		Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
		if(a>=0)
		{
		    System.out.println("given no is positive");
		}
		else
{
    System.out.println("given no is negative");
}
	}
}
