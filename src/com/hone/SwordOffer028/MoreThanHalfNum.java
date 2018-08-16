package com.hone.SwordOffer028;

/**
 * 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 
 * 题目中如果出现的次数超过长度一半，则一定有相邻的元素,则可以通过消除不相等的数。
 * 最后留下的数可能是所求的数。 思路：采用用户“分形叶”思路
 * 
 * @author Xia
 *
 */
public class MoreThanHalfNum {
	public int MoreThanHalfNum_Solution(int[] array) {
		int length = array.length;
		if (array == null || length <= 0) {
			return 0;
		}
		if (length == 1) {
			return array[1];
		}
		// 作为一个临时数组
		int[] tempArray = new int[length];
		for (int i = 0; i < length; i++) {
			tempArray[i] = array[i];
		}
		for (int i = 0; i < length; i++) {
			// 后面需要用零来代表抹除数字，所以对0时做特殊处理
			if (tempArray[i] == 0) {
				continue;
			}
			for (int j = i + 1; j < length; j++) {
				if (tempArray[i] != tempArray[j] && tempArray[j] != 0) {
					tempArray[i] = 0; // 此处用0代表抹去该数字
					tempArray[j] = 0;
					break;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.println(tempArray[i]);
		}

		// 找出未被抹去的数字
		int result = 0;
		for (int i = 0; i < length; i++) {
			if (tempArray[i] != 0) {
				result = tempArray[i];
				break;
			}
		}
		
		//result在array中出现的次数。
		int times = 0;
		for (int i = 0; i < length; i++) {
			if (result == array[i]) {
				times++;
			}
		}
		if (times * 2 < length) {
			result = 0;
		}
		return result;
	}

}
