package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GayleAndLegasy {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine().trim());
		while (t > 0) {
			String[] input = br.readLine().trim().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			boolean hitSixes = true;
			GainAndPower[] gainAndPowers = new GainAndPower[n];
			for (int i = 0; i < n; i++) {
				String[] input2 = br.readLine().trim().split(" ");
				gainAndPowers[i] = new GainAndPower(Integer.parseInt(input2[0]), Integer.parseInt(input2[1]));
			}
			Arrays.sort(gainAndPowers);
			
			for (int i = 0; i < gainAndPowers.length; i++) {
				if (m < gainAndPowers[i].getPower()) {
					hitSixes = false;
					break;
				}
				m = m + (int) gainAndPowers[i].getGain();
			}
			//System.out.println(Arrays.asList(gainAndPowers));
			if (hitSixes)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}

	}
}

class GainAndPower implements Comparable<GainAndPower> {
	int gain;
	int power;

	public GainAndPower(int gain, int power) {
		super();
		this.gain = gain;
		this.power = power;
	}

	public long getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
	}

	public long getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int compareTo(GainAndPower arg0) {
		return arg0.power - this.power;
	}	
}