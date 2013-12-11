package codingbat.warmup2;

/*
 * Given an array of ints, return the number of 9's in the array. 
 * 
 * arrayCount9({1, 2, 9}) = 1
 * arrayCount9({1, 9, 9}) = 2
 * arrayCount9({1, 9, 9, 3, 9}) = 3
 */

public class ArrayCount9Test
{

  public static void main(String[] args)
  {

    ArrayCount9Test test = new ArrayCount9Test();

    System.out.println(">" + test.arrayCount9(new int[] {1, 2, 9}) + "<");
    System.out.println(">" + test.arrayCount9(new int[] {1, 9, 9}) + "<");
    System.out.println(">" + test.arrayCount9(new int[] {1, 9, 9, 3, 9}) + "<");
  }

  public int arrayCount9(int[] nums)
  {
    return 0;
    
  }

}