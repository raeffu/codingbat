package codingbat.string3;

/*
 * Given two strings, base and remove, 
 * return a version of the base string where all instances of the remove string
 * have been removed (not case sensitive). 
 * You may assume that the remove string is length 1 or more. 
 * Remove only non-overlapping instances, 
 * so with "xxx" removing "xx" leaves "x". 
 * 
 * withoutString("Hello there", "llo") = "He there"
 * withoutString("Hello there", "e") = "Hllo thr"
 * withoutString("Hello there", "x") = "Hello there" 
 * 
 */

public class withoutStringTest {

  public static void main(String[] args) {
    withoutStringTest test = new withoutStringTest();

    System.out.println(">" + test.withoutString("Hello there", "llo") + "<");
    System.out.println(">" + test.withoutString("Hello there", "e") + "<");
    System.out.println(">" + test.withoutString("Hello there", "x") + "<");
  }

  public String withoutString(String base, String remove) {
    String result = base.replaceAll(remove, "");
    result = result.replaceAll(remove.toUpperCase(), "");
    result = result.replaceAll(remove.toLowerCase(), "");
    
    return result;
  }

}
