import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int n = str.length();
    //System.out.println(str.charAt(n/2));
    int h=n/2;
    int f=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
    for(int j=i;j<n-1;j++)
    {
      System.out.print(" ");
    }
    for(int k=0;k<=i;k++)
    {
      if(h==(n)){
         h=0;
      }
      else{
      System.out.print(str.charAt(h));
        count++;
       }h++;
     //System.out.print(i);
      if(h==n&&i!=n/2){System.out.print(str.charAt(f));
                 }
    }h=n/2;
     // System.out.print(n);
      System.out.println();
    }
  }
}

