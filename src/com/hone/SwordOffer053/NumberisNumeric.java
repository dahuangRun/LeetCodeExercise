package com.hone.SwordOffer053;

/**
 * 题目：字符串是否是数值
 * 思路:利用正则表达式。
 *		[\\+\\-]?            -> 正或负符号出现与否
 *		\\d*                 -> 整数部分是否出现，如-3.34 或 +3.34均符合
 *		(\\.\\d+)?     		-> 如果出现小数点，那么小数点后面必须有数字；否则一起不出现
 *		([eE][\\+\\-]?\\d+)? -> 如果存在指数部分，那么e或E肯定出现，+或-可以不出现， 紧接着必须跟着整数；或者整个部分都不出现
 *
 * @author Xia
 *
 */
public class NumberisNumeric {
	public boolean isNumeric(char[] str) {
		String string = String.valueOf(str);		//将字节数组转化为字符串
		return string.matches("[\\+\\-]?\\d*(\\.\\d*)?([eE][\\+\\-]?\\d+)?");

	}
}
