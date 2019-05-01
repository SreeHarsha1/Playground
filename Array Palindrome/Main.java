import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      
      int count=0;
    int y=n-1;
        for(int i=0;i<n;i++)
        {
          if(arr[y]==arr[i])
             count++;
          y--;
             }
        
        // Type your code here
    
      if(count==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}