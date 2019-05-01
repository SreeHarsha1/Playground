import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      for(int i=0;;i++)
      {
        if(i%2==1&&count!=n)
        {
          System.out.println(i);
          count++;
        }
	}
}
}