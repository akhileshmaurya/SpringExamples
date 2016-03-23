package test.hackerearth.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().trim().split(" ");
		int largeMatSize = Integer.parseInt(input[0].trim());
		int subMatSize = Integer.parseInt(input[1].trim());
		int[][] inputMatrix = new int[largeMatSize][largeMatSize];
		for (int i = 0; i < largeMatSize; i++) {
			String rows[] = br.readLine().trim().split(" ");
			for (int j = 0; j < rows.length; j++) {
				inputMatrix[i][j] = Integer.parseInt(rows[j].trim());
			}
		}
		int allsubMatrixes = subMatrixNumbers(largeMatSize, subMatSize);
		int result = 0;
		int sum = subMatrixSumFromStartingColumn(inputMatrix, 0, 0, subMatSize);
		if (isCube(sum))
			result++;
		int row = 0;
		int column = 0;
		for (int i = 1; i < allsubMatrixes; i++) {

			if (row + subMatSize >= largeMatSize && column + subMatSize >= largeMatSize) {
				break;
			} else if (column + subMatSize >= largeMatSize) {
				row = row + 1;
				column = 0;

			} else {
				column++;
			}
			if (column == 0)
				sum = subMatrixSumFromStartingColumn(inputMatrix, row, column, subMatSize);
			else
				sum = subMatrixSubFromPreviousSum(inputMatrix, row, column, subMatSize, sum);
			if (isCube(sum))
				result++;
		}
		System.out.println(result);

	}

	private static boolean isCube(int maxSum) {
		int cuberoot = (int) Math.cbrt(maxSum);
		if (cuberoot * cuberoot * cuberoot == maxSum) {
			return true;
		}
		return false;
	}

	private static int subMatrixSumFromStartingColumn(int[][] m, int row, int column, int k) {
		int matSum = 0;
		for (int i = row; i < row + k; i++) {
			for (int j = column; j < column + k; j++) {
				matSum = matSum + m[i][j];
			}
		}
		return matSum;
	}

	private static int subMatrixSubFromPreviousSum(int[][] m, int row, int column, int k, int previousSum) {
		int matsum = previousSum;
		for (int i = 0; i < k; i++) {
			matsum = matsum + (m[row + i][column + k - 1] - m[row + i][column - 1]);

		}
		return matsum;
	}

	private static int subMatrixNumbers(int i, int j) {
		int diff = i - j + 1;
		return diff * diff;
	}

}
