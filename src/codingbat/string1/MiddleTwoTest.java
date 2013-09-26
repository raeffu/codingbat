package codingbat.string1;

//Given a string of even length, return a string made of the middle two chars, 
//so the string "string" yields "ri". The string length will be at least 2. 
//
//middleTwo("string") = "ri"
//middleTwo("code") = "od"
//middleTwo("Practice") = "ct"

public class MiddleTwoTest {

  public static void main(String[] args) {

    MiddleTwoTest test = new MiddleTwoTest();

    System.out.println(">" + test.middleTwo("string") + "<");
    System.out.println(">" + test.middleTwo("code") + "<");
    System.out.println(">" + test.middleTwo("Practice") + "<");
  }

  public String middleTwo(String str) {
    Integer middle = str.length() / 2;
    return str.substring(middle - 1, middle + 1);
  }

}
