import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s =in.nextLine();
    s=s+" ";
    StringBuilder sb = new StringBuilder(s);
     StringBuilder sb1 = new StringBuilder("");
    //your code here;
    int j=0;
    for(int i=0;i<s.length();i++)
    {
      if(sb.charAt(i)==' ')
      {
        sb1.append(sb.charAt(i));
        for(int k=i-1;k>=j;k--)
          System.out.print(sb1.charAt(k));
        System.out.print(" ");
        j=i+1;
      }
      else
      {
        sb1.append(sb.charAt(i));
      }
    }
  }
}
        
  
