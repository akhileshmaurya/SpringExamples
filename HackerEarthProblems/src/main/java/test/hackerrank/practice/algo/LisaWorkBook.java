package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LisaWorkBook {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split(" ");
		int n=Integer.parseInt(input[0]);
		int k=Integer.parseInt(input[1]);
		input=br.readLine().trim().split(" ");
		int problems,specialProb=0,pageNo=1;
		for (int i = 0; i < input.length; i++) {
			problems=Integer.parseInt(input[i]);
			//System.out.println("i:"+i+" problems:"+problems+" spe:"+specialProb+" page:"+pageNo);
			int probNo=1;
			while (problems>=k) {
				//System.out.println("i:"+i+" problems:"+problems+" spe:"+specialProb+" page:"+pageNo);
				problems=problems-k;
				if(pageNo>=probNo&&pageNo<=(probNo+k-1))
					specialProb++;
				pageNo++;
				probNo=probNo+k;
			}
			if(problems!=0){
				//System.out.println("i:"+i+" problems:"+problems+" spe:"+specialProb+" page:"+pageNo);
				if(pageNo>=probNo&&pageNo<=(probNo+problems-1))
					specialProb++;
				pageNo++;				
			}
		}
		System.out.println(specialProb);
	}
}
