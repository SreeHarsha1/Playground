import java.util.Scanner;
class Main{
 
       // Type your code here
      public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
      int arr2[]=new int[n];
    
        int g=0,f=0;
       for(int i=0;i<n;i++)
    {
         if(arr[i]==0)
           g++;
         else
         {
      arr2[f]=arr[i];
           f++;
         }
    }
         for(int i=0;i<f;i++)
    {
      System.out.print(arr2[i]+" ");
    }
        for(int i=0;i<n-f;i++)
          System.out.print("0"+" ");
      }
    }


        
         
        
