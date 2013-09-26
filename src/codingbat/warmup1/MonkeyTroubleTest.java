package codingbat.warmup1;

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
//
//monkeyTrouble(true, true) = true
//monkeyTrouble(false, false) = true
//monkeyTrouble(true, false) = false

public class MonkeyTroubleTest {

  public static void main(String[] args) {

    MonkeyTroubleTest test = new MonkeyTroubleTest();

    System.out.println(">" + test.monkeyTrouble(false, false) + "<");
    System.out.println(">" + test.monkeyTrouble(true, false) + "<");
    System.out.println(">" + test.monkeyTrouble(false, true) + "<");
    System.out.println(">" + test.monkeyTrouble(true, true) + "<");
  }

  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return ((aSmile && bSmile) || (!aSmile && !bSmile));
  }

}
