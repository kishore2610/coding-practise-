import java.util.Scanner;

import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0,res=0;
		int bi[]=new int[10];
		while(n>0)
		{
		    bi[i]=n%2;
		    n=n/2;
		    i++;
		}
		for(int j=i-1;j>=0;j--){
		    System.out.print(bi[j]);
		}
	    for(int j=i-1;j>=0;j--){
	        if(bi[j]==0)
	           bi[j]=1;
	        else
	           bi[j]=0;
	    }
	    System.out.println("");
	    	for(int j=i-1;j>=0;j--){
		    System.out.print(bi[j]);
		}
		System.out.println("");
		for(int j=i-1;j>=0;j--){
		    
		    if(bi[j]==1)
		    {
		        res+=Math.pow(2, j);
		    }
		}
	   System.out.println(res);
	}
}
