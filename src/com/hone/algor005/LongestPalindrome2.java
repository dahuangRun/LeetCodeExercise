package com.hone.algor005;

/**
 * 方法2：可以使用动态规划的方法
 * 效果：时间复杂度O(n^2),空间O(n^2)
 * @author Xia
 *
 */
public class LongestPalindrome2 {
	
	
	public static String longestPalSubstr(String s){
		
		int n = s.length();
		
		boolean[][] table = new boolean[n][n];
		
		int maxLength = 1;
		//组成的boolean矩阵的对角都肯定为true
		for (int i = 0; i < n; i++) {
			table[i][i] = true;
		}
		
		int start = 0;
		//如果字符串长度小于2，则直接处理
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == s.charAt(i +1)) {
				table[i][i+1] = true;
				start = i;
				maxLength = 2;
			}
		}
		
		//如果字符串长度大于2，则开始遍历处理，主要是通过两层for循环
		
		//检查字符串长度大于2的字符串，其中k表示子字符串的长度
		for (int k = 3; k <= n; k++) {
			//i表示子字符串中起始的位置
			for (int i = 0; i < n - k + 1; i++) {
				
				//获取子字符串结束的位置，
				int j = i + k - 1;
				
				if (s.charAt(i) == s.charAt(j) && table[i+1][j-1]) {
					table[i][j] = true;
					if (k > maxLength) {
						maxLength = k;
						start = i;
					}
				}
			}
		}
		return s.substring(start, start+maxLength-1);
	}
	
	//测试方法
		public static void main(String[] args) {
			System.out.println(new LongestPalindrome1().longestPalindrome("cbdkchhckdbd"));
		}
	
}
