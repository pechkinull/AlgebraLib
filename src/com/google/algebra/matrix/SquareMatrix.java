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
		throw new IllegalStateException("Input array is not square!");
	  }
	  mElements = new double[array.length][array[0].length];
	  System.arraycopy(array, 0, mElements, 0, array.length);
	}
	
	/**
	 * @brief Copy ctor
	 */
	public SquareMatrix(final SquareMatrix obj) {
	  mElements = new double[obj.getRows()][obj.getCols()];	
	  System.arraycopy(obj.mElements, 0, mElements, 0, obj.getDims());
	}
	
	public int getCols() {
	  return mElements[0].length;
	} 
	
	public int getRows() {
	  return mElements.length;
	}
	
	public int getDims() {
	  return mElements.length;
	}
	
	public double getElement(int row, int col) {
	  return mElements[row][col];	
	}
	
	@Override
	public String toString() {
	  StringBuilder str = new StringBuilder(); 
	  for (int i = 0; i < getRows(); ++i) {
		for (int j = 0; j < getCols(); ++j) {
		  str.append(Double.toString(getElement(i, j))).append(" ");   
		}  
        str.append("\n"); 
	  }   
	 return str.toString();
	} 
}
