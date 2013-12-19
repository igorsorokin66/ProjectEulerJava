import java.util.HashMap;


public class Euler68
{

	public static void main(String[] args)
	{
		int[] array = new int[15];
		int[] bank = {10, 9 , 8, 7, 6, 5, 4, 3, 2, 1};
		HashMap used = new HashMap();
		
		array[0] = bank[4];
		used.put(bank[4], 0);
		
		int n = 3;
		for (int i = 12; i > 2; i-=3)//loops starting adfhj
		{
			array[i] = bank[n];
			used.put(bank[n], 0);
			n--;
		}
		
		for (int i = 0; i < bank.length; i++)
		{
			if ((Integer)used.get(bank[i]) == 1)
			{
				array[1] = bank[i];
				array[14] = bank[i];
				break;
			}
		}
		
		for (int i = 0; i < 2; i++)
		{
			//array[i]
		}
		//B 1 14
		//C 2 4
		//E 5 7
		//G 8 10
		//I 11 13
	}

}
