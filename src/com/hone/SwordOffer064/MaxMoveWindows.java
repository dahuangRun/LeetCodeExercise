package com.hone.SwordOffer064;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 题目：求解滑动窗口的每部分的最大值
 *     对新来的元素k，将其与双端队列中的元素相比较
 *     1）前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值了!）,
 *     2）前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
 *     队列的第一个元素是滑动窗口中的最大值
 * @author Xia
 *
 */
public class MaxMoveWindows {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (size == 0 ) {
			return res;
		}
		int begin;
		int len = num.length;
		//双端队列q中存储的是元素的下标值
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < len ; i++) {
			begin = i - size + 1;
			if (q.isEmpty())
				q.add(i);
			//判断q首的元素是否已经不再要求的范围之内，如果是的，则直接移除。
			else if (begin > q.peekFirst()) 
				q.pollFirst();
			
			//如果q不为空，并且新进入的元素值大于q中的数组值，则直接将原q中的值移除掉
			while ((!q.isEmpty()) && num[q.peekLast()] <= num[i]) {
				q.pollLast();
			}
			//然后把新加入的元素加进去
			q.add(i); 
			if (begin >= 0) {
				res.add(num[q.peekFirst()]);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] num = {2,3,4,2,6,2,5,1};
		int size = 3;
		System.out.println(new MaxMoveWindows().maxInWindows(num, size));
	}
}
