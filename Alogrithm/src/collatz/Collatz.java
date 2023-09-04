package collatz;


import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        test tt = new test();
        tt.algo();
    }
}

class test {
   

  void algo() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
      
        while (n!=1) {
        	System.out.print(n+"\t");
            if (n % 2 == 0) {
                 n /= 2;
            } else {
            	if (n == 9223372036854775807L) {
                    System.out.println("Input too large to handle.");
                    return;
                }
                n = 3*n+1;
            }
          
            sc.close();
        }
       
     
        System.out.println(1);
        
        
    }
}
