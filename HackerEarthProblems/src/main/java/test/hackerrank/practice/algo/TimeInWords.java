package test.hackerrank.practice.algo;

import java.util.Scanner;

public class TimeInWords {
	static String min[] = {"", "one minute", "two minutes", "three minutes", "four minutes", "five minutes", "six minutes",
			"seven minutes", "eight minutes", "nine minutes", "ten minutes", "eleven minutes", "twelve minutes",
			"thirteen minutes", "fourteen minutes", "quarter", "sixteen minutes", "seventeen minutes",
			"eighteen minutes", "nineteen minutes", "twenty minutes", "twenty one minutes", "twenty two minutes",
			"twenty three minutes", "twenty four minutes", "twenty five minutes", "twenty six minutes",
			"twenty seven minutes", "twenty eight minutes", "twenty nine minutes", "half" };

	static String[] hours = { "zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve" };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		if(m==0)
			System.out.println(hours[h]+" o' clock");
		else if(m<=30)
			System.out.println(min[m]+" past "+hours[h]);
		else
			System.out.println(min[60-m]+" to "+hours[h+1]);
	}
}
