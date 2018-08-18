package com.hone.SwordOffer045;

import java.util.Arrays;

/**
 * 题目：判断扑克牌是否是顺子
 * 思路：先将numbers排序，然后统计0的个数，计算各个数之间的间隔。
 * 		如果有对子直接为false(当然除0之外).
 * @author Xia
 *
 */
public class ContinuousString {
	public boolean isContinuous(int [] numbers) {
		int numberZero = 0;			//统计大小王的个数
		int numberInterval = 0;		//计算数之间的间隔
		int len = numbers.length;	//数组的长度
		if (len == 0) {
			return false;
		}
		Arrays.sort(numbers); 		//对数组进行排序
		for (int i = 0; i < len - 1; i++) {
			//计算0的个数，也就是大小王的个数,如果是零直接跳出本次循环
			if (numbers[i] == 0) {
				numberZero++;
				continue;
			}
			//出现一对肯定不是顺子
			if (numbers[i] == numbers[i+1]) {
				return false;
			}
			//统计间隔数    
			numberInterval += numbers[i+1]-numbers[i]-1; 
		}
		if (numberInterval > numberZero) 
			return false;
		else 
			return true;
	}
}
