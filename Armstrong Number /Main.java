import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
           Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=n;
      int d;
      int n2=n;
      int count=0,t=0;
      while(n1!=0)
      {
         count++;
        n1=n1/10;
      }
      for(int j=1;j<=count;j++)
      {
        d=n2%10;
        n2=n2/10;
       
        t += Math.pow(d,count);
      }
      if(n==t)
      {
         System.out.println("Armstrong Number");
      }
      else
     
      System.out.println("Not a Armstrong Number");
	}
}