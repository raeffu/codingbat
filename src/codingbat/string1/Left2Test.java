package codingbat.string1;

//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
//The string length will be at least 2. 
//
//left2("Hello") = "lloHe"
//left2("java") = "vaja"
//left2("Hi") = "Hi"

public class Left2Test {

  public static void main(String[] args) {

    Left2Test test = new Left2Test();

    System.out.println(">" + test.left2("Hello") + "<");
    System.out.println(">" + test.left2("java") + "<");
    System.out.println(">" + test.left2("Hi") + "<");
  }

  public String left2(String str) {
    String start;
    String end;

    start = str.substring(0, 2);
    end = str.substring(2);

    return end + start;
  }

}
