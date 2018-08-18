package com.hone.SwordOffer046;

import java.util.ArrayList;

/**
 * 题目：
 * 思路：利用list集合,关键点在于list.add()再添加元素的时候添加的起始也是下标值。
 * @author Xia
 *
 */
public class LastRemainingGift2 {
	public static int LastRemaining_Solution(int n, int m) {
		if (m <1 && n < 1) {
			return -1;
		}
		ArrayList<Integer> children = new ArrayList<Integer>();
		//初始化列表，同时用里面的值表示下标值
		for (int i = 0; i < n; i++) {
			children.add(i);
		}
		int index = -1;
		while (children.size() > 1) {
			index = (index + m ) % children.size();
			children.remove(index);
			index--;
		}
		//最后肯定只剩下一个元素
		return children.get(0);
	}
}
