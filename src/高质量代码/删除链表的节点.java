package 高质量代码;

import 数据结构.ListNode;

public class 删除链表的节点
{
	public ListNode deleteNode(ListNode head,ListNode toBeDeletedNode)
	{
		if(head == null)
			return null;
		
		//头和中间
		if(toBeDeletedNode.next != null)
		{
			toBeDeletedNode.val = toBeDeletedNode.next.val;
			toBeDeletedNode.next = toBeDeletedNode.next.next;
			return head;
		}
		//尾
		else if(toBeDeletedNode != head)
		{
			ListNode pNode = head;
			while(pNode.next != toBeDeletedNode)
				pNode = pNode.next;
			pNode.next = null;
			return head;
		}	
		//只有一个
		else
		{
			return null;
		}

	}
}
