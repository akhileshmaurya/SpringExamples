package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoString {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    char inputA[], inputB[];
    int count[] = new int[26];
    boolean found = false;
    for (int i = 0; i < t; i++) {
      for (int j = 0; j < count.length; j++) {
        count[j] = 0;
      }
      found = false;
      inputA = br.readLine().toCharArray();
      inputB = br.readLine().toCharArray();
      for (int j = 0; j < inputA.length; j++) {
        count[inputA[j] - 'a']++;
      }
      for (int j = 0; j < inputB.length; j++) {
        if (count[inputB[j] - 'a'] > 0) {
          found = true;
          break;
        }
      }
      if (found) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
