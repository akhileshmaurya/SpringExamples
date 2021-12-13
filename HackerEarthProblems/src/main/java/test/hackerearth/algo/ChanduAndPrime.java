package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ChanduAndPrime {

  static Set<Integer> primeset = new HashSet<Integer>();
  static Set<Integer> nonPrimeset = new HashSet<Integer>();
  static Set<Integer> alfaPrimeset = new HashSet<Integer>();
  static Set<Integer> nonAlfaPrimeset = new HashSet<Integer>();

  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int query = Integer.parseInt(br.readLine().trim());
    for (int k = 0; k < query; k++) {
      String[] input = br.readLine().split(" ");
      int p = Integer.parseInt(input[0].trim());
      int q = Integer.parseInt(input[1].trim());
      int alfaPrimeCount = 0;
      for (int i = p; i <= q; i++) {
        if (isAlfaPrime(i)) {
          alfaPrimeset.add(i);
          alfaPrimeCount++;
        } else {
          nonAlfaPrimeset.add(i);
        }
      }
      System.out.println(alfaPrimeCount);
    }
  }

  private static boolean isAlfaPrime(int i) {
    if (alfaPrimeset.contains(i)) {
      return true;
    } else if (nonAlfaPrimeset.contains(i)) {
      return false;
    }
    boolean isAlfaPrime = false;
    String number = String.valueOf(i);
    String temp = new String(number);
    for (int j = number.length() - 1; j >= 0; j--) {
      int sumNumber = Integer.parseInt(temp.substring(j));
      if (isPrime(sumNumber)) {
        primeset.add(sumNumber);
        isAlfaPrime = true;
        break;
      } else {
        nonPrimeset.add(sumNumber);
      }
    }
    return isAlfaPrime;
  }

  private static boolean isPrime(int a) {
    boolean isPrime = true;
    if (primeset.contains(a)) return isPrime;
    else if (nonPrimeset.contains(a)) return false;
    if (a == 0 || a == 1) {
      return false;
    }
    for (int i = 2; i * i <= a; i++) {
      if (a % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
}
