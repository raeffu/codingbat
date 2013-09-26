package codingbat.warmup1;

//Given a string, return a new string where the first and last chars have been exchanged. 
//
//frontBack("code") = "eodc"
//frontBack("a") = "a"
//frontBack("ab") = "ba"

public class FrontBackTest {

  public static void main(String[] args) {

    FrontBackTest test = new FrontBackTest();

    System.out.println(">" + test.frontBack("code") + "<");
    System.out.println(">" + test.frontBack("a") + "<");
    System.out.println(">" + test.frontBack("ab") + "<");
  }

  public String frontBack(String str) {
    if (str.length() > 0) {
      char[] strChars = str.toCharArray();
      char first = strChars[0];
      strChars[0] = strChars[strChars.length - 1];
      strChars[strChars.length - 1] = first;
      String result = new String(strChars);
      return result;
    }
    else {
      return str;
    }
  }

}
