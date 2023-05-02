import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n;
		n=s.nextLine();
		int m=n.length();
		int c=0;
		for(int i=0;i<m;i++)
		{
		    if(Character.isLowerCase(n.charAt(i)))
		    {
		        c++;
		    }
		}
		System.out.println(c);
	}
}
