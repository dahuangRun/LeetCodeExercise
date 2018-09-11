package com.hone.SwordOffer013;


/**
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 思路:利用类似于插入排序的思想
 * 效果：时间复杂度为O(n^2),空间复杂度为O(1)
 * @author Xia
 *
 */
public class ReOrderArray2 {
	public void reOrderArray(int [] array) {
        int m = array.length;
        //记录已经排好的奇数的个数
        int k = 0;        
        for(int i = 0; i < m; i++){
            //如果是奇数则开始作交换
            if(array[i] % 2 ==1){
                int j = i;
                while(k < j){
                    int temp = array[j];
                    array[j] = array[j -1];
                    array[j-1] = temp;
                    j--;
                }
                k++;
            }
        }
    }
}
