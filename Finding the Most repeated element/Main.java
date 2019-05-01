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
       }int max1=0,max2=0,count=0;
     for(int i=0;i<arr_size;i++)
     {
       for(int j=i+1;j<arr_size;j++)
       {
         if(arr[i]==arr[j])
         {
           count++;
         }}
       if( i==0){
       max1=count;
       max2=arr[i];}
       else if(max1<count)
         max2=arr[i];
       max1=count;
        }
       System.out.println(max2);}}