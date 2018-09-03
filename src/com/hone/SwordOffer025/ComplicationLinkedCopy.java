package com.hone.SwordOffer025;

/**
 * 复杂链表的复制
 * @author Xia
 *
 */
public class ComplicationLinkedCopy {
	public RandomListNode Clone(RandomListNode pHead) {
		
		if (pHead == null) {
			return null;
		}
		
		RandomListNode  currentNode = pHead;
		//1：第一步复制每一个结点，将复制的结点放在原结点的后面，比如A 复制为A1,放在A的后面,但是暂时不处理随机结点
		 //链表插入，先让复制的结点也指向下一个结点，再删除原节点和下一个结点之间的关联。
		while (currentNode != null) {
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			cloneNode.next = currentNode.next;
			currentNode.next = cloneNode;
			currentNode = cloneNode.next;
		}
		
		//2. 遍历链表，将老结点的随机结点赋给新的随机结点 也就是初始化随机结点
		currentNode = pHead;
		while (currentNode != null) {
			currentNode.next.random = currentNode.random == null? null:currentNode.random.next;
			currentNode = currentNode.next.next;
		}
		
		
		//拆分链表，得到新的链表
		currentNode = pHead;
		RandomListNode pCloneHead = pHead.next;
		while (currentNode != null) {
			RandomListNode cloneNode = currentNode.next;
			currentNode.next = cloneNode.next;
			cloneNode.next = cloneNode.next == null ? null:cloneNode.next.next;
			currentNode = currentNode.next;
		}
		
		return pCloneHead;
	}
}
