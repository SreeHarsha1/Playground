import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=n;j>=i;j--)
        {
          System.out.print(m);
          m--;
        }  
       m=n-i;
          System.out.println();
      }
	}
}