package test.hackerrank.practice.algo;

import java.math.BigDecimal;
import java.util.Scanner;

public class KaprekarNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    int q = in.nextInt();
    boolean found = false;
    for (int i = p; i <= q; i++) {
      BigDecimal number = new BigDecimal(i);
      // System.out.println("number :" + number);
      BigDecimal sq = number.multiply(number);
      int d = number.toString().length();
      String sqNumber = sq.toString();
      // System.out.println("sqNumber :" + sqNumber);
      BigDecimal sum = BigDecimal.ZERO;
      if (sqNumber.length() > 1)
        sum =
            new BigDecimal(sqNumber.substring(sqNumber.length() - d, sqNumber.length()))
                .add(new BigDecimal(sqNumber.substring(0, sqNumber.length() - d)));
      else sum = sq;
      // System.out.println("sum :" + sum);
      if (number.compareTo(sum) == 0) {
        System.out.print(number + " ");
        found = true;
      }
    }
    if (!found) System.out.println("INVALID RANGE");
    in.close();
  }
}
