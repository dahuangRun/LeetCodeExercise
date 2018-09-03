package com.hone.SwordOffer024;

import java.util.ArrayList;

/**
 * 题目：输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 		完整路径定义：从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 思路：类似于DFS
 * 
 * @author Xia
 *
 */
public class FindPathForSum {
	private ArrayList<ArrayList<Integer>> resAll = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> res = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		
		//如果root为空，则直接返回
		if (root == null) {
			return resAll;
		}
		res.add(root.val);
		target = target - root.val;
		
		//如果剩余的target为零，并且结点已经到了叶子节点，这个该路径为一个所求的路径
		if (target == 0 && root.left == null && root.right == null) {
			resAll.add(new ArrayList<>(res)); 		//这里面需要重新new一个arrayList，否则所有的都指向同一个
		}
		//类似于深度优先遍历，先递归左结点，再递归右结点，继续寻找其他的结点
		FindPath(root.left, target);
		FindPath(root.right, target);
		
		//为什么需要回退一步呢？递归到叶子节点如果还没有找到路径，就要回退到父节点继续寻找，依次类推
		res.remove(res.size() - 1);
		return resAll;

	}
}
