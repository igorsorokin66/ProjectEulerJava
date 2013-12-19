import java.util.Arrays;
import java.util.LinkedList;


public class Euler41a
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
		
		boolean x = false;
		for (int i = 4; i > -1; i--)
		{
			for (int z = i; z < 9; z++)
			{
			for (int a = i; a < 9; a++)
			{
				for (int b = 8; b > i+1 || i >= 7; b--)
				{
					//if (x)//a != i && b == 8)
					//{swap(i, i-1); swap(8, 6); x = false;} //System.out.print(8 + "" + 6 + ",");}
					swap(z, i-1); //System.out.print(a + "" + (i-1) + ",");
					if (a != i) swap(a,i);
					if (b == 8) System.out.println(test);
					
					if (i != num.size()-1)
					{
						swap(b, b-1);//System.out.print(b + "" + (b-1) + ",");
						System.out.println(test);
						//if (a != i && b == 8) break;
						//if (a == 1) break;
						for (int c = b+1; c-1 < 8 || i == 7; c++)
						{
							if (i != 7) {swap(c, c-1);//System.out.print(c + "" + (c-1) + ",");
							System.out.println(test);}
							clear();
							if (i != 7) {swap(z, i-1);}
							if (a != i) swap(a,i);
							swap(8, 6);
							System.out.println(test);
							swap(8, 7);
							System.out.println(test);
							if (i == 7) break; 
						}
					}
					clear();//System.out.println();
					if (i >= 7) break;
				}
				if (i >= 7) break;
			}
			if (i >= 7) break;
			}
			
		}
	}

}
