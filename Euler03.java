/*
@author zetologos@gmail.com
*/

import java.math.BigInteger;

public class Euler03
{
	/*
	 * What is the largest prime factor of the number 600851475143?
	 */
	public static void main(String[] args)
	{
		BigInteger init = new BigInteger("600851475143");
		BigInteger num = new BigInteger("2147483647");
		BigInteger y = new BigInteger("0");
		int fnum = 2147483647;
		boolean flag = false;
		
		for (int i = 3; i < fnum+1/2; i+=2)
		{
			if (init.mod(new BigInteger(Integer.toString(i))).equals(new BigInteger("0")) && !flag) 
			{
				y = init.divide(new BigInteger(Integer.toString(i))); 
				if (y.compareTo(num) == -1) 
				{fnum = y.intValue(); flag = true; i = 3;}
			}
			if (fnum % i == 0 && flag) 
			{
				fnum /= i; 
			}
		}
		System.out.println(fnum);
	}
}
