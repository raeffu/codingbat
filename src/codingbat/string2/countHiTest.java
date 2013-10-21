package codingbat.string2;

/*
 * Return the number of times that the string "hi" appears anywhere 
 * in the given string. 
 * 
 * countHi("abc hi ho") = 1
 * countHi("ABChi hi") = 2
 * countHi("hihi") = 2
 * 
 */

public class countHiTest {

  public static void main(String[] args) {

    countHiTest test = new countHiTest();

    System.out.println(">" + test.countHi("abc hi ho") + "<");
    System.out.println(">" + test.countHi("ABChi hi") + "<");
    System.out.println(">" + test.countHi("hihi") + "<");
  }

  public int countHi(String str) {
    int counter = 0;
    
    for (int i = 0; i <= str.length() - 2; i++) {
      if (str.substring(i, i + 2).equals("hi")) {
        counter += 1;
      }
    }
    
    return counter;
  }

}
