import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    StringBuffer sb = new StringBuffer("");
    for(int i =0; i<str.length();i++){
      char ch = str.charAt(i);
      if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
      {//type your code here
        sb.append(ch);}
  }System.out.println(sb);
}
    }