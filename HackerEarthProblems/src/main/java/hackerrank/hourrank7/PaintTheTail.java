package hackerrank.hourrank7;

import java.util.Scanner;

public class PaintTheTail {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    String C = in.next();
    char ch = C.charAt(0);
    int count = 1;
    for (int i = 1; i < N; i++) {
      if (ch != C.charAt(i)) {
        count++;
        ch = C.charAt(i);
      }
    }
    System.out.println(count);
  }
}
