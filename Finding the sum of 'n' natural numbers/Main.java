import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = fac(n);
      System.out.println(x);
    }
 public static int fac(int u)
 {
   if(u==0)
     return 0;
   else
     return u+fac(u-1);
    }
}