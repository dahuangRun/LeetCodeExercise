package com.hone.algor009;

/**
 * 判断一个数是否是回文数 简单的基本思路：数字转化为字符串，然后翻转，判断前后字符串是否相等
 * 
 * @author Xia
 *
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String source = x +"";
		StringBuilder temp = new StringBuilder(source).reverse();
		if (source.equals(temp.toString())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int temp = 10;
		System.out.println(new PalindromeNumber().isPalindrome(temp));
		
	}
}
