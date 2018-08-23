package com.hone.SwordOffer058;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：判断一棵二叉树是否是对称二叉树
 * 思路：利用迭代的思路。相当于模拟两种遍历的方式，DLR,DRL.
 * 		其实类似于BFS
 * @author Xia
 *
 */
public class IsSymmetricalTree2 {
	public boolean isSymmetrical(TreeNode pRoot){
		
		if (pRoot == null) {
			return true;
		}
		
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
//		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		
		
		q1.add(pRoot.left);
		q1.add(pRoot.right);
		
		while (!q1.isEmpty()) {
			TreeNode left = q1.poll();		//先将原来队列中的元素弹出
			TreeNode right = q1.poll();
			
			if (left == null && right == null) {
				continue;
			}
			
			//如果只要一边为空，则直接返回false
			if (left == null || right == null) {
				return false;
			}
			
			//如果两遍都不为空，但是值不一样，则直接返回false
			if (left.val != right.val) {
				return false;
			}
			
			q1.add(left.left);
			q1.add(right.right);
			q1.add(left.right);
			q1.add(right.left);
		}
		return true;
    }
}
