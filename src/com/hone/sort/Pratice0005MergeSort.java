package com.hone.sort;

/**
 * 归并排序
 * 思路：总体上采用分而治之的方法。将一个数组分为两部分，对每部分进行"分"，然后在合并。
 * 最主要的代码是合并：对于合并，刚开始肯定是左右两个数组，我们需要新建两个数组用于暂时的存储数据。
 * 					然后对两个数组进行比较大小再合并。
 * 时间复杂度： (nLogn).
 * 空间复杂度：O(n)
 * @author Xia
 *
 */
public class Pratice0005MergeSort {
	public void mergeSort(int[] a ,int l,int r){
		if (l < r) {
			int mid = (l + r)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, r);
			
			//合并两部分
			merger(a,l,mid,r);
		}
		
	}
	
	//合并两个数组 
	//第一个数组:arr[l,m] 
	//第二个数组:arr[m+1,r]
	private void merger(int[] a, int l, int m, int r) {
		
		//计算左右两边待合并数组的大小
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//创建两个空的数组
		int[] lTemp = new int[n1];
		int[] rTemp = new int[n2];
		
		//将数据复制到空数组中
		for (int i = 0; i < n1; i++) {
			lTemp[i] = a[l + i];
		}
		for (int j = 0; j < n2; j++) {
			rTemp[j] = a[m + 1 + j];
		}
		
		//合并两个辅助数组,初始化最开始的索引
		int i = 0;
		int j = 0;
		
		//定义合并之后的起始索引
		int k = l;
		
		while (i < n1 && j < n2) {
			if (lTemp[i] <= rTemp[j]) {
				a[k] = lTemp[i];
				i++;
			}
			else {
				a[k] = rTemp[j];
				j++;
			}
			k++;
		}
		
		//当比较之后lTemp还有剩余，则将lTemp数组全部复制到a数组中
		while (i < n1) {
			a[k] = lTemp[i];
			i++;
			k++;
		}
		//当比较之后rTemp还有剩余，则将rTemp数组全部复制到a数组中
		while (j < n2) {
			a[k] = rTemp[j];
			j++;
			k++;
		}
	}
}
