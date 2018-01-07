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
	public int numberOf1Between1AndN(int n, int x){
		if(n < 0 || x < 1 || x > 9){
			return 0;
		}
		int curr, low, temp, high = n, i = 1, total = 0;
		while(high!=0){
			high = n / (int)Math.pow(10, i); //获取第i位的高位
			temp = n % (int)Math.pow(10, i); //
			curr = temp / (int)Math.pow(10, i-1); //获取第i位
			low = temp%(int)Math.pow(10, i-1); //获取第i位的低位
			if(curr == x){ //等于x
				total += high*(int)Math.pow(10, i-1)+ low + 1;
			}else if(curr < x){ //小于x
				total += high*(int) Math.pow(10, i-1);
			}else{ //大于x
				total += (high + 1) * (int)Math.pow(10, i-1);
			}
			i++;
		}
		return total;
	}
	
	public static void main(String[] args) {
		test m1 = new test();
		int nums = m1.numberOf1Between1AndN(12345, 2);
		System.out.println(nums);

	}
}
