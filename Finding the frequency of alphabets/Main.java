import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1=in.nextLine();
      String str = str1.toLowerCase();
      int ch[] = new int[26];
      for(int i=0;i<=25;i++)
      {
        ch[i]=0;
      }
      for(int i=0;i<str.length();i++)
      {
           if(str.charAt(i)>='a'&&str.charAt(i)<='z')
      {
        int o = str.charAt(i)+1-'a';
        ch[o]++;
        
      }
        }
         for(int i=0;i<str.length();i++)
      {
      
      if(str.charAt(i)>='a'&&str.charAt(i)<='z')
      {
        int o = str.charAt(i)+1-'a';
           
        ch[o]++;
        if(ch[o]!=1)
        {
        System.out.print(str.charAt(i));
     System.out.print(ch[o]-1+" ");
        ch[o]=0;}
      }}
       
        // Type your code here
    
}}

