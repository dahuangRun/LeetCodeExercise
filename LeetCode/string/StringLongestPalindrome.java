package string;

/**
 * 求最长回文子串
 * 效果：时间复杂度O(n^2),空间O(n^2)
 * 思路：如果s(i,j)是回文串，则table[i][j] = true;否则定义为false
 * 		如何计算table[i][j]呢，我们可以首先检查table[i+1][j-1]是否为true，及s[i]是否等于s[j].
 * @author Xia
 *
 */
public class StringLongestPalindrome {
	
	public static String longestPalSubstr(String s){
		
		int n = s.length();
		
		boolean[][] table = new boolean[n][n];
		
		//所有的一个字符肯定是回文串
		int maxLength = 1;
		
		//组成的boolean矩阵的对角都肯定为true
		for (int i = 0; i < n; i++) {
			table[i][i] = true;
		}
		
		int start = 0;
		
		//如果字符串长度小于2，则直接处理
		for (int i = 0; i < n - 1; ++i) {
			if (s.charAt(i) == s.charAt(i +1)) {
				table[i][i+1] = true;
				start = i;
				maxLength = 2;
			}
		}
		
		//如果字符串长度大于2，则开始遍历处理，主要是通过两层for循环
		
		//检查字符串长度大于2的字符串，其中k表示子字符串的长度
		for (int k = 3; k <= n; ++k) {
			
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
		return s.substring(start, start+maxLength);
	}
	
}
