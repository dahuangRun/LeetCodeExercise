package com.hone.SwordOffer043;

/**
 * 题目：把字符串循环左移K位后的序列输出
 * 思路：如果只是把一个字符串相互移动，肯定很复杂，我们可以复制一个相同的字符串，然后在长的字符串中做响应的截取。
 * 		但是显然违背了出题者的目地。
 * @author Xia
 *
 */
public class LeftRotateStringS {
	public String LeftRotateString(String str, int n) {
		int len = str.length();
		if (len == 0) {
			return "";
		}
		n = n % len;
		str += str;   //合并两个相同的字符串
		return str.substring(n, n+len);				//从两个好像的字符串中截取目标字符串
	}
}
