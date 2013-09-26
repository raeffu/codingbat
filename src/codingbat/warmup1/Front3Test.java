package codingbat.warmup1;

//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front. 
//
//front3("Java") = "JavJavJav"
//front3("Chocolate") = "ChoChoCho"
//front3("abc") = "abcabcabc"

public class Front3Test {

  public static void main(String[] args) {

    Front3Test test = new Front3Test();

    System.out.println(">" + test.front3("Java") + "<");
    System.out.println(">" + test.front3("Chocolate") + "<");
    System.out.println(">" + test.front3("abc") + "<");
  }

  public String front3(String str) {
    String result = "";
    String front3;
    if (str.length() < 3) {
      result = str + str + str;
    }
    else {
      front3 = str.substring(0, 3);
      result = front3 + front3 + front3;
    }

    return result;
  }

}
