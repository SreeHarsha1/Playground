import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
     int n1= in.nextInt();
    
      int total=1;
      switch(n1)
      {
        case 1:
          int n2 = in.nextInt();
          total=n2*n2;
          System.out.print(total);
          break;
        case 2:
          int n4 = in.nextInt();
          int n3 = in.nextInt();
          total = n4*n3;
          System.out.print(total);
            break;
        case 3:
        int n5 = in.nextInt();
          int n7 = in.nextInt(); 
          total=n5*n7/2;
            System.out.print(total);
          break;
        case 4:
           int n6 = in.nextInt();
        double  t=3.14*n6*n6;
          System.out.print(t);
          break;
      }
    
      }
    }
