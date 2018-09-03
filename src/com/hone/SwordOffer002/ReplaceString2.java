package com.hone.SwordOffer002;

/**
 * 题目： 将一个字符串中的每个空格替换成“%20”
 * 将字符串从后往前开始替换。
 * @author Xia
 *
 */
public class ReplaceString2 {
	public String replaceSpace(StringBuffer str) {
		int spaceTemp = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				spaceTemp++;
			}
		}
		int indexold = str.length()-1;
		int newLength = str.length()+spaceTemp * 2;
		int indexnew = newLength-1;
		str.setLength(newLength);
		for (; indexold >=0 ; --indexold) {
			if (str.charAt(indexold) == ' ') {
				str.setCharAt(indexnew--, '0');
				str.setCharAt(indexnew--, '2');
				str.setCharAt(indexnew--, '%');
			}else {
				str.setCharAt(indexnew--, str.charAt(indexold));
			}
		}
		return str.toString();
	}
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We Are Happy.");
		System.out.println(new ReplaceString2().replaceSpace(sb));
	}
}
