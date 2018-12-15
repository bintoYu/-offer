/**
 * 
 */
package 解决面试题的思路;

import 数据结构.TreeNode;

public class 二叉树的镜像
{
	public void snapshotOfBinaryTree(TreeNode root)
	{
		if(root == null)
			return ;
		if(root.left == null && root.right == null) return ;
		TreeNode tmp = root.left;
		root.right = root.left;
		root.left = tmp;
		
		snapshotOfBinaryTree(root.left);
		snapshotOfBinaryTree(root.right);
	}
}
