package com.hone.algor005;

/**
 * 方法2：以某个元素为中心，分别计算偶数长度的回文最大长度和奇数长度的回文最大长度。
 * 相当于：奇数有一个中心，偶数有两个中心点，从中心点向两端判断，找出最长的回文子串
 * 效果：时间复杂度O(n^2)，空间O(1)
 * @author Xia
 *
 */
public class LongestPalindrome3 {
	
	
	public static String longestPalSubstr(String s){
		//最后字符串的长度
		int maxLength = 1;  
		
		int start = 0;
		int len  = s.length();
		
		int low ,hight;
		
		
		//这里面用i表示中心点的位置
		for (int i = 0; i < len; i++) {
			
			//首先查找最长的偶数回文字符串,有两个中心点，分别为 i -1、 i
			low = i -1;
			hight = i;
			while (low >= 0 && hight < len && s.charAt(low) == s.charAt(hight)) {
				if (hight - low + 1 > maxLength) {
					maxLength = hight - len + 1;
					start = low;
				}
				--low;
				++hight;
			}
			
			//其次寻找最长的奇数的最长回文字符串，中心点以i为主
			low = i - 1;
			hight = i + 1;
			while (low >= 0 && hight < len && s.charAt(low) == s.charAt(hight)) {
				if (hight - low + 1 > maxLength) {
					maxLength = hight - low + 1;
					start = low;
				}
				--low;
				++hight;
			}
		}
		
		//起始和结束的位置
		
		return s.substring(start, start + maxLength);
	}
	
	//测试方法
		public static void main(String[] args) {
			System.out.println(longestPalSubstr("cbvbd"));
		}
	
}
