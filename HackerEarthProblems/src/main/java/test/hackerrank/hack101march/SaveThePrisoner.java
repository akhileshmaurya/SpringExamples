package test.hackerrank.hack101march;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SaveThePrisoner {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    long m, n, s;
    while (t > 0) {
      String[] input = br.readLine().trim().split(" ");
      n = Long.parseLong(input[0]);
      m = Long.parseLong(input[1]);
      s = Long.parseLong(input[2]);
      m = m % n;
      if (m == 0) {
        s = s - 1;
      } else {
        s = s + m - 1;
      }
      if (s < 1) {
        s = n;
      } else if (s > n) {
        s = s - n;
      }
      System.out.println(s);
      --t;
    }
  }
}

/*
 * A jail has NN prisoners, and each prisoner has a unique id number, SS, ranging from 11 to NN. There are MM sweets that must be distributed to the prisoners.

The jailer decides the fairest way to do this is by sitting the prisoners down in a circle (ordered by ascending SS), and then, starting with some random SS, distribute one candy at a time to each sequentially numbered prisoner until all MM candies are distributed. For example, if the jailer picks prisoner S=2S=2, then his distribution order would be (2,3,4,5,…,n−1,n,1,2,3,4,…)(2,3,4,5,…,n−1,n,1,2,3,4,…) until all MM sweets are distributed.

But wait—there's a catch—the very last sweet is poisoned! Can you find and print the ID number of the last prisoner to receive a sweet so he can be warned?

Input Format

The first line contains an integer, TT, denoting the number of test cases.
The TT subsequent lines each contain 33 space-separated integers:
NN (the number of prisoners), MM (the number of sweets), and SS (the prisoner ID), respectively.*/
