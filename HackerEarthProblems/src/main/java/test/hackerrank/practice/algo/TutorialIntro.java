package test.hackerrank.practice.algo;

import java.util.Scanner;

public class TutorialIntro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int index=0,number;
		boolean notFound=true;
		int n = in.nextInt();
		for (int arr_i = 0; arr_i < n; arr_i++) {
			number=in.nextInt();
			if(notFound && number==v){
				index=arr_i;
				notFound=false;
			}
		}
		
		System.out.println(index);
		in.close();
	}
}
