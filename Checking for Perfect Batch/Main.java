import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    sos(arr,n);
  }
  public static void sos(int arr[],int n)
  {
    int a1=0,a2=0;
    if(n%2==0)
    {
    for(int i=0;i<n/2;i++)
    {
      a1=a1+arr[i];
    }
    for(int i=n/2;i<n;i++)
    {
      a2=a2+arr[i];
    }
    }
    else
    {
       for(int i=0;i<n/2;i++)
    {
      a1=a1+arr[i];
    }
    for(int i=(n/2)+1;i<n;i++)
    {
      a2=a2+arr[i];
    }
    }
    if(a1==a2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}
