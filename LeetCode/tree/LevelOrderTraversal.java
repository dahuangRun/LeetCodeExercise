package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的层序遍历，并且按照不同的层输出
 * 思路：还是和之前简单的层序遍历一样，都是通过queue来控制，但是这里面需要记录结点的层数。
 * 		对于层数的控制，主要通过"当前层的结点个数等于队列中剩余元素的个数"
 * @author Xia
 */

public class LevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		if (root == null) {
			return result;
		}
		//首先将根节点入队列
		queue.add(root);
		int i = 1;
		TreeNode cur = null;
		while (!queue.isEmpty()) {
			ArrayList<Integer> res = new ArrayList<>();
			int size = queue.size();		//当前节点数为队列中个数来定层位
			while (size > 0) {
				cur = queue.poll();
				res.add(cur.val);
				if (cur.left != null) {
					queue.add(cur.left);
				}
				if (cur.right != null) {
					queue.add(cur.right);
				}
				size--;
			}
			result.add(res);
			
		}
		return result;
	}
}
