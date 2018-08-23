package com.hone.SwordOffer061;

/**
 * 题目：请实现两个函数，分别用来序列化和反序列化二叉树
 * @author Xia
 * 题目解读：所谓序列化指的是遍历二叉树为字符串;所谓反序列化指的是依据字符串重新构造成二叉树。
 */
public class SerializeTree {
	int index = -1;
	//序列化二叉树
	/**
	 * 按照先序遍历的思想来序列化二叉树，
	 * @param root
	 * @return
	 */
	public String Serialize(TreeNode root) {
		StringBuilder builder = new StringBuilder();
		if (root == null) {
			builder.append("#,");
			return builder.toString();
		}
		builder.append(root.val+",");
		builder.append(Serialize(root.left));
		builder.append(Serialize(root.right));
		return builder.toString();
	}
	
	/**
	 * 反序列化二叉树(根据字符串还原二叉树)
	 * @param str
	 * @return
	 */
	public TreeNode Deserialize(String str) {
		index++;
		//将字符串分割为应有的一个个结点
		String[] strs = str.split(",");
		TreeNode node = null;
		//如果不是空节点
		if (!strs[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(strs[index]));
			//然后再递归其他的字符串
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}
		return node;
	}
}
