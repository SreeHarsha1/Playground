import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      if(n%400==0)
      {
        System.out.println("Leap year");
      }
      else
      {
        System.out.println("Non Leap year");
      }
		// Type your code here
    }
}