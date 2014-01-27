package codingbat.string2;

/*
 * Given two strings, A and B, create a bigger string made of the first char
 * of A, the first char of B, the second char of A, the second char of B, 
 * and so on. Any leftover chars go at the end of the result. 
 * 
 * mixString("abc", "xyz") = "axbycz"
 * mixString("Hi", "There") = "HTihere"
 * mixString("xxxx", "There") = "xTxhxexre"
 * 
 */

public class MixStringTest {

  public static void main(String[] args) {

    MixStringTest test = new MixStringTest();

    System.out.println(">" + test.mixString("abc", "xyz") + "<");
    System.out.println(">" + test.mixString("Hi", "There") + "<");
    System.out.println(">" + test.mixString("xxxx", "There") + "<");
  }

  public String mixString(String a, String b) {
    String result = "";
    int index = 0;
    
    if(a.length()>=b.length()) index = b.length();
    if(a.length()<=b.length()) index = a.length();  
    
    
    for(int i=0; i<index; i++){
      result += a.substring(i, i+1) + b.substring(i, i+1);
    }
    
    if(a.length() < b.length()) result += b.substring(a.length(), b.length());
    if(a.length() > b.length()) result += a.substring(b.length(), a.length());
    
    return result;
  }

}
