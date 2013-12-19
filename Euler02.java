/*
@author zetologos@gmail.com
*/

public class Euler02
{
	/*
	 * Find sum of even valued terms in the Fibonacci sequence not exceeding 4 million
	 */
	public static void main(String[] args)
	{
		int total = 0;//total of even Fibonacci numbers under 4 million
		int x = 0;//previous number
		int y = 1;//current number
		int z = 0;//next number
		
		while (true)
		{
			z = x + y; //Fibonacci addition happens here
			x = y; //current becomes previous
			y = z; //new current number
			if (z > 4000000) break;//if exceeding 4 million end loop
			if (z % 2 == 0) total += z; //if even add to total
			System.out.println(total);
		}
		System.out.println(total);
	}

}
