import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[30];
		int n1=1,n2=1,n3,i,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n==1||n==2)
		{
		    System.out.println("1");  
		}
       else{ for(i=2;i<n;++i)   
        {    
          n3=n1+n2;    
          a[i]=n3;
          n1=n2;    
          n2=n3;    
        } 
        System.out.println(a[n-1]);  
       }
	}
}
