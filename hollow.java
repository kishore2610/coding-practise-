import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
    {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
        for(i=1;i<n-1;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0||j==n-1)
                {
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                   
            }
            System.out.println("");
        }
        for(i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
}

