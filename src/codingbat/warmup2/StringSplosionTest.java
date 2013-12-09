package codingbat.warmup2;

/*
 * Given a non-empty string like "Code" return a string like "CCoCodCode". 
 * 
 * stringSplosion("Code") = "CCoCodCode"
 * stringSplosion("abc") = "aababc"
 * stringSplosion("ab") = "aab"
 */

public class StringSplosionTest {

  public static void main(String[] args) {

    StringSplosionTest test = new StringSplosionTest();

    System.out.println(">" + test.stringSplosion("Code") + "<");
    System.out.println(">" + test.stringSplosion("abc") + "<");
    System.out.println(">" + test.stringSplosion("ab") + "<");
  }

  public String stringSplosion(String str) {
    String result = "";
    
    for(int i=0; i<str.length(); i++){
      result += str.substring(0, i);
    }
    
    return result + str;
  }

}
