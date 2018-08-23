package com.hone.SwordOffer057;

/**
 * 题目：获得二叉树的下一个结点。在中序遍历汇总，寻找某个结点的下一个结点。
 * 思路：分三种情况
 * 		——> 有右子树：则寻找右子树里面的最左孩子结点
 * 		——> 无右子树：分为两种情况
 * 				——>当前结点是其父结点的左孩子，则父结点就是下一个结点。
 * 				——>当前结点是其父结点的右孩子，则一直往上回溯，知道该结点位于某个结点的左子树上，那么某结点就为下一个结点。
 * 思路：https://www.nowcoder.com/questionTerminal/9023a0c988684a53960365b889ceaf5e
 * @author Xia
 *
 */
public class GetNextNode {
	public TreeLinkNode GetNext(TreeLinkNode pNode){
		//如果pNode为空，则直接返回null
		if (pNode == null) {
			return null;
		}
		//第一大类情况：如果右子树不为null
		if (pNode.right != null) {
			pNode = pNode.right;
			//寻找pNode结点右子树最左边的孩子结点
			while (pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		}
		//第二大类：如果右子树为空。又分为两种情况，如果该结点是父节点的左孩子
					//则其父节点就是下一个结点。
		if (pNode.right == null) {
			while (pNode.next != null) {
			if (pNode.next.left == pNode) {
				return pNode.next;
			}else {
				pNode = pNode.next;
			}
		}
		}
		//退到了根节点仍没找到，则返回null
		return null;
    }
}
