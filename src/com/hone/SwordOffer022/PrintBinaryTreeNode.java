package com.hone.SwordOffer022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。 
 * 其实就是二叉树的层序遍历。可以利用到队列的结构。
 * 
 * @author Xia
 *
 */
public class PrintBinaryTreeNode {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		//res用于存储返回结果，temp为用于保存中间元素的队列。
		ArrayList<Integer> res = new ArrayList<Integer>();
		Queue<TreeNode> temp = new LinkedList<TreeNode>();
		
		if (root == null) {
			return res;
		}
		TreeNode curr = null;
		//将根节点入队
		temp.offer(root);
		//如果队列不为空，则开始将左右结点压入队列中
		while (!temp.isEmpty()) {
			curr = temp.poll();
			res.add(curr.val);
			if (curr.left != null) {
				temp.offer(curr.left);
			}
			if (curr.right != null) {
				temp.offer(curr.right);
			}
		}
		return res;
	}
}
