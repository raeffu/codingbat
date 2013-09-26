package codingbat.logic1;

//You are driving a little too fast, and a police officer stops you.
//Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
//If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
//If speed is 81 or more, the result is 2. 
//Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. 
//
//caughtSpeeding(65, true) = 0
//caughtSpeeding(60, false) = 0
//caughtSpeeding(65, false) = 1

public class CaughtSpeedingTest {

  public static void main(String[] args) {
    CaughtSpeedingTest test = new CaughtSpeedingTest();

    System.out.println(">" + test.caughtSpeeding(65, true) + "<");
    System.out.println(">" + test.caughtSpeeding(60, false) + "<");
    System.out.println(">" + test.caughtSpeeding(65, false) + "<");
  }

  public int caughtSpeeding(int speed, boolean isBirthday) {
    int sLimit = 60;
    int bLimit = 80;
    
    if (isBirthday) {
      sLimit += 5;
      bLimit += 5;
    }
    
    if (speed <= sLimit) {
      return 0;
    }
    else if (speed <= bLimit) {
      return 1;
    }
    
    return 2;
  }

}
