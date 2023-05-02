import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,m,l;
		n=s.nextInt();
		m=s.nextInt();
	    l=(int)(m%(Math.pow(2,n)));	
	    System.out.println(l);
	}
}

