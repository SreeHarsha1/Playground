import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String str= in.nextLine();
      int l =str.length()-1;
       
      char first =  str.charAt(0);
      char last=str.charAt(l);
        for(int i=0;i<str.length()/2;i++)
        {
          if(first==last)
          {
            first=str.charAt(++i);
            last=str.charAt(--l);
            if(i==str.length()/2);
             System.out.println("Yes");
            }
          
          else
          {
            System.out.println("No");
            break;
          }// Type your code here
    } }}
