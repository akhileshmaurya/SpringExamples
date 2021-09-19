package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class MiliAndBalls_CipMonk {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < t; i++) {
      String[] input = br.readLine().trim().split(" ");
      Long n = Long.parseLong(input[0].trim());
      Long k = Long.parseLong(input[1].trim());
      Long totalBallsFor1round = getTotalBallsFor1Round(n);
      System.out.println(totalBallsFor1round - (k % totalBallsFor1round));
    }
  }

  private static Long getTotalBallsFor1Round(Long n) {
    return (n * (n + 1)) / 2;
  }

  public static void main1(String[] args) {
    System.out.println(Long.MAX_VALUE);
    Long l = 1000000000l;
    System.out.println(getTotalBallsFor1Round(l));
    BigDecimal d = new BigDecimal("1000000000");
    System.out.println((d.multiply(d.add(BigDecimal.ONE))).divide(new BigDecimal("2")));
  }
}
