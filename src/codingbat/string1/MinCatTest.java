package codingbat.string1;

/*
 * Given two strings, append them together (known as "concatenation") and 
 * return the result. However, if the strings are different lengths, 
 * omit chars from the longer string so it is the same length as 
 * the shorter string. So "Hello" and "Hi" yield "loHi". 
 * The strings may be any length. 
 * 
 * minCat("Hello", "Hi") = "loHi"
 * minCat("Hello", "java") = "ellojava"
 * minCat("java", "Hello") = "javaello"
 */

public class MinCatTest {

  public static void main(String[] args) {

    MinCatTest test = new MinCatTest();

    System.out.println(">" + test.minCat("Hello", "Hi") + "<");
    System.out.println(">" + test.minCat("Hello", "java") + "<");
    System.out.println(">" + test.minCat("java", "Hello") + "<");
  }

  public String minCat(String a, String b) {
    String newB = "";
    String newA = "";
    
    if(a.length() < b.length()){
      newB = b.substring(b.length() - a.length(), b.length());
      return a + newB;
    }
    else if(b.length() < a.length()){
      newA = a.substring(a.length() - b.length(), a.length());
      return newA + b;
    }
    
    return a+b;
    
  }

}
