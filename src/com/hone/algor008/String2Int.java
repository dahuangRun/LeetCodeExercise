package com.hone.algor008;

/**
 * 目的：将String转化为int
 * 注意：去掉首尾段的空白字符
 * 		记住需要判断是否为空
 * 		标记正负
 * 		剔除空白字符
 * 		判断数值是否超过范围
 * 
 * 整体思路是这样，但是还是有一点点小问题。
 * @author Xia
 *
 */
public class String2Int {
	public int myAtoi(String str) {
		
		if (str.isEmpty()) {
			return 0;
		}
		
		//剔除字符串中所有的空白字符
		str = str.trim();
		
		if (str.isEmpty()) {
			return 0; 
		}
		
		int index = 0;
		
		String goalS = "";
		
		int singal = 1;
		//正负号的判断
		if (str.charAt(0)=='+' || str.charAt(0)=='-') {
			singal = str.charAt(index) == '-' ? -1 : 1;
			index++;
		}
		
		if (index<str.length()&&!(str.charAt(index)<='9'&&str.charAt(index)>='0')) {
			return 0;
		}else {
			while (index<str.length()&&str.charAt(index)<='9'&&str.charAt(index)>='0') {
				goalS += str.charAt(index);
				index++;
			}
		}
		if (goalS.isEmpty()) {
			return 0;
		}
		double temp = Double.parseDouble(goalS.trim());
		if (temp > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE * singal-1;
		}else if (temp < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE * singal;
		}else {
			return Integer.parseInt(goalS.trim()) * singal;
		}
		
	}
	
	
	public static void main(String[] args) {
		String input = "2147483648";
		System.out.println(new String2Int().myAtoi(input));
		
	}

}
