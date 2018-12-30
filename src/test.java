/**
 * 
 */

/**
 * @author Administrator
 *
 * @date 2018年12月18日  
 * @version 1.0  
 */
public class test
{
	public double powerWithUnsignedExponent(double base, int exponent)
	{
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		double result = powerWithUnsignedExponent(base, exponent/2);
		result *= result;
		if(exponent%2 == 1)
			result *= base;
		return result;
	}
	
	public static void main(String[] args)
	{
		new test().powerWithUnsignedExponent(2, 5);
	}
}
