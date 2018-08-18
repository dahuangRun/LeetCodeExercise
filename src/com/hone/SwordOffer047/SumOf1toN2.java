package com.hone.SwordOffer047;

/**
 * 题目：求1+2+3+...+n
 * @author Xia
 * 思路：利用用异常退出递归
 */
public class SumOf1toN2 {
	public int Sum_Solution(int n) {
		return sum(n);
    }

	private int sum(int n) {
		try {
			int i = 1%n;
			return n+sum(n-1);
		} catch (Exception e) {
			return 0;
		}
	}
}
