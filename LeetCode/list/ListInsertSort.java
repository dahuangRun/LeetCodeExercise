package list;

/**
 * 题目：对链表进行插入排序
 * 思路：模拟插入排序的顺序。
 * @author Xia
 *
 */
public class ListInsertSort {
	public ListNode insertionSortList(ListNode head) {
		//添加一个辅助的头结点
		ListNode temp = new ListNode(0);
		temp.next = head;
		
		if (head == null)
			return null;

		ListNode pre = head; //排序好的最后一个结点
		ListNode cur = head.next; // 正在排序的当前节点
		ListNode next = null; // 当前节点的下一个结点

		while (cur != null) {
			// 如果当前节点的val小于已经排序好的最后一个结点，则开始寻找合适的位置交换,如果比最后一个元素都大，则比较下一个
			if (cur.val < pre.val) {
				next = cur.next;

				//从已经排序好的结点的头开始寻找
				ListNode cur2 = temp.next;
				//记录cur2的前一个结点
				ListNode temp2 = temp; 

				while (cur.val > cur2.val && cur2 != pre) {
					temp2 = cur2;
					cur2 = cur2.next;
				}

				//如果找到了一个位置使得(cur.val<pre.val && cur.val > cur2.val),则开始插入
				temp2.next = cur;
				cur.next = cur2;
				pre.next = next;
				cur = next;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}

		return temp.next;
	}
}
