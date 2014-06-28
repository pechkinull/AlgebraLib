package com.google.algebra.matrix;

import com.google.algebra.matrix.SquareMatrix;

public class Demo {
	public static void main(String[] argv) {
		SquareMatrix mat1 = new SquareMatrix(2);
		SquareMatrix mat2 = new SquareMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
		
		System.out.println(mat1.getCols() + " " + mat1.getRows());
		System.out.println(mat2.getCols() + " " + mat2.getRows() + " " + mat2.getElement(1, 2));
		System.out.println(mat1.toString());
		System.out.println("");
		System.out.println(mat2);
		
	}
}

		
