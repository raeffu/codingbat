package codingbat.warmup1;

/* Return true if the given non-negative number is a multiple of 3 or 
 * a multiple of 5. Use the % "mod" operator -- see Introduction to Mod 
 * 
 * or35(3) = true
 * or35(10) = true
 * or35(8) = false  
*/

public class Or35Test {

  public static void main(String[] args) {

    Or35Test test = new Or35Test();

    System.out.println(">" + test.or35(3) + "<");
    System.out.println(">" + test.or35(10) + "<");
    System.out.println(">" + test.or35(8) + "<");
  }

  public boolean or35(int n) {
    return n%3 == 0 || n%5 == 0;
  }

}
