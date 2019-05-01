import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n0 = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
      if((n0>n1)&&(n0>n2))
      {
        System.out.println(n0);
      }
        else if(n1>n2)
        {
              System.out.println(n1);
        }
        else
        {
           System.out.println(n2);
        }
          
		// Type your code here
    }
}
