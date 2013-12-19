
public class Euler05
{

	public static void main(String[] args)
	{
		//20: 10: 5 11639628
		//19		12252240
		//18: 9: 6	232792560
		//17
		//16: 8: 4
		//15: 5
		//14: 7
		//13
		//12: 6: 3
		//11  
		
		int count = 0;
		a: for (int i = 20; i > 0; i+=20)
		{
			for (int n = 3; n < 20; n++)
			{
				count++;
				if (i % n != 0) break;
				else if (n == 19) {System.out.println(i); break a;}
			}
		}
		System.out.println(count);
	}

}
