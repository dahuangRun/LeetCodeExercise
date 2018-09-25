package com.hone.SwordOffer027;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 题目：字符串的排列 
 * 思路：基于回溯法思想
 * 		对每一个数组做交换(https://www.nowcoder.com/questionTerminal/fe6b651b66ae47d7acce78ffdd9a96c7)
 * 
 * @author Xia
 *
 */
public class StringSort {
	public ArrayList<String> Permutation(String str) {
		
	   ArrayList<String> res = new ArrayList<String>();
	   
	   if (str != null && str.length() > 0 ) {
		   permutationHelp(str.toCharArray(),0,res);
		   Collections.sort(res);
	}
	   return res;
    }

	//递归每一个结点的本身和兄弟结点
	private void permutationHelp(char[] charArray, int i, ArrayList<String> res) {
		//判断i是否到了字符数组的结尾，如果到了，则判断是否已经添加到结果结合中
		//这个判断也是递归的出口
		if (i == charArray.length) {
			String temp = String.valueOf(charArray);
			//如果不包含当前字符串则，将其添加到集合中
			if (!res.contains(temp))
				res.add(temp);
		}else {
			for (int j = i; j < charArray.length; j++) {
				//将i位置的字符和j位置的字符交换
				swap(charArray,i,j);
				//交换完了再做这个层次的排序
				permutationHelp(charArray, i+1, res);
				//递归完之后将元素还原
				swap(charArray,i,j);
			}
		}
	}

	//交换数组中的两个元素
	private void swap(char[] cs, int i, int j) {
		char temp = cs[j];
		cs[j] = cs[i];
		cs[i] = temp;
	}
}
