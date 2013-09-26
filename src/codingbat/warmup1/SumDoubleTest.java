package codingbat.warmup1;

//Given two int values, return their sum. Unless the two values are the same, then return double their sum. 
//
//sumDouble(1, 2) = 3
//sumDouble(3, 2) = 5
//sumDouble(2, 2) = 8

public class SumDoubleTest {

  public static void main(String[] args) {

    SumDoubleTest test = new SumDoubleTest();

    System.out.println(">" + test.sumDouble(1, 2) + "<");
    System.out.println(">" + test.sumDouble(3, 2) + "<");
    System.out.println(">" + test.sumDouble(2, 2) + "<");
  }

  public int sumDouble(int a, int b) {
    if (a == b) {
      return 2 * (a + b);
    }
    else {
      return a + b;
    }
  }

}
