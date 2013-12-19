import java.util.ArrayList;
import java.util.LinkedList;

public class Euler28
{

	public static void main(String[] args)
	{
		ArrayList spiral = new ArrayList();
		for (int i = 0; i < 1001; i++)
		{
			LinkedList x = new LinkedList();
			spiral.add(x);
		}
		
		int x = 1002001;
		
		int f = spiral.size();
		int l = 0;
		
		int m = 1;
		int n = spiral.size();
		
		int j = spiral.size();
		int h = spiral.size()-1;
		int u = 0;
		
		int y = spiral.size()-2;
		int z = 1;
		int w = 0;
for (int o = 0; o < 999; o++)
{
		for (int i = 0; i < f; i++)//first line
		{
			((LinkedList)spiral.get(l)).add(l, x); x--;
			//for (int p = 0; p < spiral.size(); p++){System.out.println(((LinkedList)spiral.get(p)).toString());}
		}
		
		for (int i = m; i < n; i++)//left side
		{
			((LinkedList)spiral.get(i)).add(l, x); x--;
			//for (int p = 0; p < spiral.size(); p++){System.out.println(((LinkedList)spiral.get(p)).toString());}
		}
		
		for (int i = 1; i < j; i++)//last line
		{
			((LinkedList)spiral.get(h)).add(i+u,x);x--;
			//for (int p = 0; p < spiral.size(); p++){System.out.println(((LinkedList)spiral.get(p)).toString());}
		}
		
		for (int i = y; i > w; i--)//right side
		{
			((LinkedList)spiral.get(i)).add(z, x);x--;
			//for (int p = 0; p < spiral.size(); p++){System.out.println(((LinkedList)spiral.get(p)).toString());}
		}
		f-=2;
		l++;
		m++;
		n--;
		j-=2;
		h--;
		u++;
		y--;
		z++;
		w++;
	}
	int total = 0; int v = spiral.size()-1;
	for (int p = 0; p < spiral.size(); p++)
	{
		total+=(Integer)((LinkedList)spiral.get(p)).get(p) + (Integer)((LinkedList)spiral.get(p)).get(v);
		System.out.println((Integer)((LinkedList)spiral.get(p)).get(p) +" "+ (Integer)((LinkedList)spiral.get(p)).get(v));v--;
	}
	System.out.println(total);		
	}

}
