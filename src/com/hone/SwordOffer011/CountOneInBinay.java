package com.hone.SwordOffer011;

/**
 * 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * 思路：利用到位运算。
 * 
 * @author Xia
 *
 */
public class CountOneInBinay {
	public int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n-1);
		}
		return count;
	}
}
