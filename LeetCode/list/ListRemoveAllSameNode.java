package list;

/**
 * 题目：删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * 思路： 这里讲相同的元素的的前一个结点pre和相同元素后一个节点next记录下来，利用一个flag判断是否有相同的点。
 * 		
 *  * @author Xia
 *
 */
public class ListRemoveAllSameNode {
	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode temp = new ListNode(0);
		temp.next = head;
		
		ListNode pre = temp;
		ListNode cur = pre.next;
		ListNode next = null;
		
		boolean delete;
		
		while (cur != null) {
			next = cur.next;
			delete = false;
			while (next != null && cur.val == next.val) {
				cur = next;
				next = next.next;
				delete = true;
			}
			
			//如果有相同的，则一次性删除中间所有相同的元素
			if (delete) {
				pre.next = next;
			}else {				//如果没有相同的元素，则将pre后移
				pre = cur;
			}
			//无论如何都将cur后移
			cur = next;
		}
		return temp.next;
	}
}
