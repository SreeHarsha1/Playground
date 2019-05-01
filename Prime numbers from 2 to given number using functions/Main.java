import java.util.Scanner;
 class Main {
     public static void main(String[] args) {
        
          Scanner s = new Scanner(System.in);
          int limit = s.nextInt();
          for (int i = 2; i <=limit; i++) {
               if (primes(i, i - 1) == 1) {
                    System.out.println(i );
               } 
                    
               
          }
     }

     private static int primes(int x, int i) {
          if (i == 1) {
               return 1;
          }
          try {
               if (x % i == 0) {
                    return 0;
               } else {
                    return primes(x, i - 1);
               }
          } catch (Exception e) {
               return 1;
          }
     }
}