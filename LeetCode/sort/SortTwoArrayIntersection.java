package sort;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目：给定两个数组，编写一个函数来计算它们的交集。
 * 思路：合理利用Set的唯一特点。
 * 		首先将第一数组添加到set里面，然后让遍历另一个数组，寻找是否在set里面有包含的值。
 * 		如果有，则将结果在存储到一个Set类型的temp中。
 * @author Xia
 *
 */
public class SortTwoArrayIntersection {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<Integer>();
        for(int i = 0; i < nums1.length;i++){
            res.add(nums1[i]);
        }
        
        Set<Integer> temp = new HashSet<Integer>();
        for(int i = 0;i< nums2.length;i++){
            if(res.contains(nums2[i])){
                temp.add(nums2[i]);
            }
        }
        
        //遍历temp，将set转化为array
        int[] result = new int[temp.size()];
        int i = 0;
        for (Integer t : temp) {
			result[i++] = t;
		}
		return result;
    }
}
