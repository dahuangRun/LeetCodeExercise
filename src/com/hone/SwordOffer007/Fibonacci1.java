package com.hone.SwordOffer007;

/**
 * 题目：现在要求输入一个整数n，请你输出斐波那契数列的第n项
 * 第一种方法：递归调用。
 * 缺点：时间复杂度非常大
 * @author Xia
 *
 */
public class Fibonacci1 {
	public int Fibonacci(int n) {
		if (n <= 1) {
			return n;
		}else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
}
