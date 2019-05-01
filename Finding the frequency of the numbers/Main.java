import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	 Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
       int n1 = sc.nextInt();
    int arr[] = new int[n];
    for(int idx = 0; idx <= n - 1; idx++){
      arr[idx] = sc.nextInt();
    }
      int count=0;
   
      for(int i=1;i<=n1;i++)
      {
        for(int j=0;j<n;j++)
        {
         if(i==arr[j])
           count++;
        }System.out.println(i+" "+count);
        count=0;
      }
    }
}