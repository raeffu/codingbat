package codingbat.string1;

//Given a string, return a version without both the first and last char of the string. 
//The string may be any length, including 0. 
//
//withouEnd2("Hello") = "ell"
//withouEnd2("abc") = "b"
//withouEnd2("ab") = ""

public class WithouEnd2Test {

  public static void main(String[] args) {

    WithouEnd2Test test = new WithouEnd2Test();

    System.out.println(">" + test.withouEnd2("Hello") + "<");
    System.out.println(">" + test.withouEnd2("abc") + "<");
    System.out.println(">" + test.withouEnd2("ab") + "<");
  }

  public String withouEnd2(String str) {
    if (str.length() > 1) {
      return str.substring(1, str.length() - 1);
    }
    else {
      return "";
    }
  }

}
