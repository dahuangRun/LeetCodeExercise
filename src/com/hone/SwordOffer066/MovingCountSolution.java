package com.hone.SwordOffer066;

/**
 * 题目：
 * 
 * @author Xia
 */
public class MovingCountSolution {
	public int movingCount(int threshold, int rows, int cols) {
		//用一个二维数组标记点是否被访问到
		int[][] flag = new int[rows][cols];
		
		//判断一个点是否被访问到
		return helper(0,0,rows,cols,flag,threshold);
	}

	private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
		//如果下标值不符合要求，或者数字的值和大于threshold，或者flag = 1，则返回0，表示该点不能被访问到
		if (i < 0 || i >= rows || j < 0 || j >= cols || parseNum(i)+parseNum(j) > threshold || flag[i][j] == 1) {
			return 0;
		}
		//将坐标点比较为已经访问
		flag[i][j] = 1;
		return helper(i-1, j, rows, cols, flag, threshold)+
				helper(i+1, j, rows, cols, flag, threshold)+
				helper(i, j-1, rows, cols, flag, threshold)+
				helper(i, j+1, rows, cols, flag, threshold)+
				1;
	}

	//将数变化为sum
	private int parseNum(int i) {
		int sum = 0;
		while (i != 0) {
			sum += i % 10;
			i = i/10;
		}
		return sum;
	}
}
