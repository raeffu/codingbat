package codingbat.exams;


/*
 * The last digit of a credit card number is the check digit. 
 * The following method is used to verify it:
 * 
 * Starting from the rightmost digit, form the sum of every other digit.
 * For example, if the credit card number is 43589795, then you form the sum 5+7+8+3=23.
 * Double each of the digits that were not included in the preceding step. 
 * Add all digits of the resulting numbers. 
 * For example, with the number given above, doubling the digits, 
 * starting with the next-to-last one, yields 18 18 10 8.
 * Adding all digits in these values yields 1+8+1+8+1+0+8 = 27.
 * 
 * Add the sums of the two preceding steps. 
 * If the last digit of the result is 0, the number is valid.
 * In our case, 23+27 = 50, so the number is valid.
 * 
 * creditCardIsValid({4,3,5,8,9,7,9,5}) = true
 * creditCardIsValid({4,3,5,8,9,7,9,4}) = false
 * creditCardIsValid({7,9,9,2,7,3,9,8,7,1,3}) = true
 *
 */

public class CreditCardIsValidTest {

  public static void main(String[] args){
    CreditCardIsValidTest test = new CreditCardIsValidTest();
    
    System.out.println(">"+test.creditCardIsValid(new int[]{4,3,5,8,9,7,9,5})+"<");
    System.out.println(">"+test.creditCardIsValid(new int[]{4,3,5,8,9,7,9,4})+"<");
    System.out.println(">"+test.creditCardIsValid(new int[]{7,9,9,2,7,3,9,8,7,1,3})+"<");
  }
  
  public boolean creditCardIsValid(int[] digits) {
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    
    int digit = 0;
        
    // sum every other
    for(int i = digits.length-1; i >= 0; i -= 2){
      sum1 += digits[i];
    }
    
    // double other digits
    for(int i = digits.length-2; i >= 0; i -= 2){
      digit = digits[i] * 2;
      sum2 += addDigits(digit);
    }
    
    sum3 = sum1 + sum2;
    return sum3%10 == 0;
  }

  public int addDigits(int d){
    if(d >= 10) 
      return 1 + d%10;
    else 
      return d;
  }
}
