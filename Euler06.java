import java.math.BigInteger;


public class Euler06
{

	public static void main(String[] args)
	{
		int total1 = 0;
		for (int i = 1; i < 101; i++)
		{
			total1 += Math.pow((double)i, (double)2);
		}
		System.out.println(total1);
		
		int total2 = 0;
		for (int i = 1; i < 101; i++)
		{
			total2 += i;
		}
		System.out.println(new BigInteger(Integer.toString(total2)).pow(2).subtract(new BigInteger(Integer.toString(total1))));
		
	}

}
