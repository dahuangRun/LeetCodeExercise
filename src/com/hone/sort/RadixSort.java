package com.hone.sort;

/**
 * 桶排序
 * @author Xia
 *
 */
public class RadixSort {
	/**
	 * 
	 * @param array  需要排序的数组
	 * @param d		 需要排序数组的位数
	 */
	public static void sort(int[] array,int d){
		int n = 1;		//表示位数
		int k = 0;		//保存每一位排序的结果用于下次排序输入,所用的计数下标
		int length = array.length;
		//用于保存每一次排序后的结果，同一位上相同的数放在同一个桶中
		int[][] backet = new int[10][length];
		//用于统计每一位上有几个数
		int[] order = new int[length];
		//将每一个数按照相应的位数分配
		while(n < d){
			for (int num : array) {
				 int digit = (num/n) % 10;
				 backet[digit][order[digit]] = num;
				 order[digit]++;
			}
			//将按照上一位排序好的数再重新分配到原数组中
			for (int i = 0; i < 10; i++) {
				if(order[i] != 0){
					for (int j = 0; j < order[i]; j++) {
						array[k] = backet[i][j];
						k++;
					}
				}
				order[i] = 0;
			}
			n *= 10;
			k = 0;			//将计数器重新置为零
		}
	}
	
	public static void main(String[] args) {
		int[] A=new int[]{73,22, 93, 43, 55, 14, 28, 65, 39, 81};
		sort(A, 100);
	    for(int num:A)
	    {
	        System.out.println(num);
	    }
	}
}