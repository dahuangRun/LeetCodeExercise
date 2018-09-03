package com.hone.SwordOffer055;

/**
 * 题目：给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author Xia
 *
 */
public class EntryNodeOfLoopList {
	public ListNode EntryNodeOfLoop(ListNode pHead){
        if (pHead == null || pHead.next == null) {
			return null;
		}
        //定义两个结点p1,p2 p1每次走一步,p2每次走两步。
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while (p1 != null && p2 != null && p2.next != null) {
			p1 = p1.next;			//p1每次走一步
			p2 = p2.next.next;		//p2每次走二步
			//如果p1和p2相遇，则将p2结点设置为首节点
			if (p1 == p2) {
				p2 = pHead;
				//开始寻找环的首节点,环的首节点的时候 p1 == p2
				while (p1 != p2) {
					p1 = p1.next;
					p2 = p2.next;
				}
				if (p1 == p2) {
					return p1;
				}
			}
		}
		return null;
    }

}
