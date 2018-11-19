/**
 * 
 */
package 数组;

public class 数组中重复的数字
{
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers == null || numbers.length == 0) return false;
    	
        for(int i = 0; i < length; i++)
        {
        	while(numbers[i] != i)
        	{
	        	//如果不相同，交换
	        	if(numbers[numbers[i]] == numbers[i])
	        	{
	        		duplication[0] = numbers[i];
	        		return true;
	        	}
	    		int tmp = numbers[numbers[i]];
	    		numbers[numbers[i]] = numbers[i];
	    		numbers[i] = tmp;
        	}
        }
        return false;
    }
    
    public static void main(String[] args)
	{
		int[] numbers = {2,1,3,0,4};
		int[] duplication = new int[5];
		System.out.println(new 数组中重复的数字().duplicate(numbers, 5, duplication));
	}
}
