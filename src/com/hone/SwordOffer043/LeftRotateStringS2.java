package com.hone.SwordOffer043;

/**
 * 题目：把字符串循环左移K位后的序列输出
 * 思路：单纯的用旋转的思路来考虑。
 * 		对于原字符串s=XYZdefabc , n = 3 可以将s分为两部分A=XYZ   B = defabc
 * 		如果需要将s旋转，只需要先将A旋转(A.T)，B旋转(B.T)，再将(A.TB.T)旋转
 * 		核心：对字符串做三次翻转。
 * @author Xia
 */
public class LeftRotateStringS2 {
	public String LeftRotateString(String str, int n) {
		int len = str.length();
		if (len == 0 || n == 0) {
			return str;
		}
		StringBuilder sb1 = rotateString(str,0,n);		//旋转第一部分
		StringBuilder sb2 = rotateString(str, n, len);	//旋转第二部分
		StringBuilder sb3 = sb1.append(sb2);
		StringBuilder result = rotateString(sb3.toString(), 0, len);
		return result.toString();
	}

	private StringBuilder rotateString(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str.substring(i, j));
		return sb.reverse();
	}
	
	
	public static void main(String[] args) {
		String  string = "XYZdefabc";
		int n = 3;
		System.out.println(new LeftRotateStringS2().LeftRotateString(string, n));
	}
}
