package com.hone.algor005;

/**
 * 求最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。
 * 题目中并没有规定时间复杂度。
 *  第一种方法：提供最暴力的方法    *************(超时)**************
 *  	从最长的字符串开始迭代，如果找到了回文字符串则终止循环
 *  	采用由两端 到中心的方法检验字符串是否为回文字符串。
 *  	这种方法时间复杂度接近  O(n^3)
 * @author Xia
 *
 */
public class LongestPalindrome1 {
	
	//利用两个for循环来遍历所有的子串，并且在里面再加一层while循环用于判断字符串是否是回文串
	public String longestPalindrome(String s) {
		for (int size = s.length(); size > 0; size--) {
			for (int low = 0, hight = low+size-1; hight < s.length(); low++,hight++) {
				if (isPalindrome(s,low,hight)) {
					return s.substring(low, hight+1);
				}
			}
		}
		return s.substring(0, 1);
	}
	
	//判断一个字符串是否是回文字符
	private boolean isPalindrome(String s, int low, int hight) {
		while (low < hight) {
			if(s.charAt(low) == s.charAt(hight)){
				low++;
				hight--;
			}else {
				return false;
			}
		}
		return true;
	}
	
	//测试方法
	public static void main(String[] args) {
		System.out.println(new LongestPalindrome1().longestPalindrome("cbbd"));
	}

}
