import java.util.Arrays;
import java.util.LinkedList;


public class Euler41
{
	static LinkedList<Integer> staticNum = new LinkedList<Integer>();
	static LinkedList<Integer> num = new LinkedList<Integer>();
	static String test = "";	
	static void swap(int from, int to)
	{
		num.add(to, num.get(from)); 
		num.remove(from+1); 
		test = num.toString();
	}
	static void clear()
	{
		num.clear();
		num.addAll(staticNum);
		test = num.toString();
	}
	
	public static void main(String[] args)
	{
		//char[] staticNumb = {'9','8','7','6','5','4','3','2','1'};
		//char[] numb = {'9','8','7','6','5','4','3','2','1'};
		
		for (int i = 1; i < 10; i++)
		{
			staticNum.addFirst(i);
			num.addFirst(i);
		}
		
		
		for (int i = 8; i > -1; i--)
		{
			swap(i, i-1);
			
			if (i != num.size()-1)
			{
				int n = 8;
				
				swap(n, n-1);//last two
				
				clear();
				
				if (i != n-1)
				{
					while (i != n-1)
					{
						swap(i, i-1);
					
						n--;
						swap(n, n-1);
					}
				
					while (i == n-1)
					{
						n++;
						swap(n, n-1);
					}
					
					clear();
					swap(i, i-1);
					swap(n,n-2);
					
					clear();
					swap(i, i-1);
					swap(n,n-2);
					swap(n, n-1);
					
					clear();
					swap(i+1, i-1);
					
					clear();
					swap(i+1, i-1);
					swap(n, n-1);
					
					clear();
					swap(i+1, i-1);
					swap(n-1,i);
					
					clear();
					swap(i+1, i-1);
					swap(n-1,i);
					swap(n, n-1);
					
					clear();
					swap(i+1, i-1);
					swap(n,i);
					
					clear();
					swap(i+1, i-1);
					swap(n,i);
					swap(n, n-1);
					
					clear();
				}
				
				swap(n,i-1);//last first
				
				clear();
				
				swap(n,i-1);//last first
				
				swap(n, n-1);//last two
			}
			/*
			numb = Arrays.copyOf(staticNumb, staticNumb.length);
			int save = Integer.valueOf(String.valueOf(numb[i-1]));
			numb[i-1] = numb[i];
			numb[i] = String.valueOf(save).charAt(0);
			
			LinkedList part = new LinkedList();
			
			LinkedList xx = (LinkedList)part.subList(0, 1);
			*/
			clear();
		}
		
		/*
		int intNumb = Integer.valueOf(String.valueOf(numb));
		for (int i = 3; i < intNumb/2; i++)
		{
			if (intNumb % i == 0)
			{
				
			}
		}
		 */
	}

}
