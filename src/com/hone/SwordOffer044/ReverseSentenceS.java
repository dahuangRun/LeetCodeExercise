package com.hone.SwordOffer044;

/**
 * 题目：翻转单词顺序列
 * 思路：合理的利用StringBuilder,直接在翻转字符串的过程中将结果整理好。注意处理空格的方式。
 * @author Xia
 *
 */
public class ReverseSentenceS {
	public String ReverseSentence(String str) {
		if (str.trim().equals("")) {
			return str;
		}
		String[] words = str.trim().split(" ");
		int i = 0;
		StringBuilder res = new StringBuilder();
		for (int k = words.length -1; k >= 0; k--) {
			res.append(words[k]);
			if (k >= 1) {
				res.append(" ");
			}
		}
		return res.toString();
    }
}
