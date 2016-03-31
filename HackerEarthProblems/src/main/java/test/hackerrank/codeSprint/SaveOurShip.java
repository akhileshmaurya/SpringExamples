package test.hackerrank.codeSprint;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SaveOurShip {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sosMessage = br.readLine();
		int count = 0;
		for (int i = 0; i < sosMessage.length();) {

			if (!(sosMessage.charAt(i) == 'S'))
				count++;
			if (!(sosMessage.charAt(i + 1) == 'O'))
				count++;
			if (!(sosMessage.charAt(i + 2) == 'S'))
				count++;

			i = i + 3;
		}
		System.out.println(count);
	}

}
