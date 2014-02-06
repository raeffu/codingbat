package codingbat.string2;

/*
 * Given a string and an int N, return a string made of N repetitions of the 
 * last N characters of the string. You may assume that N is between 0 and the 
 * length of the string, inclusive.
 * 
 * repeatEnd("Hello", 3) = "llollollo"
 * repeatEnd("Hello", 2) = "lolo"
 * repeatEnd("Hello", 1) = "o"
 * 
 */

public class RepeatEndTest {

  public static void main(String[] args) {

    RepeatEndTest test = new RepeatEndTest();

    System.out.println(">" + test.repeatEnd("Hello", 3) + "<");
    System.out.println(">" + test.repeatEnd("Hello", 2) + "<");
    System.out.println(">" + test.repeatEnd("Hello", 1) + "<");  
  }

  public String repeatEnd(String str, int n) {
    String end = str.substring(str.length()-n);
    String result = "";
    
    for(int i=0; i<n; i++){
      result += end;
    }
    
    return result;
  }

}
