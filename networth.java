import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,m,sum=0;
		n=s.nextInt();
		int a[]=new int[1000];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    sum=sum+a[i];
		}
		System.out.println(sum);
	    
	}
}
