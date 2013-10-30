package codingbat.string2;

/*
 * Return true if the given string contains an appearance of "xyz" 
 * where the xyz is not directly preceeded by a period (.). 
 * So "xxyz" counts but "x.xyz" does not. 
 * 
 * xyzThere("abcxyz") = true
 * xyzThere("abc.xyz") = false
 * xyzThere("xyz.abc") = true
 * 
 */

public class XyzThereTest {

  public static void main(String[] args) {

    XyzThereTest test = new XyzThereTest();

    System.out.println(">" + test.xyzThere("abcxyz") + "<");
    System.out.println(">" + test.xyzThere("abc.xyz") + "<");
    System.out.println(">" + test.xyzThere("xyz.abc") + "<");
    System.out.println(">" + test.xyzThere("abc.xyzxyz") + "<");
  }

  public boolean xyzThere(String str) {
    String word;
    Boolean hasXYZ = false;

    if (str.length() < 3) {
      return false;
    }

    for (int i = 0; i <= str.length() - 3; i++) {
      word = str.substring(i, i + 3);
      
//      System.out.println(word);
      
      if (word.matches("xyz")) {
        if (i > 0 && str.substring(i - 1, i).equals(".")) {
          hasXYZ = false;
        } else {
          hasXYZ = true;
        }
      }
    }

    return hasXYZ;
  }

}
