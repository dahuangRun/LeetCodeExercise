package array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 题目：求所有数组的所有子集
 * flags[start] = false；代表数组中索引为start的元素不在该子集中，而后进入递归，元素索引向后加一;
 * 同样索引为start+1的元素也有在或者不在该子集中两种可能性，当start==end时，
 * 即集合中的所有元素都已经阐明了在或者不在该子集中，输出该子集后，return跳出该层递归。 
 * @author Xia
 */
public class ArraySubSet {
	static Set<List<Integer>> set = new HashSet<>();
	public static void main(String[] args) {
		int[] arr = {1,2,2,3};
		int len = arr.length;
		boolean[] has = new boolean[len];
		findSub(arr,0,len,has);
		System.out.println(set);
	}
	
	private static void findSub(int[] arr, int start, int end, boolean[] has) {
		if(start == end){
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < has.length; i++) {
				if(has[i])
					list.add(arr[i]);
			}
			set.add(list);
		}else {
			
			has[start] = true;
			findSub(arr, start + 1, end, has);
			has[start] = false;
			findSub(arr, start+1, end, has);
		}
	}
}
