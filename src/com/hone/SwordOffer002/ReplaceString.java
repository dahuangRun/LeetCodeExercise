package com.hone.SwordOffer002;

/**
 * 题目： 将一个字符串中的每个空格替换成“%20”
 * 
 * @author Xia
 *
 */
public class ReplaceString {
	public String replaceSpace(StringBuffer str) {
		String temp = str.toString();
		String res = temp.replaceAll(" ", "%20");
		return res;
	}
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We Are Happy.");
		System.out.println(new ReplaceString().replaceSpace(sb));
	}
}
