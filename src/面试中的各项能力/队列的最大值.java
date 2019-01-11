/**
 * 
 */
package 面试中的各项能力;

import java.util.LinkedList;

public class 队列的最大值
{
	private LinkedList<Integer> queue = new LinkedList<>();
	
	public void offer(int num)
	{
		while(!queue.isEmpty() && queue.getLast() < num)
			queue.pollLast();
		queue.offer(num);
	}
}
