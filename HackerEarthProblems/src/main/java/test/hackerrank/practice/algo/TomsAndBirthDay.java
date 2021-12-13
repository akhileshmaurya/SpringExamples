package test.hackerrank.practice.algo;

import java.util.Scanner;

public class TomsAndBirthDay {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    long bNo, wNo, blackCost, whiteCost, converCost;
    for (int a0 = 0; a0 < t; a0++) {
      bNo = in.nextLong();
      wNo = in.nextLong();
      blackCost = in.nextLong();
      whiteCost = in.nextLong();
      converCost = in.nextLong();
      if (whiteCost <= blackCost) {
        if (whiteCost + converCost < blackCost) {
          blackCost = whiteCost + converCost;
        }
      } else {
        if (blackCost + converCost < whiteCost) whiteCost = blackCost + converCost;
      }
      System.out.println(bNo * blackCost + wNo * whiteCost);
    }
    in.close();
  }
}
