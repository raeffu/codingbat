package codingbat.string2;

/*
 * Given two strings, return true if either of the strings appears at the very 
 * end of the other string, ignoring upper/lower case differences 
 * (in other words, the computation should not be "case sensitive"). 
 * Note: str.toLowerCase() returns the lowercase version of a string. 
 * 
 * endOther("Hiabc", "abc") = true
 * endOther("AbC", "HiaBc") = true
 * endOther("abc", "abXabc") = true
 * 
 */

public class EndOtherTest {

  public static void main(String[] args) {

    EndOtherTest test = new EndOtherTest();

    System.out.println(">" + test.endOther("Hiabc", "abc") + "<");
    System.out.println(">" + test.endOther("AbC", "HiaBc") + "<");
    System.out.println(">" + test.endOther("abc", "abXabc") + "<");
  }

  public boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    String aEnd = "";
    String bEnd = "";
    
    if (b.length() <= a.length()) {
      aEnd = a.substring(a.length() - b.length());
    }
    if (a.length() <= b.length()) {
      bEnd = b.substring(b.length() - a.length());
    }
    
    if (aEnd.equals(b)) {
      return true;
    }
    else if (bEnd.equals(a)) {
      return true;
    }
    
    return false;
  }

}
