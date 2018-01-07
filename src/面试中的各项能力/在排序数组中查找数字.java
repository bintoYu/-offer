/**
 * 
 */
package 面试中的各项能力;

public class 在排序数组中查找数字
{
	public int getFirstK(int[] nums,int k,int start,int end)
	{
		if(start > end)
			return -1;
		int middle = (start+end)/2;
		if(nums[middle] == k)
		{
			if(middle == 0)
				return middle;
			//看看前一个是不是k，不是的话返回，是的话end=middle-1
			if(nums[middle-1] != k)
				return middle;
			else
				end = middle-1;
		}
		else if(nums[middle] > k)
			end = middle-1;
		else
			start = middle+1;
		
		return getFirstK(nums, k, start, end);
	}
	
	public int getLastK(int[] nums,int k,int start,int end)
	{
		if(start > end)
			return -1;
		int middle = (start+end)/2;
		if(nums[middle] == k)
		{
			if(middle == nums.length-1)
				return middle;
			if(nums[middle+1] != k)
				return middle;
			else
				start = middle+1;
		}
		else if(nums[middle] > k)
			end = middle-1;
		else
			start = middle+1;
		
		return getLastK(nums, k, start, end);
	}
	
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0)
        	return 0;
        int first = getFirstK(array, k, 0, array.length-1);
        int end = getLastK(array, k, 0, array.length-1);
        if(first == -1 || end == -1)
        	return 0;
        return end-first+1;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,3,3,3,3,4,5};
		int getNumberOfK = new 在排序数组中查找数字().GetNumberOfK(nums, 2);
	}
}
