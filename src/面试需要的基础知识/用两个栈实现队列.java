package 面试需要的基础知识;

import java.util.Stack;

/**
	入队列：直接压入s1即可
	出队列：如果s2不为空，把s2中的栈顶元素直接弹出；否则，把s1的所有元素全部弹出压入s2中，再弹出s2的栈顶元素
 * @author binto
 *
 */
public class 用两个栈实现队列
{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
      
    public void push(int node) {

    }
    
    public int pop() {
    }
    
}
