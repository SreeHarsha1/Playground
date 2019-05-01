import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
 
      for(int i=0;i<str2.length();i++)
      {
      if(str2.charAt(i)==32)
        System.out.println();
        else
        System.out.print(str2.charAt(i));
        
      
    }}
}