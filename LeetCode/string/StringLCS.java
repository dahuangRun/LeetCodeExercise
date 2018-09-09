package string;

import java.util.Stack;

/**
 * 题目：最长公共子序列。(longest common subsequence)
 * 比如字符串a = acdfg  b =adfc  则其lcs 为 adf 。
 * 
 * 思路：可以利用动态规划的思想。
 * 
 * @author Xia
 *
 */
public class StringLCS {
	public String lsc(String s1,String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		//用一个二维数组表示，这里面为了方便表示将数组行、列都扩大一个(想一想原因，可以结合上面的模式图思考)
		int[][] c = new int[len1 + 1][len2 + 1];
		//为了配合上面的增加一列，字符串中也应该增加一个字符
		s1 = ","+s1;
		s2 = "?"+s2;
		
		//c中的第一行第一列都赋值为0
		int i,j;
		for (i = 0; i <= len1; i++) {
			c[i][0] = 0;
		}
		
		for (j = 0; j <= len2; j++) {
			c[0][j] = 0;
		}
		//这里面开始遍历的时候必须从1开始
		for ( i = 1; i <= len1; i++) {
			for ( j = 1; j <= len2; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					c[i][j] = c[i-1][j-1]+ 1;
				}else {
					c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
				}
			}
		}
		//--------------两层for循环结束后即可得到最长公共子序列的长度
		
		//--------------开始求解最长公共子序列------------------
		//从求好的二维数组末端开始向前寻找,那么为了最后能够最长的输出子序列，需要定义一个stack
		i = len1;
		j = len2;
		Stack<Character> s = new Stack<Character>();
		while (i != 0 && j != 0) {
			if (s1.charAt(i) == s2.charAt(j)) {
				s.push(s1.charAt(i));
				i--;
				j--;
			}else {
				if (c[i][j-1] > c[i-1][j]) {
					j--;
				}else {
					i--;
				}
			}
		}
		//-------------到这一步，已经求好了最长公共子序列并且存储在stack中
		StringBuilder sb = new StringBuilder();
		while (!s.isEmpty()) {
			sb.append(s.pop());
		}
		return sb.toString();
	}

}
