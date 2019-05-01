import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      for(int i=0;i<n;i++)
      {
        
        for(int j=1;j<n;j++)
        {
          if(i<j)
          {
          if(arr[i]+arr[j]==value)
            System.out.println(arr[i]+", "+arr[j]);
          }
        
      // Type your code here
    }
}
}
}