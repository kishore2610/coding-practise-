import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,t,mid;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		mid=n/2;
		for(int i=0;i<mid;i++)
		{
		    for(int j=i+1;j<mid;j++)
		    {
		        if(a[i]>a[j])
		        {
		            t=a[i];
		            a[i]=a[j];
		            a[j]=t;
		        }
		    }
		}
		for(int i=mid;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]<a[j])
		        {
		            t=a[i];
		            a[i]=a[j];
		            a[j]=t;
		        }
		    }
		}
      for(int i=0;i<n;i++)
      {
          System.out.print(a[i]+" ");
      }
	}
}
