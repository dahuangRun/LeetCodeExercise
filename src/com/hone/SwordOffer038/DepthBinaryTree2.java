package com.hone.SwordOffer038;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：输入一棵二叉树，求该树的深度
 * 思路2：非递归版本。
 * @author Xia
 *
 */
public class DepthBinaryTree2 {
	public int TreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		//里队列来存储各个节点
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int depth = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			depth++;
			//每次弹出一个结点，将该节点的左右子结点压入中。
			for (int i = 0; i < size; i++) {
				TreeNode temp = queue.poll();
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
				
			}
		}
		return depth;
	}
	
}


