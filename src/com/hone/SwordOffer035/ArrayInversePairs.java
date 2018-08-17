package com.hone.SwordOffer035;

/**
 * 数组中的逆序对
 * 思路：核心思路其实还是归并排序。先将数组进行分组，分组到最后为1的时候，在进行合并。
 * 		合并时，出现前面的数组值array[i]大于后面数组值array[j]时；则前面i和后面数组
 * 		j-end的数都是逆序排序。
 * @author Xia
 *
 */
public class ArrayInversePairs {
	public int InversePairs(int[] array) {
		int n = array.length;
		if (array == null || n <= 0) {
			return 0;
		}
		//定义辅助函数
		int[] copy = new int[n];
		for (int i = 0; i < n; i++) {
			copy[i] = array[i];
		}
		int count = InversePairsCore(array,copy,0,n-1);
		return count;

	}
	
	private int InversePairsCore(int[] array, int[] copy, int start, int end) {
		if (start == end) {
			return 0;
		}
		int mid = (start + end)/2;
		int leftCount = InversePairsCore(array, copy, start, mid)%1000000007;
		int rightCount = InversePairsCore(array, copy, mid+1, end)%1000000007;
		
		int count = 0;
		int i = mid;
		int j = end;
		int locCopy = end;			//开始复制的位置
		while (i >= start && j > mid) {
			if (array[i] > array[j]) {
				count += j-mid;			//如果前半部分的数x比后半部分的最大值都大，则x与后半部分的所有值都是逆序对
				copy[locCopy--] = array[i--];
				if (count >= 1000000007) {
					count %= 1000000007;
				}
			}
			else {
				copy[locCopy--] = array[j--];
			}
			
		}
		
		//将最后两部分没有比较完的数直接复制过去
		for (; i >= start; i--) {
			copy[locCopy--] = array[i];
		}
		
		for (; j > mid; j--) {
			copy[locCopy--] = array[j];
		}
		for (int k = start; k <= end; k++) {
			array[k] = copy[k];
		}
		
		return (leftCount+rightCount+count)%1000000007;
	}
}
