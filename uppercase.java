import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	String n;
	int c=0,i=0;
	Scanner s=new Scanner(System.in);
	n=s.nextLine();
	int m=n.length();
	while(i<m)
	{
	    char ch=n.charAt(i);
	    if(Character.isUpperCase(ch))
	    {
	        c++;
	    }
	    i++;
	}
	
	System.out.println(c);
	
	}
}
