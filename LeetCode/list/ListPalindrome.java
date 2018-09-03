package list;

/**
 * 题目：请判断一个链表是否为回文链表。
 * 思路：主要是利用快慢结点来寻找链表的中点位置。找到之后再将链表中点之后的元素进行翻转。
 * 		再利用之前定义好的两个结点pre和slow,往后一次比较结点即可。
 * 
 * 之前自己还想着定义n，然后判断n奇偶性，然后判断。但是发现实际不好操作。
 * 
 * @author Xia
 *
 */
public class ListPalindrome {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		//寻找中间结点
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// /获得结点的下一个结点，并且开始将后半部分翻转 
		ListNode last = slow.next;
		ListNode pre = head;

		//将后部分链表进行翻转
		while (last.next != null) {
			ListNode next = last.next;
			last.next = next.next;
			next.next = slow.next;
			slow.next = next;
		}

		//开始从slow及pre比较是否相等
		while (slow.next != null) {
			slow = slow.next;
			if (pre.val != slow.val) {
				return false;
			}
			pre = pre.next;
		}
		return true;
	}
}
