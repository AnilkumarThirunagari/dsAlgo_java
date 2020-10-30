package ds.patterns;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int no =  scanner.nextInt();

		int[][] pascalMatrix = new int[no][no];
		
		displayMatrix(pascalMatrix);

		for(int i=0; i<pascalMatrix.length;i++) {
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i) {
					pascalMatrix[i][j]=1;
				}else {
					pascalMatrix[i][j]=pascalMatrix[i-1][j-1]+pascalMatrix[i-1][j];
				}
				
			}
		}
		
		displayMatrix(pascalMatrix);
		
	}

	public static void displayMatrix(int[][] pascalMatrix) {
		System.out.println("==========");
		for(int i=0; i<pascalMatrix.length; i++) {
			for(int j=0; j<pascalMatrix.length; j++) {
				System.out.print(pascalMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
