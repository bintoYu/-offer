/**
 * 
 */
package 优化时间和空间效率;

import java.util.Arrays;
import java.util.Comparator;

public class 把数组排成最小的数
{
	public int getMinNum(int[] nums)
	{
		if(nums == null || nums.length == 0) return 0;
		String[] numstr = new String[nums.length];
		for(int i = 0; i < nums.length; i++)
			numstr[i] = nums[i] + "";
		
		Arrays.sort(numstr, new Comparator<String>()
		{

			@Override
			public int compare(String A, String B)
			{
				String AB = A+B;
				String BA = B+A;
				//前比后：从小到大，最小堆。后比前：从大到小，最大堆
				return AB.compareTo(BA);
			}
			
		});
		
		String result = new String();
		for (String string : numstr)
		{
			result += string;
		}
		
		return Integer.parseInt(result);
	}
	
	public static void main(String[] args)
	{
		int[] nums = {3,32,321};
		int minNum = new 把数组排成最小的数().getMinNum(nums);
		System.out.println(minNum);
	}
}
