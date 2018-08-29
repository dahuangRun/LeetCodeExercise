package com.hone.SwordOffer062;

/**
 * 题目：给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 思路：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。
 * 		按照中序遍历顺序找到第k个结点就是结果。
 * @author Xia
 */
public class FindKthNode {
	int index = 0;			//充当计数器使用
	public TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode node = KthNode(pRoot.left, k);
			if (node != null) {
				return node;
			}
			index++;
			if (index == k)
				return pRoot;
			node = KthNode(pRoot.right, k);
			if (node != null)
				return node;
		}
		return null;
	}
}
