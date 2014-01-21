package codingbat.warmup1;

/* Given a string, take the last char and return a new string with 
 * the last char added at the front and back, so "cat" yields "tcatt". 
 * The original string will be length 1 or more. 
 * 
 * backAround("cat") = "tcatt"
 * backAround("Hello") = "oHelloo"
 * backAround("a") = "aaa"
*/

public class BackAroundTest {

  public static void main(String[] args) {

    BackAroundTest test = new BackAroundTest();

    System.out.println(">" + test.backAround("cat") + "<");
    System.out.println(">" + test.backAround("Hello") + "<");
    System.out.println(">" + test.backAround("a") + "<");
  }

  public String backAround(String str) {
    String last = str.substring(str.length()-1);
    return last + str + last;
  }

}
