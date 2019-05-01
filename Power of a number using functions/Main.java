import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static int fun(int n1, int n2)
  {
    int n3=1;
    for( int i=1;i<=n2;i++)
    {
    n3=n3*n1;
    }
    return n3;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n4 = in.nextInt();
    int o = fun(n,n4);
    System.out.println(o);
  }
}