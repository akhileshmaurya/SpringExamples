package test.hackerrank.matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountSumOfAllSubMatrix {
  public static void main(String[] args) throws Exception {
    myTestCases();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /* input sample
      2 2

      5 -3
           -1 2
    */
    System.out.println("Enter No. of row and column space seprated");
    String[] input = br.readLine().trim().split(" ");
    int row = Integer.parseInt(input[0]);
    int col = Integer.parseInt(input[1]);
    int[][] mat = new int[row][col];
    System.out.println("Enter every row " + row + " times.");
    for (int i = 0; i < row; i++) {
      String[] input2 = br.readLine().trim().split(" ");
      for (int j = 0; j < col; j++) {
        mat[i][j] = Integer.parseInt(input2[j]);
      }
    }
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat));
    System.out.println(countAllSubMatrixGreterThanSumK(mat, 0));
  }

  static long countAllSubMatrixGreterThanSumK(int[][] mat, long sumValue) {
    long totalMatrix = 0;
    int noOfRow = mat.length;
    int noOfColumn = mat[0].length;
    int[][] columnSum = new int[noOfRow][noOfColumn];
    int[][] rowSum = new int[noOfRow][noOfColumn];
    int[][] rowColumnSum = new int[noOfRow][noOfColumn];

    for (int i = 0; i < noOfRow; i++) {
      for (int j = 0; j < noOfColumn; j++) {

        if (mat[i][j] > sumValue) {
          totalMatrix++;
        } // matrix 1x1

        if (i == 0) columnSum[i][j] = mat[i][j];
        else {
          columnSum[i][j] = mat[i][j] + columnSum[i - 1][j];
          int temp = 0;
          for (int index1 = 0; index1 < i; index1++) {
            if (columnSum[i][j] - temp > sumValue) totalMatrix++; // matrix 2x1,3x1,...mx1
            temp = columnSum[index1][j];
          }
        }
        if (j == 0) rowSum[i][j] = mat[i][j];
        else {
          rowSum[i][j] = mat[i][j] + rowSum[i][j - 1];
          int temp = 0;
          for (int index1 = 0; index1 < j; index1++) {
            if (rowSum[i][j] - temp > sumValue) totalMatrix++; // matrix 1x2,1x3,...1xn
            temp = rowSum[i][index1];
          }
        }

        if (i == 0 && j == 0) rowColumnSum[i][j] = mat[i][j];
        else if (i == 0) {
          rowColumnSum[i][j] = rowColumnSum[i][j - 1] + mat[i][j];

        } else if (j == 0) {
          rowColumnSum[i][j] = rowColumnSum[i - 1][j] + mat[i][j];
        } else {
          rowColumnSum[i][j] =
              rowColumnSum[i - 1][j]
                  + rowColumnSum[i][j - 1]
                  - rowColumnSum[i - 1][j - 1]
                  + mat[i][j];
          if (rowColumnSum[i][j] > sumValue) totalMatrix++;
          for (int index1 = 0; index1 < i; index1++) {
            for (int index2 = 0; index2 < j; index2++) {
              if (index1 == 0 && index2 == 0) continue;
              int val = rowColumnSum[i][j];
              if (index2 > 0) val = val - rowColumnSum[i][index2 - 1];
              if (index1 > 0) val = val - rowColumnSum[index1 - 1][j];
              if (index1 > 0 && index2 > 0) val = val + rowColumnSum[index1 - 1][index2 - 1];
              if (val > sumValue) totalMatrix++; // others matrix
            }
          }
        }
      }
    }
    return totalMatrix;
  }

  private static long calculateAllSubMatrix(int[][] mat) {
    long noOfRow = mat.length, noOfColumn = mat[0].length;
    return (((noOfRow * (noOfRow + 1)) / 2) * ((noOfColumn * (noOfColumn + 1)) / 2));
  }

  private static void myTestCases() {

    int mat[][] = {{-5, -4, -3, -2}, {-1, -3, -5, -6}, {-5, -3, -4, 1}};
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat));
    System.out.println(countAllSubMatrixGreterThanSumK(mat, 0));
    int mat1[][] = {{5, 4, 3, 2}, {1, 3, 5, 6}, {8, 3, 4, 7}};
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat1));
    System.out.println(countAllSubMatrixGreterThanSumK(mat1, 0));
    int mat2[][] = {{-5, -4, -3, -2}, {-1, -3, -5, -6}, {-5, -3, -4, 7}};
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat2));
    System.out.println(countAllSubMatrixGreterThanSumK(mat2, 0));
    int mat3[][] = {{5, -4}, {-1, 3}};
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat3));
    System.out.println(countAllSubMatrixGreterThanSumK(mat3, 0));
    int mat4[][] = {{5, -4}, {-1, -3}};
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat4));
    System.out.println(countAllSubMatrixGreterThanSumK(mat4, 0));
    int mat5[][] = {{-5, -4}, {-1, -3}};
    System.out.println("Total Sub Matrix :" + calculateAllSubMatrix(mat5));
    System.out.println(countAllSubMatrixGreterThanSumK(mat5, 0));
  }
}
