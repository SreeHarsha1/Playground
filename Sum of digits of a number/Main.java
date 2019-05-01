import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
     int count=0;
      int n,f=0,d=1,l,t=0;
      n=n1;
    /*  while(n1!=0)
      {
        n1=n1/10;
        count++;
        
      }
   */   while(n!=0)
      {
        f=n%10;
        n=n/10;
        t=t+f;
      }
      System.out.println(t);
    }
}