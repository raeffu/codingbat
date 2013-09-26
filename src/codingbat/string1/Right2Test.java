package codingbat.string1;

//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
//The string length will be at least 2. 
//
//right2("Hello") = "loHel"
//right2("java") = "vaja"
//right2("Hi") = "Hi"

public class Right2Test {

  public static void main(String[] args) {

    Right2Test test = new Right2Test();

    System.out.println(">" + test.right2("Hello") + "<");
    System.out.println(">" + test.right2("java") + "<");
    System.out.println(">" + test.right2("Hi") + "<");
  }

  public String right2(String str) {
    return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
  }

}
