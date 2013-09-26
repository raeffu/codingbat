package codingbat.warmup1;

//Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 
//
//missingChar("kitten", 1) = "ktten"
//missingChar("kitten", 0) = "itten"
//missingChar("kitten", 4) = "kittn"

public class MissingCharTest {

  public static void main(String[] args) {

    MissingCharTest test = new MissingCharTest();

    System.out.println(">" + test.missingChar("kitten", 1) + "<");
    System.out.println(">" + test.missingChar("kitten", 0) + "<");
    System.out.println(">" + test.missingChar("kitten", 4) + "<");
  }

  public String missingChar(String str, int n) {
    // StringBuilder sb = new StringBuilder(str);
    // sb.deleteCharAt(n);
    // return sb.toString();

    String result = "";
    char[] strChars = str.toCharArray();
    for (int i = 0; i < strChars.length; i++) {
      if (i == n) {
        continue;
      }
      else {
        result += strChars[i];
      }
    }
    return result;
  }

}
