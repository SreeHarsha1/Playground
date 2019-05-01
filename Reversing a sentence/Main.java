import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      char ch[] = new char[50];
     
      int k=0,j=0,count=0;
      for(int i=str.length()-1;i>=0;i--)
      {
      int  v = str.charAt(i);
        if(v ==32)
        {
          for(k=count-1;k>=0;k--)
          {
            System.out.print(ch[k]);
          }
          System.out.print(" ");
          j=0;
          count=0;
        }
        else
      {
      ch[count] = str.charAt(i);
        
           j++;
        count++;
      }
     
      
        // Type your code here
    }
      if(count==1)
        System.out.print(str.charAt(0));
    // Function to reverse a string
  
}}