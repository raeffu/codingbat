package codingbat;

public class Testing {

  public static void main(String[] args) {

    Testing test = new Testing();

    System.out.println(">" + test.sum2(new int[] { 6, 3, 45 }) + "<");
    System.out.println(">" + test.sum2(new int[] { 6, 3, 4 }) + "<");
  }

  public int sum2(int[] nums) {
    if(nums.length >= 2){
      return nums[0]+nums[1];
    }
    else if(nums.length > 0){
      return nums[0];
    }
    else {
      return 0;
    }
  }
  
}