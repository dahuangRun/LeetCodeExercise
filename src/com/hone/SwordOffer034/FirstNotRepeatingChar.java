package com.hone.SwordOffer034;

/**
 * 题目：在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回-1（需要区分大小写）. 
 * 思路：将所有的字符定义为一个数组，将每个字符作为数组的下标值。
 * 		优点：简单易懂。
 * 		缺点：空间浪费。
 * 
 * @author Xia
 *
 */
public class FirstNotRepeatingChar {
	public int FirstNotRepeatingChar_method(String str) {
		char[] chars = str.toCharArray();
		int[] map = new int[256];
		for (int i = 0; i < chars.length; i++) {
			map[chars[i]]++;
		}
		for (int i = 0; i < chars.length; i++) {
			if (map[chars[i]] == 1)
				return i;
		}
		return -1;
	}

}
