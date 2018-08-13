package com.hone.SwordOffer023;

/**
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 		如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 * 注意二叉搜索树的性质：左子树都比根节点小，右子树都比根节点大。
 * 
 * 思路：对一个序列S，最后一个元素是x(也就是根)，如果去掉最后一个元素的序列为T，
 * 		那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，
 * 		且这两段（子树）都是合法的后序序列。
 * @author Xia
 *
 */
public class VerifyStringOfBST {
	 public boolean VerifySquenceOfBST(int [] sequence) {
		//如果长度为0，则不是后序遍历
		 if (sequence.length == 0) {
			return false;
		}
		 //如果长度为1，则一定是后序遍历
		if (sequence.length == 1) {
			return true;
		} 
		return judge(sequence,0,sequence.length-1);
		 
	  }

	 //判断数组sequence是否是后序遍历
	private boolean judge(int[] a, int start, int root) {
		
		if (start >= root) {
			return true;
		}
		
		int i = root;
		//从后开始寻找，用于将数据分为左子树和右子树两部分
		while (i > start && a[i-1] > a[root])
			i--;  			//找到比根小的坐标
			
			//判断左子树是否比根节点小，反应到数组的前部分。
			for (int j = start; j < i-1; j++) {
				if (a[j] > a[root]) {
					return false;
				}
		}
		
		return judge(a, start, i-1)&&judge(a, i, root-1);
	}
}
