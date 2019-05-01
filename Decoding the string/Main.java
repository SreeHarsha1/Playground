import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int n = in.nextInt();
    for(int index = 0; index < str.length(); index++)
     {
       char ch = str.charAt(index);
       if(ch >= 'A' && ch <= 'Z')
       {
           int offset = ch - 'A';
           offset = (offset - n) ;
           ch = (char)(offset + 'A');
       }
       else if(ch >= 'a' && ch <= 'z')
       {
           int offset = ch - 'a';
           offset = (offset - n) ;
           ch = (char)(offset + 'a');
       }
      if(ch==']')
        ch='w';
      System.out.print(ch);
       
     }   
    // Type your code here
  }
}