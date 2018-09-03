package com.hone.SwordOffer007;

/**
 * 题目：现在要求输入一个整数n，请你输出斐波那契数列的第n项 
 * 第三种方法：可以利用动态规划
 * 
 * @author Xia
 *
 */
public class Fibonacci3 {
	public int Fibonacci(int n) {
		int f = 0;
		int g = 1;
		while (n-- != 0) {
			g += f;
			f = g - f;
		}
		return f;

	}
}
