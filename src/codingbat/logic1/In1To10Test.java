package codingbat.logic1;

//Given a number n, return true if n is in the range 1..10, inclusive.
//Unless "outsideMode" is true, 
//in which case return true if the number is less or equal to 1,
//or greater or equal to 10. 
//
//in1To10(5, false) = true
//in1To10(11, false) = false
//in1To10(11, true) = true

public class In1To10Test {

  public static void main(String[] args) {

    In1To10Test test = new In1To10Test();

    System.out.println(">" + test.in1To10(5, false) + "<");
    System.out.println(">" + test.in1To10(11, false) + "<");
    System.out.println(">" + test.in1To10(11, true) + "<");
  }

  public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
      if (n <= 1 || n >= 10) {
        return true;
      }
    }
    else if (n >= 1 && n <= 10) {
      return true;
    }

    return false;
  }

}
