import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      char a='#';
      for(int i=1;i<=n1;i++)
      {
        for(int j=1;j<=i;j++)
        {
     if(a=='*')
       a='#';
          else
             if(a=='#')
       a='*';
          System.out.print(a);
          
            
        }
        System.out.println();
      }
  		// Type your code here
    }
}