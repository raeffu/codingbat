package codingbat.string2;

/*
 * Return true if the string "cat" and "dog" appear the same number of times 
 * in the given string. 
 * 
 * catDog("catdog") = true
 * catDog("catcat") = false
 * catDog("1cat1cadodog") = true
 * 
 */

public class CatDogTest {

  public static void main(String[] args) {

    CatDogTest test = new CatDogTest();

    System.out.println(">" + test.catDog("catdog") + "<");
    System.out.println(">" + test.catDog("catcat") + "<");
    System.out.println(">" + test.catDog("1cat1cadodog") + "<");
  }

  public boolean catDog(String str) {
    int cats = 0;
    int dogs = 0;

    for (int i = 0; i < str.length() - 2; i++) {
      
      if (str.substring(i, i + 3).equals("cat")) {
        cats += 1;
      }
      else if (str.subSequence(i, i + 3).equals("dog")) {
        dogs += 1;
      }
    }

    return cats == dogs;
  }

}
