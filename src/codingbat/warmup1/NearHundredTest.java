package codingbat.warmup1;

//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 
//
//nearHundred(93) = true
//nearHundred(90) = true
//nearHundred(89) = false

public class NearHundredTest {

  public static void main(String[] args) {

    NearHundredTest test = new NearHundredTest();

    System.out.println(">" + test.nearHundred(93) + "<");
    System.out.println(">" + test.nearHundred(90) + "<");
    System.out.println(">" + test.nearHundred(89) + "<");
  }

  public boolean nearHundred(int n) {
    return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
  }

}
