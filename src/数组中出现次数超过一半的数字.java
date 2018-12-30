
public class 数组中出现次数超过一半的数字
{
	private int MoreThanHalfNum(int[] arr, int len)
	{
	    int result = arr[0];
	    int time = 1 ;
	    for (int i = 1 ;i < len ; i++)
	    {	
	        if (0 == time)
	        {
	            result = arr[i] ;
	            time++ ;
	        }
	        else if (arr[i] == result)
	        {
	            time++;
	        }
	        else 
	        {
	            time-- ;
	        }    
	    }
	    return result ;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,0,1,0,1,0,1};
		int res = new 数组中出现次数超过一半的数字().MoreThanHalfNum(arr,7);
		System.out.println(res);
	}
}
