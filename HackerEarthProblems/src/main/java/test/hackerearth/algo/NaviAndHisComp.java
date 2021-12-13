package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NaviAndHisComp {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      int noOfDeveloper = 0, unAssignProject = 0;
      for (int i = 0; i < n; i++) {
        String input = br.readLine().trim();
        if ("New Project".equalsIgnoreCase(input)) {
          if (noOfDeveloper > 0) {
            noOfDeveloper--;
          } else {
            unAssignProject++;
          }

        } else {
          noOfDeveloper = noOfDeveloper + Integer.parseInt(input);
        }
      }
      System.out.println(unAssignProject);
      t--;
    }
  }
}
