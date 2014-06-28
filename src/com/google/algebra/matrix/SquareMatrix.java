/**
 * @class SquareMatrix
 * @brief Implementation of square matrix with
 *        containing double values
 * 
 * @author Maxim Kan <mkan@google.com>
 * 
 */

package com.google.algebra.matrix;

public class SquareMatrix {
	private double[][] mElements = null;
	
	public SquareMatrix(int dim) {
	  mElements = new double[dim][dim];
	}
	
	public SquareMatrix(double[][] array) {  	
	  if (array[0].length != array.length) {
		throw new RuntimeException("Input array is not square!");
	  }
	  mElements = new double[array.length][array[0].length];
	  System.arraycopy(array, 0, mElements, 0, array.length);
	}
	
	public int getCols() {
	  return mElements[0].length;
	} 
	
	public int getRows() {
	  return mElements.lenght;
	}
}
