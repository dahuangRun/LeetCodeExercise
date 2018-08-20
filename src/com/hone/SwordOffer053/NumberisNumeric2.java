package com.hone.SwordOffer053;

/**
 * 题目：字符串是否是数值
 * 思路: 可以一个数据正确性的性质，一部分一部分的分析。
 * 主要要点：+ —  .  E e 
 * @author Xia
 *
 */
public class NumberisNumeric2 {
	private int index = 0;
	public boolean isNumeric(char[] str) {
		if (str.length < 1) {
			return false;
		}
		
		//遍历开头的整数(也就是小数点之后的整数)
		boolean flag = scanInteger(str);
		
		//判断是否有小数点
		if (index < str.length && str[index] == '.') {
			index++;
			flag = scanUnsignInteger(str) || flag;		//有小数点的和没有小数点的一个成立即可
		}
		
		//判断是否采用了科学表述方法
		if (index < str.length &&(str[index] == 'E' || str[index] == 'e')) {
			index++;
			flag = flag && scanInteger(str);
		}
		return flag&&index==str.length;
		
		
	}
	
	//扫描整数
	private boolean scanInteger(char[] str) {
		if (index < str.length &&(str[index] == '+'||str[index] == '-')) {
			index++;
		}
		return scanUnsignInteger(str);
	}
	
	//扫描无符号的整数
	private boolean scanUnsignInteger(char[] str) {
		int start = index;
		//如果找到了整数，则index++,最后比较index和start的大小，如果不包含整数，则false,否则true
		while (index < str.length &&str[index] >= '0'&&str[index] <= '9') {
			index++;
		}
		return start<index;
	}
}
