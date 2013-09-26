package codingbat.string1;

//Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3. 
//
//middleThree("Candy") = "and"
//middleThree("and") = "and"
//middleThree("solving") = "lvi"

public class MiddleThreeTest {

  public static void main(String[] args) {

    MiddleThreeTest test = new MiddleThreeTest();

    System.out.println(">" + test.middleThree("Candy") + "<");
    System.out.println(">" + test.middleThree("and") + "<");
    System.out.println(">" + test.middleThree("solving") + "<");
  }

  public String middleThree(String str) {
    Integer offSet = (str.length() - 3) / 2;
    return str.substring(offSet, offSet + 3);
  }

}
