package codingbat.recursion1;

/*
 * Given n of 1 or more, return the factorial of n, 
 * which is n * (n-1) * (n-2) ... 1. 
 * Compute the result recursively (without loops). 
 * 
 * factorial(1) = 1
 * factorial(2) = 2
 * factorial(3) = 6
 */

public class FactorialTest {
  
  public static void main(String[] args) {
    FactorialTest test = new FactorialTest();

    System.out.println(">" + test.factorial(1) + "<");
    System.out.println(">" + test.factorial(2) + "<");
    System.out.println(">" + test.factorial(3) + "<");
    System.out.println(">" + test.factorial(13) + "<");
  }

  public int factorial(int n) {
    if (n==1) return 1;
    
    return n*factorial(n-1);
  }

}
