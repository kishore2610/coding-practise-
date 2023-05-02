import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[10];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		    b[a[i]]++;
		}
		int c=0;
		for(int i=0;i<10;i++)
		{
		    c+=b[i]/2;
		}
		System.out.println(c);
		
	}
}