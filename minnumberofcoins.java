import java.util.*;
public class registernumber
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
    int x=n;
    int count=0;
    while(sum<n)
        {
        count++;
        if(x>=5)
            {
            sum=sum+5;
            x=x-5;
        }
        else if(x>=3)
            {
            sum=sum+3;
            x=x-3;
        }
        else 
            {
            sum=sum+1;
            x=x-1;
        }
    }
    if(sum==n)
        System.out.println(count);
    else
        System.out.println("Not Possible");
}
}
