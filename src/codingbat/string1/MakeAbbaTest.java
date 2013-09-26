package codingbat.string1;

//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 
//
//makeAbba("Hi", "Bye") = "HiByeByeHi"
//makeAbba("Yo", "Alice") = "YoAliceAliceYo"
//makeAbba("What", "Up") = "WhatUpUpWhat"

public class MakeAbbaTest {

  public static void main(String[] args) {

    MakeAbbaTest test = new MakeAbbaTest();

    System.out.println(">" + test.makeAbba("Hi", "Bye") + "<");
    System.out.println(">" + test.makeAbba("Yo", "Alice") + "<");
    System.out.println(">" + test.makeAbba("What", "Up") + "<");
  }

  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }

}
