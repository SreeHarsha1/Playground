import java.util.Scanner;
public class Main
{
  public static int fun(int m1,int m2,int m3)
{
  int s,i,g,h;
  if(m1<m2&&m2<m3)
    s=m1;
  else if(m2<m3)
    s=m2;
  else
    s=m3;

  for( i=1;i<s;i++)
  {
    if(m1%i==0&&m2%i==0&&m3%i==0)
    {
   h=i;
    }
  }
 return i;
}
	public static void main (String[] args)
	{
      Scanner in = new Scanner(System.in);
      
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int r=fun(n1,n2,n3);
      System.out.println(r);
	    // Type your code here
	}
}