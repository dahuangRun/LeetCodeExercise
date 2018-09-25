package com.hone.sort;

public class Pratice0006HeapSort {

	
	/**
	 * 堆排序最核心的部分
	 * 1： 将一个数组中的所有元素创建一个最大堆
	 * 2：每次取出最大堆中的根元素，然后将剩余的元素构建为最大堆
	 * 3：依次上面的循环直到堆中的元素等于0
	 */
	public void heapSort(int[] a){
		int len = a.length;
		
		//构建最大堆,开始从元素对半的地方开始构建，也就是叶子结点的位置
		for (int i = len / 2 -1; i >= 0; i--) {
			createHeap(a,len,i);
		}
		
		//每次将root上面的元素取到合适的位置。i同时也表示的剩余没有排序的元素
		for (int i = len-1; i >= 0; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			
			createHeap(a, i, 0);
		}
	}
	
	
	/**
	 * 创建最大堆
	 * 其中i表示数组a中的元素，n表示堆的大小
	 */
	public void createHeap(int[] a,int n,int i){
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
		//如果左结点大于root
		if(l < n && a[l] > a[largest])
			largest = l;
		
		//如果右子结点大于root
		if(r < n && a[r] > a[largest])
			largest = r;
			
		//如果经过上面两步，使larget的下标位置得到了改变
		if (largest != i) {
			int swap = a[i];
			a[i] = a[largest];
			a[largest] = swap;
			
			//然后再对交换之后的子树做最大堆的构建
			createHeap(a, n, largest);
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {4,3,6,9,7,2};
		printArray(a);
		Pratice0006HeapSort heap = new Pratice0006HeapSort();
		heap.heapSort(a);
		System.out.print("Sorted: ");
		printArray(a);
	}


	/**
	 * 辅助的打印类
	 * @param a
	 */
	private static void printArray(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
