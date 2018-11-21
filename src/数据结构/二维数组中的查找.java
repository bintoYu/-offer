package 数据结构;

public class 二维数组中的查找
{
	/**
	 * 从右上角开始，只能往左或往下移动。
	 * 
	 * @param target
	 * @param array
	 * @return
	 */
	public boolean Find(int target, int[][] array)
	{
		if(array == null || array.length==0 || array[0].length==0) return false;
		
		int i = 0,j = array[0].length - 1;
		while(i < array.length && j >= 0)
		{
			if(target > array[i][j])
				i++;
			else if (target < array[i][j])
				j--;
			else
				return true;
		}
		
		return false;
	}
	
}
