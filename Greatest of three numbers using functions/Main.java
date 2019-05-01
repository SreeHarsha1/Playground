import java.util.Scanner;
class Main{
  public static int fun(int m1,int m2,int m3)
  {
    if(m1>m2&&m1>m3)
      return m1;
    else if(m2>m3)
      return m2;
    else
      return m3;
  }
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int x = fun(n1,n2,n3);
      System.out.println(x);
    }
}
	    // Type your code here
	