package com.hone.algor003;

import java.util.HashSet;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度
 * 因为题目中要求给出不重复的连续子串，因此可以参考java中的HashSet<>结构来存储子串
 * @author Xia
 *
 */
public class LongestSubString {
	
	 public int lengthOfLongestSubstring(String s) {
	     if (s == null || s.length() < 1) {
			return 0;
		}
		HashSet<Character> subString = new HashSet<Character>();
		int pre = 0;	//子串的左边界
		int i = 0;		//子串的右边界
		int max_value = Integer.MIN_VALUE;			//定义最大的子串长度
		int length = s.length();					
		while (i < length) {
			//找到了重复的字符，判断当前子串的长度是否大于max_value，
			//并且pre指向该相同字符的下一个字符，重新开始一个新的窗口用于查找最长子串
			if (subString.contains(s.charAt(i))) {
				if ( (i - pre) > max_value) {
					max_value = i - pre;
				}
				//知道找到与当前字符相同的字符，然后才开启下一个字符串，跳过原来已经存在的字符
				while (s.charAt(pre) != s.charAt(i)) {
					subString.remove(s.charAt(pre));
					pre++;
				}
				//如果不相等，则一直往后遍历
				pre++;
			}else {
				subString.add(s.charAt(i));
			}
			i++;
		}
		max_value = Math.max(max_value, i-pre); 
		 
		 return max_value;
	    }

}
