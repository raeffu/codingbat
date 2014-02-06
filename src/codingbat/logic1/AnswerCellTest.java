package codingbat.logic1;

/* 
 * Your cell phone rings. Return true if you should answer it. 
 * Normally you answer, except in the morning you only answer if it is your 
 * mom calling. In all cases, if you are asleep, you do not answer. 
 * 
 * answerCell(false, false, false) = true
 * answerCell(false, false, true) = false
 * answerCell(true, false, false) = false
 */

public class AnswerCellTest {

  public static void main(String[] args) {

    AnswerCellTest test = new AnswerCellTest();

    System.out.println(">" + test.answerCell(false, false, false) + "<");
    System.out.println(">" + test.answerCell(false, false, true) + "<");
    System.out.println(">" + test.answerCell(true, false, false) + "<");
  }

  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    
    if(isAsleep) return false;
    if(isMorning && !isMom) return false;
    
    return true;
  }
}