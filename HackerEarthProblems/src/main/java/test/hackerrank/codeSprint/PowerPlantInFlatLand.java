package test.hackerrank.codeSprint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PowerPlantInFlatLand {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sosMessage[] = br.readLine().trim().split(" ");
		int n=Integer.parseInt(sosMessage[0]);
		int m=Integer.parseInt(sosMessage[1]);
		String secondInput[] = br.readLine().trim().split(" ");
		int []spaceStations=new int[secondInput.length];
		for (int i = 0; i < secondInput.length; i++) {
			spaceStations[i]=Integer.parseInt(secondInput[i]);
		}
		Arrays.sort(spaceStations);
		
		int maxDiff=(spaceStations[0]-0);
		//System.out.println("MaxDiff :"+maxDiff);
		for (int i = 0; i < m-1; i++) {
			if(maxDiff<(spaceStations[i+1]-spaceStations[i])/2){
				  maxDiff=(spaceStations[i+1]-spaceStations[i])/2;
				  //System.out.println("MaxDiff :"+maxDiff);
			}
		}
		//System.out.println("MaxDiff :"+maxDiff);
		if(maxDiff<(m-1-spaceStations[spaceStations.length-1]))
			maxDiff=(m-1-spaceStations[spaceStations.length-1]);
		System.out.println(maxDiff);
	}

}
