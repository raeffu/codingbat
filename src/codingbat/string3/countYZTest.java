package codingbat.string3;

/*
 * Given a string, count the number of words ending in 
 * 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, 
 * but not the 'y' in "yellow" (not case sensitive). 
 * We'll say that a y or z is at the end of a word if there is
 *  not an alphabetic letter immediately following it. 
 *  (Note: Character.isLetter(char) tests if a char is an alphabetic letter.) 
 *  
 *  countYZ("fez day") = 2
 *  countYZ("day fez") = 2
 *  countYZ("day fyyyz") = 2
 *  
 */

public class countYZTest {

  public static void main(String[] args) {
    countYZTest test = new countYZTest();

    System.out.println(">" + test.countYZ("fez day") + "<");
    System.out.println(">" + test.countYZ("day fez") + "<");
    System.out.println(">" + test.countYZ("day fyyyz") + "<");
  }

  public int countYZ(String str) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      String c = Character.toString(str.charAt(i));

      if (i + 1 == str.length() && 
          (c.equalsIgnoreCase("Z") || c.equalsIgnoreCase("Y"))) {
        count += 1;
      }
      else {
        if ((c.equalsIgnoreCase("Z") || c.equalsIgnoreCase("Y")) && 
            !Character.isLetter(str.charAt(i + 1))) {
          count += 1;
        }
      }
    }

    return count;
  }

}
