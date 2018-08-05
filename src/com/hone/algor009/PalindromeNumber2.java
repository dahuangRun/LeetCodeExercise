package com.hone.algor009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 第二种方法判断一个数是否是回文字符串。
 * 		可以利用两个指针，从收尾开始判断字符是否相等
 * 		同时利用栈和队列的特征
 * 
 * @author Xia
 *
 */
public class PalindromeNumber2 {
	public boolean isPalindrome(int x) {
		if (x < 0 ) {
			return false;
		}
		
		Stack<Integer> num = new Stack<>();
		Queue<Integer> num2 = new LinkedList<>();
		while (x > 0 ) {
			num.push(x % 10);
			num2.add(x % 10);
			x = x / 10;
		}
		while (!num.isEmpty()) {
			if (num.pop() != num2.poll()) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int temp = 121;
		System.out.println(new PalindromeNumber2().isPalindrome(temp));
		
	}
}
