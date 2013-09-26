package codingbat.warmup1;

//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings. 
//
//notString("candy") = "not candy"
//notString("x") = "not x"
//notString("not bad") = "not bad"

public class NotStringTest {

  public static void main(String[] args) {

    NotStringTest test = new NotStringTest();

    System.out.println(">" + test.notString("candy") + "<");
    System.out.println(">" + test.notString("x") + "<");
    System.out.println(">" + test.notString("not bad") + "<");
  }

  public String notString(String str) {
    if (str.startsWith("not")) {
      return str;
    }
    else {
      return "not " + str;
    }
  }

}
