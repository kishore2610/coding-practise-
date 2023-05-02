import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String n;
		long d[]=new long[10000000];
		int m,l;
		Scanner s=new Scanner(System.in);
		n=s.nextLine();
		m=n.length();
		while(true)
		{
		if(m%3!=0)
		{
		    char a='0';
		    n=a+n;
		    l=n.length();
		    m=l;
		}
		else{
		    break;
		}
		}
	    Long o=Long.parseLong(n);
		for(int i=0;i<m/3;i++)
		{
		    Long y=o%1000;
		    o=o/1000;
		    String s1=Long.toString(y);
		    int j=Integer.parseInt(s1,2);
		    d[i]=j;
		}
			for(int i=(m/3)-1;i>=0;i--)
			{
			    System.out.print(d[i]);
			}

	}
}
