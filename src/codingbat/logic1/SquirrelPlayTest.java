package codingbat.logic1;

// The squirrels in Palo Alto spend most of the day playing.
// In particular, they play if the temperature is between 60 and 90 (inclusive).
// Unless it is summer, then the upper limit is 100 instead of 90.
// Given an int temperature and a boolean isSummer,
// return true if the squirrels play and false otherwise.

// squirrelPlay(70, false) = true
// squirrelPlay(95, false) = false
// squirrelPlay(95, true) = true

public class SquirrelPlayTest {

  public static void main(String[] args) {
    SquirrelPlayTest test = new SquirrelPlayTest();

    System.out.println(">" + test.squirrelPlay(70, false) + "<");
    System.out.println(">" + test.squirrelPlay(95, false) + "<");
    System.out.println(">" + test.squirrelPlay(95, true) + "<");
  }

  public boolean squirrelPlay(int temp, boolean isSummer) {

    if (temp >= 60 && temp <= 100) {
      if (isSummer) {
        return true;
      }
      else if (temp <= 90) {
        return true;
      }
    }

    return false;
  }

}
