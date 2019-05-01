import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int n = 1,total=1;
      while(n<=exponent)
      { 
        total=total*base;
        n++;
      }  System.out.print(total);//Try your logic here
    }

}