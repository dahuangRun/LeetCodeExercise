package list;

/**
 * 题目：给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * 思路：利用递归的思路。每次都在一个递归中寻找链表的中点元素。
 * 
 * 技巧：利用快慢结点来寻找链表的中间结点。
 * @author Xia
 *
 */
public class ListSortedToBST {
	public TreeNode sortedListToBST(ListNode head) {

		return sortedChild(head, null);

	}

	TreeNode sortedChild(ListNode head, ListNode tail) {
		//如果
		if (head == tail) {
			return null;
		}

		if (head.next == tail) {
			// 如果只剩下一个元素
			TreeNode root = new TreeNode(head.val);
			return root;
		}
		
		ListNode mid = head;
		ListNode cur = head;

		// 之后用两个指针，一个指针每次走一步，一个指针每次走两步，最后走两步的那个到达了尾部，而mid则刚好到达终点的位置
		while (cur != tail && cur.next != tail) {
			mid = mid.next;
			cur = cur.next.next;
		}

		TreeNode root = new TreeNode(mid.val);
		root.left = sortedChild(head, mid);
		root.right = sortedChild(mid.next, tail);
		return root;

	}
}
