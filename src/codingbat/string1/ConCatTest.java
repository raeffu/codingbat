package codingbat.string1;

//Given two strings, append them together (known as "concatenation") and return the result. 
//However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". 
//
//conCat("abc", "cat") = "abcat"
//conCat("dog", "cat") = "dogcat"
//conCat("abc", "") = "abc"

public class ConCatTest {

  public static void main(String[] args) {

    ConCatTest test = new ConCatTest();

    System.out.println(">" + test.conCat("abc", "cat") + "<");
    System.out.println(">" + test.conCat("dog", "cat") + "<");
    System.out.println(">" + test.conCat("abc", "") + "<");
  }

  public String conCat(String a, String b) {
    String concat = a + b;

    if (a.length() > 0 && b.length() > 0) {
      if (concat.charAt(a.length() - 1) == concat.charAt(a.length())) {
        return a + b.substring(1);
      }
    }

    return concat;
  }

}
