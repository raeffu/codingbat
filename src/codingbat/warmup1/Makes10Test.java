package codingbat.warmup1;

//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. 
//
//makes10(9, 10) = true
//makes10(9, 9) = false
//makes10(1, 9) = true

public class Makes10Test {

  public static void main(String[] args) {

    Makes10Test test = new Makes10Test();

    System.out.println(">" + test.makes10(9, 10) + "<");
    System.out.println(">" + test.makes10(9, 9) + "<");
    System.out.println(">" + test.makes10(1, 9) + "<");
  }

  public boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
  }

}
