import java.util.ArrayList;
import java.util.LinkedList;

public class Euler28a
{

	public static void main(String[] args)
	{
		ArrayList spiral = new ArrayList();
		for (int i = 0; i < 5; i++)
		{
			LinkedList x = new LinkedList();
			spiral.add(x);
		}
		
		int x = 25;
		
		for (int i = 0; i < spiral.size(); i++)//first line
		{
			((LinkedList)spiral.get(0)).addFirst(x); x--;
		}
		
		for (int i = 1; i < spiral.size(); i++)//left side
		{
			((LinkedList)spiral.get(i)).add(x); x--;
		}
		
		for (int i = 0; i < spiral.size()-2; i++)//last line
		{
			((LinkedList)spiral.get(spiral.size()-1)).add(x);x--;
		}
		
		for (int i = spiral.size()-1; i > 0; i--)//right side
		{
			((LinkedList)spiral.get(i)).addLast(x);x--;
		}
		//SECOND LOOP
		/*
		for (int i = 0; i < spiral.size()-2; i++)//second line
		{
			((LinkedList)spiral.get(1)).add(1, x); x--;
		}
		
		for (int i = 2; i < spiral.size()-1; i++)//left side
		{
			((LinkedList)spiral.get(i)).add(1, x); x--;
		}
		
		for (int i = 0; i < spiral.size()-3; i++)//last line
		{
			((LinkedList)spiral.get(spiral.size()-2)).add(i+2,x);x--;
		}
		
		for (int i = 0; i < spiral.size()-3; i++)//third line
		{
			((LinkedList)spiral.get(2)).add(2, x); x--;
		}
		*/
		
		for (int i = 0; i < spiral.size(); i++)//print all
		{
			System.out.println(((LinkedList)spiral.get(i)).toString());
		}
	}

}
