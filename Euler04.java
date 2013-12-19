import java.util.ArrayList;

/*
@author zetologos@gmail.com
*/

public class Euler04
{
	/*
	 * Find the largest palindrome made from the product two 3 digit numbers
	 */
	public static void main(String[] args)
	{
		int f1 = 999;		//factor1
		int f2 = 999;		//factor2
		int p = 0; 			//Product of x and y 
		int bgstPalin = 0; 	//Biggest palindrome to date
		long count = 0; 	//keeps track of loop count
		
		/*
		 * Simplest Algorithm tries every combination of 3 digit multiples and check if its a palindrome
		 */
		long start = System.currentTimeMillis();
		for (int i = f1; i > 99; i--)
		{
			for (int n = f2; n > 99; n--)
			{
				count++;
				p = i * n;
				if (isPalin(Integer.toString(p))) 
					if (p > bgstPalin) bgstPalin = p;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Answer: " + bgstPalin);
		System.out.println("Time: " + (end-start));
		System.out.println("Loop Count: " + count);
		///////////////////////////////////////////
		/*
		 * Removes repeated multipication combinations which occur in simplest algorithm
		 * EX: 999x998 = 997002
		 * 	   998x999 = 997002
		 */
		ArrayList nums = new ArrayList();//contains all numbers from 100 to 999
		for (int i = 100; i < 1000; i++)
		{
			nums.add(i);
		}
		
		ArrayList allNums = new ArrayList();//for each 3 digit number contains a list of all possible multiples
		for (int i = 0; i < 900; i++)
		{
			ArrayList copy = new ArrayList();
			copy.addAll(nums);
			allNums.add(i, copy);
		}
		
		count = 0;
		start = System.currentTimeMillis();
		for (int i = 1; i < 900; i++)
		{
			int m1 = i+99;//multiple 1
			for (Object num : (ArrayList)allNums.get(i-1))
			{
				count++;
				int m2 = (Integer) num;//multiple 2
				p = m1 * m2;
				if (m1 != m2) ((ArrayList)allNums.get(m2-100)).remove((Object)m1);//removes multiple from allNums
				
				if (isPalin(Integer.toString(p))) 
					if (p > bgstPalin) bgstPalin = p;
			}
		}
		end = System.currentTimeMillis();
		System.out.println("Answer: " + bgstPalin);
		System.out.println("Time: " + (end-start));
		System.out.println("Loop Count: " + count);
		
		//940049 2,3
		//94004 2
		//9400 1,2
		//940 1
		//94 0,1
		
		///////////////////////////////////////////////////////
		/*
		 * Current best algorithm, produces all possible palindromes from highest to lowest and checks if it is a product of two 3 digit multiples.
		 */
		
		//idea- if last digit 
		// odd = even #s
		// !0,5 = !#s ending with 5
		// !0   = !#s ending with 0
		// no palindromes ending with zero
		//0 - 0
		//1 - 
		//2 - 0,2,4,6,8
		//3 - 
		//4 - #2
		//5 - 0, 5
		//6 - #2
		//7 - 
		//8 - #2
		//9 -
		
		count = 0;
		start = System.currentTimeMillis();
		String checkPalin = "997799"; //highest possible palindrome under the product of 999x999
		a: while (true)
		{
			for (int i = 100; i < 1000; i++)
			{
				count++;
				if (Integer.valueOf(checkPalin) % i == 0)
				{
					if (Integer.toString(Integer.valueOf(checkPalin) / i).length() == 3) 
					{
						bgstPalin = Integer.valueOf(checkPalin);
						break a;
					}
				}
			}
			checkPalin = palinDromeProducer(checkPalin.toCharArray());
		}
		/*
		a: for (Object palinObj : allPalin)
		{
			String checkPalin = (String) palinObj;
			
		}
		*/
		end = System.currentTimeMillis();
		System.out.println("Answer: " + bgstPalin);
		System.out.println("Time: " + (end-start));
		System.out.println("Loop Count: " + count);
	}
	
	static boolean isPalin(String x)
	{
		if (x.length() <= 1) return true; //if 0 or 1 char left, its a palindrome
		if (x.charAt(0) == x.charAt(x.length()-1)) return isPalin(x.substring(1, x.length()-1)); //if first and last char same cut them off
		else return false; //first and last char not same, its not a palindrome
	}
	
	static String palinDromeProducer(char[] p)
	{
		int c1 = p.length/2; //center of x 
		int c2 = p.length/2; //center of x
		if (p.length % 2 == 0) c1 -= 1; //if even number gives you both centers EX: 1234 to 2 and 3
		
		if (p[c1] == '0') //if center zero
		{
			for (int tb = c1; tb >= 0; tb--) //traverses back to find where zeroes stop
			{
				if (p[tb] != '0') //if non-zero
				{
					p[tb] -= 1; //decrement first non-zero number by one
					p[p.length-1-tb] -= 1;
				
					for (int tf = tb+1; tf <= c1; tf++) //traverses forward to center
					{
						p[tf] = '9'; //turns all zeroes into 9
						p[p.length-1-tf] = '9';
					}
				
					if (p[0] == '0') //in the case of trailing zeroes
					{
						p[p.length-1] = '9';
						return String.valueOf(p).substring(1, p.length); //cuts trailing zero EX: 09999 to 9999 
					}
					return String.valueOf(p);
				}
			}
		}
		p[c1] -= 1; //decrements center of odd numbers
		if (c1+1 == c2) p[c2] -= 1; //decrements center of even numbers
		return String.valueOf(p);
	}
}