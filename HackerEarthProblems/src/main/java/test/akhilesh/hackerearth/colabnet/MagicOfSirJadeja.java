package test.akhilesh.hackerearth.colabnet;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicOfSirJadeja {


	public static void main(String[] args) throws Exception {

		String members[] = { "Rohit", "Dhawan", "Kohli", "Yuvraj", "Raina", "Dhoni", "Sir Jadeja" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t > 0) {
			int k = Integer.parseInt(br.readLine().trim());
			System.out.println(members[getNthStepAfterBatting(k)]);
			t--;
		}

	}

	static int getNthStepAfterBatting(int k) {
		int temp = 7;
		int count = 1;
		while (k > temp) {
			k = k - temp;
			temp = temp * 2;
			count = count * 2;
		}
		k--;
		return k / count;
	}

}
/*
 * Team India is playing too much cricket in this season. Team players are
 * getting better in their performance with match by match. Sir Jadeja has
 * become a Trump Card for M.S Dhoni. There is a hidden reason of his special
 * position in the team. He can make new copies of a person by some magic. Due
 * to this, players can get many chances to bat. Now there is a fixed batting
 * line up of top 7 batsman decided by Dhoni as : [ "Rohit", "Dhawan", "Kohli",
 * "Yuvraj", "Raina" , "Dhoni", "Sir Jadeja"]. Now they are playing one ball at
 * a time and once they play a ball, Jadeja will make a new copy of that player
 * (including himself) and both the same players will get back in this batting
 * line up. In this way they will get a chance to play a ball turn by turn. Your
 * task is very simple. You are required to output the name of a player as given
 * in the above list who will play a Kth ball.
 * 
 * Input
 * 
 * First line will contain T (No. of test cases). Each test case will consist of
 * one line containing the value of K . Output
 * 
 * For every test case, print a new line having the name of a player who will
 * play the Kth ball. Constraints
 * 
 * 1 ≤ T ≤ 1000 1 ≤ K ≤ 109 Sample Input(Plaintext Link) 2 3 9 Sample
 * Output(Plaintext Link) Kohli Rohit
 */
