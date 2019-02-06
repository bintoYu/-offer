import 数据结构.ListNode;

/**
 * 
 */

/**
 * @author Administrator
 *
 * @date 2018年12月31日  
 * @version 1.0  
 */
public class test
{
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		head.next = node2;
		node2.next= node3;
		node3 = node3.next;
		
		ListNode pNode = head;
		while(pNode != null)
		{
			System.out.println(pNode.val);
			pNode = pNode.next;
		}
	}
}
