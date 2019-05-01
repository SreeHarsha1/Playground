import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
       int s1 = in.nextInt();
       int s2 = in.nextInt();
      int count=0;
      for(int j=0;j<n;j++)
      {
        if(arr[j]==s1)
        {
          System.out.println(j);   
        count++;
        }
        if(arr[j]==s2)
        {
          System.out.println(j);   
        count++;
        }
      }
      if(count!=2)
         System.out.println("-1"); 
        
      
      
        // Type your code here
    }
}
