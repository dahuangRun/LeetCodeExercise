package com.hone.SwordOffer028;

/**
 * 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 题目中如果出现的次数超过长度一半，则一定有相邻的元素,则可以通过消除不相等的数。最后留下的数可能是所求的数。
 * 思路：采用用户“分形叶”思路
 * 
 * @author Xia
 *
 */
public class MoreThanHalfNum2 {
	public int MoreThanHalfNum_Solution(int[] array) {
		int length = array.length;
		if (array == null || length <= 0 ) {
			return 0;
		}
		if (length == 1) {
			return array[0];
		}
		
		int result = array[0];
		int times = 1;
		for (int i = 1; i < length; i++) {
			if (times == 0) {
				result = array[i];
				times = 1;
			}else {
				if (result == array[i]) {
					times++;
				}else {
					times--;
				}
			}
		}
		
		//统计与result相等数的次数
		times = 0;
		for (int i = 0; i < length; i++) {
			if (result == array[i]) {
				times++;
			}
		}
		
		if (times < length/2) {
			result = 0;
		}
		return result;
	}
    
}
