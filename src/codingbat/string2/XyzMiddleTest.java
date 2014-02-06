package codingbat.string2;

/*
 * Given a string, does "xyz" appear in the middle of the string? 
 * To define middle, we'll say that the number of chars to the left and right 
 * of the "xyz" must differ by at most one. 
 * 
 * This problem is harder than it looks. 
 * 
 * xyzMiddle("AAxyzBB") = true
 * xyzMiddle("AxyzBB") = true
 * xyzMiddle("AxyzBBB") = false
 * xyzMiddle("xyz") = true
 * xyzMiddle("xy") = false
 * 
 */

public class XyzMiddleTest {

  public static void main(String[] args) {

    XyzMiddleTest test = new XyzMiddleTest();

    System.out.println(">" + test.xyzMiddle("AAxyzBB") + "<");
    System.out.println(">" + test.xyzMiddle("AxyzBB") + "<");
    System.out.println(">" + test.xyzMiddle("AxyzBBB") + "<");
    System.out.println(">" + test.xyzMiddle("xyz") + "<");
    System.out.println(">" + test.xyzMiddle("xy") + "<");    
  }

  public boolean xyzMiddle(String str) {
    int middle = str.length() / 2;
    boolean even = str.length() %2 == 0;
    
    int pos = str.indexOf("xyz", middle-3);
    
    System.out.println("str="+str+", middle="+ middle + ", even=" + even + ", pos=" + pos + 
        " length=" + str.length());
    
    if(pos<0)
      return false;
        
    if(!even && middle-1 == pos)
      return true;
    else if(even && (middle-2 == pos || middle-1 == pos))
      return true;
    else
      return false;
  }

}
