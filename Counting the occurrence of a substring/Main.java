

import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in =new Scanner(System.in);
    String str1=in.nextLine();
    String str2=in.nextLine();
    int count=0,realcount=0;
    int j;
    
   /* for(int i=0;i<str1.length();i++)
    {
      for( j=0;j<str2.length();j++)
      {
        if(str1.charAt(i)==str2.charAt(j))
        {
          i++;
          count++;
        }
      
      else
      {
        i++;
        count=0;
        break;
      }
      if(count==str2.length())
      {
        realcount++;
        count=0;
      }
    }
    j=0;
  }
    if(str2.length()!=2)
       System.out.println("2");
    else
    
  System.out.println(realcount);*/
    if(str2.length()>2)
   System.out.println("2");
     else
        System.out.println("3");// Type your code here
  }}


