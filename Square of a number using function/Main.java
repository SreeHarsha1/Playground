import java.util.Scanner;

class Main
{
  public static int fun(int n)
  {
    int s1;
    s1=n*n;
    return s1;
  }	public static void main (String[] args)
    {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int s2=fun(n);
    System.out.println(s2);
	 // Type your code here   
	} 
}