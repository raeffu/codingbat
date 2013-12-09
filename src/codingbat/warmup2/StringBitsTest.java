package codingbat.warmup2;

/*
 * Given a string, return a new string made of every other char starting 
 * with the first, so "Hello" yields "Hlo". 
 * 
 * stringBits("Hello") = "Hlo"
 * stringBits("Hi") = "H"
 * stringBits("Heeololeo") = "Hello"
 */

public class StringBitsTest {

  public static void main(String[] args) {

    StringBitsTest test = new StringBitsTest();

    System.out.println(">" + test.stringBits("Hello") + "<");
    System.out.println(">" + test.stringBits("Hi") + "<");
    System.out.println(">" + test.stringBits("Heeololeo") + "<");
  }

  public String stringBits(String str) {
    String result = "";
    for(int i = 0; i<str.length(); i++){
      if(i%2==0) result += str.substring(i, i+1);
    }
    
    return result;
  }

}
