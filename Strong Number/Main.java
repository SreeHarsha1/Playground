import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       int n1=n;
      int d=0;
      int n2=n;
      int count=0,t=0;
      int fact=1,i;
      while(n1!=0)
      {
         count++;
        n1=n1/10;
      }
      for(int j=1;j<=count;j++)
      {
        d=n2%10;
        n2=n2/10;
        
       for(int k=1;k<=d;k++)
       {
         fact=fact*k;
      }
       
      
        t=t+fact;
        fact=1;
        
      } if(n==t)
      {
         System.out.println("Yes");
      }
      else
     
      System.out.println("No");
	}
}
	    // Type your code here
