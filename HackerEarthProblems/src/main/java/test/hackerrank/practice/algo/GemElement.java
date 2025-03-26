package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GemElement {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    boolean matrix[][] = new boolean[n][26];
    for (int i = 0; i < n; i++) {
      String inputRock = br.readLine();
      for (int j = 0; j < inputRock.length(); j++) {
        int index = (int) inputRock.charAt(j) - (int) 'a';
        matrix[i][index] = true;
      }
    }
    int count = 0;
    for (int i = 0; i < 26; i++) {
      boolean status = true;
      for (int j = 0; j < n; j++) {
        if (!matrix[j][i]) {
          status = false;
          break;
        }
      }
      if (status) count++;
    }
    System.out.println(count);
  }
}
