package codingbat.string2;

/*
 * We'll say that a String is xy-balanced if for all the 'x' chars 
 * in the string, there exists a 'y' char somewhere later in the string. 
 * So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. 
 * 
 * Return true if the given string is xy-balanced. 
 * 
 * xyBalance("aaxbby") = true
 * xyBalance("aaxbb") = false
 * xyBalance("yaaxbb") = false
 * 
 */

public class XYBalanceTest {

  public static void main(String[] args) {

    XYBalanceTest test = new XYBalanceTest();

    System.out.println(">" + test.xyBalance("aaxbby") + "<");
    System.out.println(">" + test.xyBalance("aaxbb") + "<");
    System.out.println(">" + test.xyBalance("yaaxbb") + "<");
  }

  public boolean xyBalance(String str) {
    boolean balanced = true;
    
    for(int i=0; i<str.length(); i++){
      if(str.substring(i, i+1).equals("x")){
        balanced = false;
      }
      else if(!balanced && str.substring(i, i+1).equals("y")){
        balanced = true;
      }
    }
    
    return balanced;
  }

}
