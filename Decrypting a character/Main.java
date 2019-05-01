import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
        char ch =in.next().charAt(0);
      int key=in.nextInt();
      char ch1='a';
     for(int i=0;i<key;i++)
     {
        if(ch=='a')
        {
        ch='z';   
          ch= (char)(ch+1);
        }
       ch1=(char) (ch-1);
            ch=ch1;    
         // Type your code here
    }
       System.out.print(ch1);
}
}