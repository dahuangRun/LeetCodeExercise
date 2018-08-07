package com.hone.SwordOffer004;

/**
 * 问题：根据前序和中序遍历重新构建二叉树并且返回
 * @author Xia
 *
 */
public class RestructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode t  = reConstructBinary(pre, 0, pre.length-1, in, 0, in.length-1);
		return t;
	}
	/**
	 * 依次遍历前序遍历和中序遍历
	 * @param pre
	 * @param startPre
	 * @param endPre
	 * @param in
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	private TreeNode reConstructBinary(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn ){
		
		//如果为空或者不符合要求则直接返回空值
		if (startPre > endPre||startIn > endIn) {
			return null;
		}
		
		//可以肯定的是，二叉树的根结点一定是前序遍历的第一个元素。
		TreeNode root = new TreeNode(pre[startPre]);
		
		//然后再循环中序遍历，在里面寻找等于根节点的点
		//这里面用到了递归的方法
		for (int i = startIn; i <= endIn; i++)
			if (in[i] == pre[startPre]) {
				root.left = reConstructBinary(pre, startPre+1, startPre+(i-startIn), in, startIn, i-1);
				root.right = reConstructBinary(pre, (i-startIn)+startPre+1, endPre, in, i+1, endIn);
				break;
			}
		return root;
	}
}
