import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
     int count=0;
      int n,f,d=1,l,t;
      n=n1;
      while(n1!=0)
      {
        n1=n1/10;
        count++;
        
      }
      while(count-2!=0)
      {
        d=d*10;
      count--;
      }
      f=n/d;
      t=f%10;
      System.out.println(t);
    }
}