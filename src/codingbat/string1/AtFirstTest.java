package codingbat.string1;

//Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars. 
//
//atFirst("hello") = "he"
//atFirst("hi") = "hi"
//atFirst("h") = "h@"

public class AtFirstTest {

  public static void main(String[] args) {

    AtFirstTest test = new AtFirstTest();

    System.out.println(">" + test.atFirst("hello") + "<");
    System.out.println(">" + test.atFirst("hi") + "<");
    System.out.println(">" + test.atFirst("h") + "<");
  }

  public String atFirst(String str) {

    if (str.length() == 0) {
      return "@@";
    }
    else if (str.length() == 1) {
      return str + "@";
    }
    else {
      return str.substring(0, 2);
    }
  }

}
