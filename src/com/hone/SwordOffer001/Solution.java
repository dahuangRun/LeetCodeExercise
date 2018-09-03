package com.hone.SwordOffer001;

/**
 * 题目：查找二维矩阵中的值。 
 * 思路：因为矩阵是有序的，所有可以将初始值定在左下角。(当然也可以定义在右上角)
 * 从左下角来看，如果target大于左下角的数，则向右移;小于则向左移动。
 * 
 * @author Xia
 *
 */
public class Solution {
	public boolean Find(int target, int[][] array) {
		int rowCount = array.length;
		int colCount = array[0].length;
		int i, j;
		for (i = rowCount - 1, j = 0; i >= 0 && j < colCount;) {
			if (target == array[i][j]) {
				return true;
			}
			if (target < array[i][j]) {
				i--;
				continue;
			}
			if (target > array[i][j]) {
				j++;
				continue;
			}
		}

		return false;
	}
}