package codingbat.string2;

/*
 * Return the number of times that the string "code" appears anywhere 
 * in the given string, except we'll accept any letter for the 'd', 
 * so "cope" and "cooe" count. 
 * 
 * countCode("aaacodebbb") = 1
 * countCode("codexxcode") = 2
 * countCode("cozexxcope") = 2
 * 
 */

public class CountCodeTest {

  public static void main(String[] args) {

    CountCodeTest test = new CountCodeTest();

    System.out.println(">" + test.countCode("aaacodebbb") + "<");
    System.out.println(">" + test.countCode("codexxcode") + "<");
    System.out.println(">" + test.countCode("cozexxcope") + "<");
  }

  public int countCode(String str) {
    String word = "";
    int counter = 0;
    
    for (int i = 0; i < str.length()-3; i++) {
      word = str.substring(i, i+4);
      if (word.matches("co[a-zA-Z]e")) {
        counter += 1;
      }
    }
    
    return counter;
  }

}
