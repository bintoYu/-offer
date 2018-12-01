/**
 * 
 */
package 数据结构;

public class 二叉树的下一个结点
{
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
       if(pNode == null) return null;
       
       if(pNode.right != null)
       {
    	   TreeLinkNode cur = pNode.right;
    	   while(cur.left != null)
    	   {
    		   cur = cur.left;
    	   }
    	   return cur;
       }
       else if(pNode == pNode.parent.left)
       {
    	   return pNode.parent;
       }
       else
       {
    	   TreeLinkNode cur = pNode.parent;
    	   while(cur.parent != null && cur.parent.left != cur)
    	   {
    		   cur = cur.parent;
    	   }
    	   return cur;
       }
    }
}
