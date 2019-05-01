import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       
int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
     int n=0,max=0;
         for(int i=0;i<arr_size;i++)
         {
           if(arr[i]==1)
             n++;
           else
           {
         max=n; 
          if(max<n){
           max=n;
         n=0;}}
       }
           
       System.out.print(max);
   }
}