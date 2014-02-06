package codingbat.logic2;

/*
 * Given three ints, a b c, one of them is small, one is medium and one is 
 * large. Return true if the three values are evenly spaced, so the difference 
 * between small and medium is the same as the difference between medium and 
 * large. 
 * 
 * evenlySpaced(2, 4, 6) = true
 * evenlySpaced(4, 6, 2) = true
 * evenlySpaced(4, 6, 3) = false
 * 
 */

public class EvenlySpacedTest {

  public static void main(String[] args) {
    EvenlySpacedTest test = new EvenlySpacedTest();

    System.out.println(">" + test.evenlySpaced(2, 4, 6) + "<");
    System.out.println(">" + test.evenlySpaced(4, 6, 2) + "<");
    System.out.println(">" + test.evenlySpaced(4, 6, 3) + "<");
  }

  public boolean evenlySpaced(int a, int b, int c) {
    int max = Math.max(a, b);
    int large = Math.max(c, max);
    
    int min = Math.min(a,b);
    int small = Math.min(c, min);
    
    int medium = 0;
    
    if(a == small){
      if(b==large) medium = c;
      else medium = b;
    }
    else if(b == small) {
      if(a==large) medium = c;
      else medium = a;
    }
    else {
      if(a==large) medium = b;
      else medium = a;
    }
    
    int ab = medium-small;
    int bc = large-medium;
    
    if(ab == bc) return true;
    
    return false;
  }

}
