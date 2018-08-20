package com.hone.SwordOffer050;

/**
 * 返回一个数组中的数是否重复。
 * 思路1：定义一个长度为n的数组，将numbers[i]中的数作为新数组的下标值。
 * 优点：简单易懂。
 * 缺点：空间复杂度高。
 * @author Xia
 *
 */
public class DuplicateNumber {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    int[] num = new int[length];
	    for (int i = 0; i < length; i++) {
	    	if (num[numbers[i]] == 0) {
	    		num[numbers[i]] = 1;
			}else if (num[numbers[i]] == 1) {
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
    }
}
