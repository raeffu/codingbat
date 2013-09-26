package codingbat.string1;

//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings. 
//
//hasBad("badxx") = true
//hasBad("xbadxx") = true
//hasBad("xxbadxx") = false

public class HasBadTest {

  public static void main(String[] args) {

    HasBadTest test = new HasBadTest();

    System.out.println(">" + test.hasBad("badxx") + "<");
    System.out.println(">" + test.hasBad("xbadxx") + "<");
    System.out.println(">" + test.hasBad("xxbadxx") + "<");
  }

  public boolean hasBad(String str) {
    Integer idx = str.indexOf("bad");
    return idx == 0 || idx == 1;
  }

}
