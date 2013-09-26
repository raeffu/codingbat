package codingbat.string1;

//Given 2 strings, a and b, return a string of the form short+long+short, 
//with the shorter string on the outside and the longer string on the inside. 
//The strings will not be the same length, but they may be empty (length 0). 
//
//comboString("Hello", "hi") = "hiHellohi"
//comboString("hi", "Hello") = "hiHellohi"
//comboString("aaa", "b") = "baaab"

public class ComboStringTest {

  public static void main(String[] args) {

    ComboStringTest test = new ComboStringTest();

    System.out.println(">" + test.comboString("Hello", "hi") + "<");
    System.out.println(">" + test.comboString("hi", "Hello") + "<");
    System.out.println(">" + test.comboString("aaa", "b") + "<");
  }

  public String comboString(String a, String b) {
    String small;
    String big;
    if (a.length() > b.length()) {
      big = a;
      small = b;
    }
    else {
      big = b;
      small = a;
    }
    return small + big + small;
  }

}
