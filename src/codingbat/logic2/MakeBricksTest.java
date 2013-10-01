package codingbat.logic2;

/*
 * We want to make a row of bricks that is goal inches long.
 * We have a number of small bricks (1 inch each) 
 * and big bricks (5 inches each). 
 * Return true if it is possible to make the goal by choosing 
 * from the given bricks. 
 * This is a little harder than it looks and can be done without any loops. 
 * See also: Introduction to MakeBricks 
 * 
 * makeBricks(3, 1, 8) = true
 * makeBricks(3, 1, 9) = false
 * makeBricks(3, 2, 10) = true
 */

public class MakeBricksTest {

  public static void main(String[] args) {
    MakeBricksTest test = new MakeBricksTest();

    System.out.println(">" + test.makeBricks(3, 1, 8) + "<");
    System.out.println(">" + test.makeBricks(3, 1, 9) + "<");
    System.out.println(">" + test.makeBricks(3, 2, 10) + "<");
  }

  public boolean makeBricks(int small, int big, int goal) {
//    if (goal == small || big*5 == goal) {
//      return true;
//    }
//    else if (small + (big*5) < goal) {
//      return false;
//    }
//    
//    
    return false;
  }

}
