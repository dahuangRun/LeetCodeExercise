package com.hone.SwordOffer013;

import java.util.LinkedList;
import java.util.List;

/**
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 思路:首先分别用两个LinkedList存储元素，将奇数和偶数元素分开存储，然后在存回到数组中。
 * @author Xia
 *
 */
public class ReOrderArray {
	public void reOrderArray(int [] array) {
        List<Integer> odd = new LinkedList<Integer>();
        List<Integer> even = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
        	if (array[i]%2 != 0) {
				odd.add(array[i]);
			}else {
				even.add(array[i]);
			}
		}
        for (int i = 0; i < odd.size(); i++) {
			array[i] = odd.get(i);
		}
        for (int i = 0; i < even.size(); i++) {
			array[odd.size()+i] = even.get(i);
		}
    }
}
