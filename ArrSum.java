import java.util.*;
public class ArrSum
{
    public static void main(String[] args)
    { 
        int b=0,c=0,sum=0;
        int max=-9999;
        int min=9999;
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a[]=new int[a1];
        System.out.println("Enter Array elements");
        for(int i=0;i<a1;i++)
        {
          a[i]=sc.nextInt();
        }
        for(int i=0;i<a1;i++)
        {
          if(a[i]>max)
          {
              max=a[i];
          }
          if(a[i]<min)
          {
              min=a[i];
          }
          b=b+a[i];
        }
        c=max+min;
        sum=b-c;
        System.out.println("Sum is "+sum);
    }
}