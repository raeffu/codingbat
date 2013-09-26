package codingbat.string1;

//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2. 
//
//withoutEnd("Hello") = "ell"
//withoutEnd("java") = "av"
//withoutEnd("coding") = "odin"

public class WithoutEndTest {

  public static void main(String[] args) {

    WithoutEndTest test = new WithoutEndTest();

    System.out.println(">" + test.withoutEnd("Hello") + "<");
    System.out.println(">" + test.withoutEnd("java") + "<");
    System.out.println(">" + test.withoutEnd("coding") + "<");
  }

  public String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
  }

}
