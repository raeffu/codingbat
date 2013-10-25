package codingbat.array2;

/*
 * Return the "centered" average of an array of ints, 
 * which we'll say is the mean average of the values, 
 * except ignoring the largest and smallest values in the array. 
 * If there are multiple copies of the smallest value, ignore just one copy, 
 * and likewise for the largest value. 
 * Use int division to produce the final average. 
 * You may assume that the array is length 3 or more. 
 * 
 * centeredAverage({1, 2, 3, 4, 100}) = 3
 * centeredAverage({1, 1, 5, 5, 10, 8, 7}) = 5
 * centeredAverage({-10, -4, -2, -4, -2, 0}) = -3
 */

public class CenteredAverageTest {

  public static void main(String[] args) {
    CenteredAverageTest test = new CenteredAverageTest();

    System.out.println(">" + test.centeredAverage(new int[] {1, 2, 3, 4, 100})
        + "<");
    System.out.println(">"
        + test.centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}) + "<");
    System.out.println(">"
        + test.centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}) + "<");
  }

  public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = 0;

    for (int num : nums) {
      sum += num;

      if (num > max) {max = num;}
      if (num < min) {min = num;}
    }

    sum = sum - max - min;

    return sum / (nums.length - 2);
  }

}
