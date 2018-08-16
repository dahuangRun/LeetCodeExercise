package com.hone.SwordOffer029;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 题目：输入n个整数，找出其中最小的K个数
 * @author Xia
 *
 */
public class GetLeastKNumbers {
public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if (k > input.length) {
			return temp;
		}
        
        for (int i = 0; i < input.length; i++) {
			if (!result.contains(input[i])) {
				result.add(input[i]);
			}
		}
        Collections.sort(result);
        for (int i = 0; i < k; i++) {
			temp.add(result.get(i));
		}
		return temp;
    }
}
