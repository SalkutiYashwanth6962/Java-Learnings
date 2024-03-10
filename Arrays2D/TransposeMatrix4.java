package com.Arrays2D;

public class TransposeMatrix4 {
  public static void main(String[] args) {
	int[][] originalMatrix= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] transposeMatrix= new int[originalMatrix.length][originalMatrix.length];
	for(int i=0;i<originalMatrix.length;i++) {
		for(int j=0;j<originalMatrix[i].length;j++) {
			transposeMatrix[j][i]=originalMatrix[i][j];
		}
	}
	
	for(int i=0;i<transposeMatrix.length;i++) {
		for(int j=0;j<transposeMatrix[i].length;j++) {
			System.out.print(transposeMatrix[i][j]+" ");
		}
		System.out.println();
	}
}
}
