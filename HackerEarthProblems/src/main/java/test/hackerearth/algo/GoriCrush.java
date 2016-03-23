package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoriCrush {

	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] query = br.readLine().trim().split(" ");
		int n = Integer.parseInt(query[0].trim());
		int q = Integer.parseInt(query[1].trim());
		int k = Integer.parseInt(query[2].trim());
		String[] list = br.readLine().split(" ");
		int x, y, a, b, c, d;
		for (int i = 0; i < q; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].trim().equalsIgnoreCase("0")) {
				x = Integer.parseInt(input[1]);
				list[x - 1] = input[2];

			} else if (input[0].trim().equalsIgnoreCase("1")) {
				a = Integer.parseInt(input[1].trim());
				b = Integer.parseInt(input[2].trim());
				c = Integer.parseInt(input[3].trim());
				d = Integer.parseInt(input[4].trim());
				String[] tempList = Arrays.copyOf(list, list.length);
				Arrays.sort(tempList);
				//System.out.println("Arrays is " + Arrays.toString(tempList));
				int count = 0;
				for (int j = 0; j < tempList.length; j++) {
					if (a <= Integer.parseInt(tempList[j]) && c <= Integer.parseInt(tempList[j])
							&& b >= Integer.parseInt(tempList[j]) && d >= Integer.parseInt(tempList[j]))
						count++;
					else if(b < Integer.parseInt(tempList[j])|| d < Integer.parseInt(tempList[j])){
						break;
					}
				}
				//System.out.println("count:" + count + " k:" + k);
				if (count >= k)
					System.out.println("Propose");
				else
					System.out.println("Do not propose");
			}

		}
	}

}
