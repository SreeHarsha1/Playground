import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = fac(n);
    System.out.print(x); 
    
  }
  public static int fac(int k)
  {
   if(k==0)
    return 1;
    else
      return k*fac(k-1);
  }}
  
