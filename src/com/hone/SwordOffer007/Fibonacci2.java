package com.hone.SwordOffer007;

/**
 * 题目：现在要求输入一个整数n，请你输出斐波那契数列的第n项
 * 第一种方法：可以利用动态规划  时间复杂度可以控制在：O(n)
 * 当然也可以说是迭代。
 * @author Xia
 *
 */
public class Fibonacci2 {
	public int Fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int[] record = new int[n+1];
		record[0] = 0;
		record[1] = 1;
		for (int i = 2; i <= n; i++) {
			record[i] = record[i-1]+record[i-2];
		}
		return record[n];
	}
}
