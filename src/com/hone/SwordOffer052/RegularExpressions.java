package com.hone.SwordOffer052;

/**
 * 题目：实现正则表达式 
 * 思路：多种分类情况。主要区分下一个字符是否是*.
 * 		同时也利用递归 操作。   
 * 	主要思路：区分第二个字符串是否是  * 
 * 			——> 不是 *
 * 				——> 如果字符串第一个字符和模式中的第一个字符相匹配，那么字符串和模式都后移一个字符，然后匹配剩余的。
 * 				——> 如果 字符串第一个字符和模式中的第一个字符相不匹配，直接返回false。
 * 			——> 是 *
 * 				——> 如果字符串第一个字符跟模式第一个字符不匹配，则模式后移2个字符，继续匹配。
 * 				——> 如果字符串第一个字符跟模式第一个字符匹配，可以有3种匹配方式：
 * 					——> 1、模式后移2字符，相当于x*被忽略；
 * 					——> 2、字符串后移1字符，模式后移2字符；
 * 					——> 3、字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；
 * @author Xia
 *
 */
public class RegularExpressions {
	public boolean match(char[] str, char[] pattern) {
		if (str == null&&pattern == null) {
			return true;
		}
		if (str != null && pattern == null) {
			return false;
		}
		
		
		
		
		return false;

	}
}
