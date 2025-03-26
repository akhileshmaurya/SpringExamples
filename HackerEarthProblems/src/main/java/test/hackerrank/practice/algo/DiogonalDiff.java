package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiogonalDiff {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[][] mat = new String[n][];
    for (int i = 0; i < n; i++) {
      mat[i] = br.readLine().split(" ");
    }
    int priDio = 0, secDio = 0;
    for (int i = 0; i < n; i++) {
      priDio = priDio + Integer.parseInt(mat[i][i]);
      secDio = secDio + Integer.parseInt(mat[i][n - i - 1]);
    }

    int result = priDio - secDio;
    if (result < 0) result = result * (-1);
    System.out.println(result);
  }
}
