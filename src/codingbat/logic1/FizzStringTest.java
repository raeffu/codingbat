package codingbat.logic1;


/*
 * Given a string str, if the string starts with "f" return "Fizz". 
 * If the string ends with "b" return "Buzz". If both the "f" and "b" 
 * conditions are true, return "FizzBuzz". In all other cases, 
 * return the string unchanged. (See also: FizzBuzz Code) 
 * 
 * fizzString("fig") = "Fizz"
 * fizzString("dib") = "Buzz"
 * fizzString("fib") = "FizzBuzz"
 */

public class FizzStringTest {

  public static void main(String[] args) {
    FizzStringTest test = new FizzStringTest();

    System.out.println(">" + test.fizzString("fig") + "<");
    System.out.println(">" + test.fizzString("dib") + "<");
    System.out.println(">" + test.fizzString("fib") + "<");
  }

  public String fizzString(String str) {
    boolean fizz = false;
    boolean buzz = false;
    
    if(str.length() > 0){
      fizz = str.substring(0,1).equals("f");
      buzz = str.substring(str.length()-1, str.length()).equals("b");
    }
    
    if(fizz && buzz){
      return "FizzBuzz";
    }
    else if(fizz){
      return "Fizz";
    }
    else if(buzz){
      return "Buzz";
    }
    else {
      return str;
    }
  }

}
