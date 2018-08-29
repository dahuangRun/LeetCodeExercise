package com.hone.SwordOffer063;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题目：获取当前读取数据流的中位数。
 * 思路：为了保证插入新数据和取中位数的时间效率都高效，这里使用大顶堆+小顶堆的容器，并且满足：
 * 		1、两个堆中的数据数目差不能超过1，这样可以使中位数只会出现在两个堆的交接处；
 * 		2、大顶堆的所有数据都小于小顶堆，这样就满足了排序要求。
 * @author Xia
 *
 */
public class GetMedianInStream {
	private int count = 0;
	private PriorityQueue<Integer> minHeap = new PriorityQueue<>();		//小顶堆
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
		//优先队列默认是小顶堆，需要通过排序编程大顶堆
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	});
	
	public void insert(Integer num){
		
		//设置小顶堆那边的元素多余大顶堆，也就是在奇数的时候直接获取小顶堆的元素即可。
		//如果是count是奇数，新加入的元素应该进入大顶堆
		if (count % 2 != 0) {
			minHeap.add(num);
			int filteredMin = minHeap.poll();
			//筛选之后将小顶堆中的最小元素添加到大顶堆中
			maxHeap.add(filteredMin);
		}else {
			//如果是偶数，则将新加入的元素(加入到大顶堆中)，然后挑选出最大的元素，
			maxHeap.add(num);
			int filterMax = maxHeap.poll();
			//加入到小顶堆
			minHeap.add(filterMax);
		}
		count++;
	}
	
	/**
	 * 获得中位数
	 * @return
	 */
	 public Double GetMedian() {
	       if (count % 2 == 0) {			//如果总个数是偶数
			return new Double((minHeap.peek()+maxHeap.peek()))/2;
		} else {
			return new Double(minHeap.peek());
		}
	   }
}
