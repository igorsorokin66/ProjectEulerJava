import java.math.BigInteger;
import java.util.ArrayList;

public class Euler10
{
	//you can make up any odd number from primes
	//your highest possible multiple gets lower as the lowest possible multiple gets higher
	public static void main(String[] args)
	{
		ArrayList t = new ArrayList();
		t.add(3);
		
		BigInteger total = new BigInteger("5");
		for (int isPrime = 3; isPrime < 2000000; isPrime+=2)
		{
			int m = 3;
			for (int prime = 0; prime < t.size(); prime++)
			{
				int n = (Integer) t.get(prime);
				if (isPrime % n == 0) break;
				else 
				{
					if (n > isPrime/m-1)
					{
						total = total.add(new BigInteger(Integer.toString(isPrime)));
						t.add(isPrime);
						System.out.println(isPrime);
						break;
					}
					m = n;
				}
			}
		}
		System.out.println(total);
	}
}
