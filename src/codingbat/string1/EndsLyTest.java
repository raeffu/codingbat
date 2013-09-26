package codingbat.string1;

//Given a string, return true if it ends in "ly". 
//
//endsLy("oddly") = true
//endsLy("y") = false
//endsLy("oddy") = false

public class EndsLyTest {

  public static void main(String[] args) {

    EndsLyTest test = new EndsLyTest();

    System.out.println(">" + test.endsLy("oddly") + "<");
    System.out.println(">" + test.endsLy("y") + "<");
    System.out.println(">" + test.endsLy("oddy") + "<");
  }

  public boolean endsLy(String str) {
    return str.endsWith("ly");
  }

}
