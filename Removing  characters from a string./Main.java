import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int n1 = str1.length();
    int n2 = str2.length();
    int count=0,j=0;
    for(int i=0;i<n1;i++)
    {
      for(j=0;j<n2;j++)
      {
        if(str1.charAt(i)==str2.charAt(j))
        {
          count++;
       //   System.out.print(count);
        }
      }
        if(count==0)
          System.out.print(str1.charAt(i));
        else
          count=0;
    }
    
  }
}