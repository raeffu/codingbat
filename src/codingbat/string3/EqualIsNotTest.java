package codingbat.string3;

/*
 * Given a string, return true if the number of appearances of "is" anywhere 
 * in the string is equal to the number of appearances of "not" anywhere 
 * in the string (case sensitive). 
 * 
 * equalIsNot("This is not") = false
 * equalIsNot("This is notnot") = true
 * equalIsNot("noisxxnotyynotxisi") = true 
 * 
 */

public class EqualIsNotTest {

  public static void main(String[] args) {
    EqualIsNotTest test = new EqualIsNotTest();

    System.out.println(">" + test.equalIsNot("This is not") + "<");
    System.out.println(">" + test.equalIsNot("This is notnot") + "<");
    System.out.println(">" + test.equalIsNot("noisxxnotyynotxisi") + "<");
  }

  public boolean equalIsNot(String str) {
    int is = 0;
    int not = 0;
    
    for (int i = 0; i < str.length()-1; i++) {
      String teststring = str.substring(i, i+2);
      
      if (teststring.equals("is")) {
        is += 1;
      }
    }
    
    for (int i = 0; i < str.length()-2; i++) {
      String teststring = str.substring(i, i+3);
      
      if (teststring.equals("not")) {
        not += 1;
      }
    }
    
    return is == not;
  }

}
