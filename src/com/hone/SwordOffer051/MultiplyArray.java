package com.hone.SwordOffer051;

/**
 * 题目：构建乘机数组。
 * 思路：主要在于解决思路，题目中规定不能用除法。
 * 		思路参考：https://www.nowcoder.com/questionTerminal/94a4d381a68b47b7a8bed86f2975db46
 * @author Xia
 *
 */
public class MultiplyArray {
	public int[] multiply(int[] A) {
		int len = A.length;
		int[] B = new int[len];
		if (len != 0) {
			B[0] = 1;
			
			//计算下三角形的新值		从上往下计算
			for (int i = 1; i < len; i++) {
				B[i] = B[i-1] * A[i-1];
			}
			
			int temp = 1;
			//计算上三角的新值   从下往上计算
			for (int j = len - 2; j >= 0; j--) {
				temp *= A[j+1];
				B[j] *= temp;
			}
			
		}
		return B;
    }
}
