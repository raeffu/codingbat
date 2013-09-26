package codingbat.string1;

//Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
//such as with "edited". 
//
//frontAgain("edited") = true
//frontAgain("edit") = false
//frontAgain("ed") = true

public class FrontAgainTest {

  public static void main(String[] args) {

    FrontAgainTest test = new FrontAgainTest();

    System.out.println(">" + test.frontAgain("edited") + "<");
    System.out.println(">" + test.frontAgain("edit") + "<");
    System.out.println(">" + test.frontAgain("ed") + "<");
  }

  public boolean frontAgain(String str) {
    String front;
    String back;

    if (str.length() < 2) {
      return false;
    }

    front = str.substring(0, 2);
    back = str.substring(str.length() - 2, str.length());

    return front.equals(back);
  }

}
