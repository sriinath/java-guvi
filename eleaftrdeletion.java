import java.util.*;
public class registernumber
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int x=s.nextInt();
    int i=0;
    while(n!=0)
        {
        a[i++]=n%10;
        n=n/10;
    }
    for(int j=0;j<i;j++)
        {
        for(int k=0;k<i;k++)
            {
            if(a[j]<a[k])
                {
                int temp=a[j];
                a[j]=a[k];
                a[k]=temp;
            }
        }
    }
    for(int j=0;j<i-x;j++)
        {
        System.out.print(a[j]);
    }
}
}
