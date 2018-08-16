package com.hone.SwordOffer032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 题目：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 		例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 
 * 思路：将所有的数存储到list中，然后做排序。但是这里面不是按照数排序，而是按照数字排序。也就是将int——String
 * 		比如：1234，345   在自定的比较器中 1234 345 < 345 1234。
 * 		
 * @author Xia
 *
 */
public class OrderPrintMinNumber {
	public String PrintMinNumber(int [] numbers) {
		List<Integer> list = new ArrayList<Integer>();
		String result = "";
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Inte());
		for (Integer integer : list) {
			result += integer;
		}
		return result;
    }

}

//自定义Integer比较器，不是比较数值的大小，而是比较数的大小。
class Inte implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		String s1 = o1+""+o2;
		String s2 = o2+""+o1;
		return s1.compareTo(s2);
	}
	
}
