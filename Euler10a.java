import java.util.ArrayList;


public class Euler10a
{

	public static void main(String[] args)
	{
		ArrayList t = new ArrayList();
		t.add(3);
		ArrayList b = new ArrayList();
		
		int total = 2+3;
		for (int i = 3; i < 1000; i+=2)
		{
			b = new ArrayList(); b.addAll(t);
			for (int tt = 0; tt < t.size()/2; tt++)
			{	
				int n = (Integer) t.get(tt);
				if (i % n == 0) break;
				else 
				{
					if (tt == t.size()/2-1) {total+=i;System.out.println(i);break;}
					else 
					{
						for (int m = tt+1; m < t.size()/2; m++) 
						{
							int t0 = (Integer)t.get(m);
							if (t0 % n == 0) {t.remove(m); m--;}
						}
					}
				}
			}
			t = new ArrayList(); t.addAll(b);
			t.add(((Integer)t.get(t.size()-1))+2);
		}
		System.out.println(total);
	}

}
