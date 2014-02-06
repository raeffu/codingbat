package codingbat.string2;

/*
 * Given a string, consider the prefix string made of the first N chars 
 * of the string. Does that prefix string appear somewhere else in the string? 
 * Assume that the string is not empty and that N is in the range 
 * 1..str.length(). 
 * 
 * prefixAgain("abXYabc", 1) = true
 * prefixAgain("abXYabc", 2) = true
 * prefixAgain("abXYabc", 3) = false
 * 
 */

public class PrefixAgainTest {

  public static void main(String[] args) {

    PrefixAgainTest test = new PrefixAgainTest();

    System.out.println(">" + test.prefixAgain("abXYabc", 1) + "<");
    System.out.println(">" + test.prefixAgain("abXYabc", 2) + "<");
    System.out.println(">" + test.prefixAgain("abXYabc", 3) + "<");  
  }

  public boolean prefixAgain(String str, int n) {
    String test = "";
    String prefix = str.substring(0, n);
    
    for(int i=n; i<=str.length()-n; i++){
      test = str.substring(i, i+n);
      
      if(prefix.equals(test))
        return true;
    }
    return false;
  }

}
