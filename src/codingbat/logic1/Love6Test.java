package codingbat.logic1;

//The number 6 is a truly great number. 
//Given two int values, a and b, return true if either one is 6. 
//Or if their sum or difference is 6. 
//Note: the function Math.abs(num) computes the absolute value of a number. 
//
//love6(6, 4) = true
//love6(4, 5) = false
//love6(1, 5) = true

public class Love6Test {

  public static void main(String[] args) {

    Love6Test test = new Love6Test();

    System.out.println(">" + test.love6(6, 4) + "<");
    System.out.println(">" + test.love6(4, 5) + "<");
    System.out.println(">" + test.love6(1, 5) + "<");
  }

  public boolean love6(int a, int b) {
    if(a == 6 || b == 6){
      return true;
    }
    else if (a+b == 6) {
      return true;
    }
    else if (Math.abs(a-b) == 6) {
      return true;
    }
    
    return false;
  }

}
