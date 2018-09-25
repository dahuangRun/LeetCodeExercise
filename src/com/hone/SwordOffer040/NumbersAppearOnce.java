package com.hone.SwordOffer040;

import java.util.Map;
import java.util.HashMap;
/**
 * 题目：一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 先可以用一个暴力方法求解
 * 但是这个题目考察的点不在于这个。
 * @author Xia
 *
 */
public class NumbersAppearOnce {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		int len = array.length;
		Map<Integer,Integer> res = new HashMap<Integer,Integer>();
		for(int i = 0; i < len; i++){
			if(res.containsKey(array[i])){
				res.put(array[i],res.get(array[i])+1);
			}else{
				res.put(array[i],1);
			}
		}
		int count = 0;
		for(int i = 0; i < len; i++){
			if(res.get(array[i]) == 1 && count ==0){
				num1[0] = array[i];
				count++;
			}else if(res.get(array[i]) == 1 && count ==1){
				num2[0] = array[i];
				count++;
			}
		}
		
	}
}
