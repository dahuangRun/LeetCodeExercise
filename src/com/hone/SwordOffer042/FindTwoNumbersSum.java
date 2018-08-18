package com.hone.SwordOffer042;

import java.util.ArrayList;

/**
 * 题目：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 		如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 思路：数列满足递增，设两个头尾两个指针i和j，
 * 		若ai + aj == sum，就是答案（相差越远乘积越小）
 * 		若ai + aj > sum，aj肯定不是答案之一，j -= 1
 * 		若ai + aj < sum，ai肯定不是答案之一，i += 1
 * @author Xia
 *
 */
public class FindTwoNumbersSum {
	 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 int n = array.length;
		 int i = 0;
		 int j = n-1;
		 while (i < j) {
			if (array[i] + array[j] == sum ) {
				numbers.add(array[i]);
				numbers.add(array[j]);
				break;
			}
			while (i < j && array[i] + array[j] > sum) {
				j--;
			}
			while (i < j && array[i] + array[j] < sum) {
				i++;
			}
		}
		return numbers;
	   }
}
