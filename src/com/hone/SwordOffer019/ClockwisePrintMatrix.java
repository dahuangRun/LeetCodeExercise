package com.hone.SwordOffer019;

import java.util.ArrayList;

/**
 * 题目：顺时针打印矩阵
 * 
 * @author Xia
 *
 */
public class ClockwisePrintMatrix {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> res = new ArrayList<>();

		// 查看矩阵的行和列
		int row = matrix.length;
		int col = matrix[0].length;
		// 计算打印的圈数
		int circle = ((row < col ? row : col) - 1) / 2 + 1;
		
		for (int i = 0; i < circle; i++) {
			// 从左向右移动
			for (int j = i; j < col - i; j++) {
				res.add(matrix[i][j]);
			}

			// 从上往下开始添加
			for (int k = i + 1; k < row - i; k++) {
				res.add(matrix[k][col - i - 1]);
			}

			// 从右向左移动 (判断是否会重复打印)
			for (int m = col - i - 2; m >= i && (row - i - 1 != i); m--) {
				res.add(matrix[row - i - 1][m]);
			}

			// 从下到上开始添加元素 (判断是否会重复打印)
			for (int n = row - i - 2; (n > i) && (col - i - 1 != i); n--) {
				res.add(matrix[n][i]);
			}
		}
		return res;
	}
}
