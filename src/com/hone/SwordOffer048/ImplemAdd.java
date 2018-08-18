package com.hone.SwordOffer048;

import java.math.BigInteger;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author Xia
 *
 */
public class ImplemAdd {
	public static int Add(int num1,int num2) {
		BigInteger bi1 = new BigInteger(num1+"");
		BigInteger bi2 = new BigInteger(num2+"");
		BigInteger res = bi1.add(bi2);
		return res.intValue();
    }
	public static void main(String[] args) {
		System.out.println(Add(1, 2));
	}
}
