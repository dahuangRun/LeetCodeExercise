package com.hone.SwordOffer018;

/**
 * 题目：操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author Xia
 *
 */
public class BinaryTreeMirror {
	public void Mirror(TreeNode root) {
		//如果根节点为空，或者根节点不为空，根节点左孩子结点和根节点右孩子结点为空，则直接结束，不用交换。
		if (root == null) {
			return;
		}
		if (root.left == null&&root.right == null) {
			return;
		}
		// 不过不同时为空，首先对接点进行交换。
    	// 然后再递归。
		TreeNode res = root.left;
		root.left = root.right;
		root.right = res;
		
		if (root.left != null) {
			Mirror(root.left);
		}
		if (root.right != null) {
			Mirror(root.right);
		}
    }
}
