import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Euler31
{
	public static class Node
	{
        private String data;
        private Node parent;
        private ArrayList<Node> children = new ArrayList<Node>();
        
        Node(String data, Node parent)
        {
        	this.data = data;
        	this.parent = parent;
        }
    }
	
	static void find(Node curr, int i)
	{
		if (pennies[p].equals(""+i+"p")) 
		{
			curr.children.add(new Node(pennies[p], curr));
			System.out.println(pennies[p]);
			//p++;
		}
		if (Arrays.asList(pennies).contains(curr.data))
		{
			for (int k = p; k > 0; k--)
			{
				if ((Integer.parseInt(pennies[k].split("p")[0]) + 
					 Integer.parseInt(curr.data.split("p")[0])) == i) 
				{
					curr.children.add(new Node(curr.data + pennies[p], curr));
					System.out.println(curr.data + pennies[p]);
				}
			}
		}
		for (int m = i; m > 1; m--)
		{
			if (Integer.parseInt(curr.data.split("p")[0]) * m == i) 
			{
				curr.children.add(new Node(m + "*" + curr.data, curr));
				System.out.println(m + "*" + curr.data);
			}
		}
	}
	
	static int p = 1;
	static String[] pennies = {"1p","2p","5p","10p","20p","50p","100p","200p"};
	
	public static void main(String[] args)
	{
		int count = 0;
		
		Node root = new Node(pennies[0], null);
		
		for (int i = 2; i < 5; i++)
		{
			find(root,i);
		}
		
		//ArrayList<String> hist = new ArrayList<String>();
		//hist.add("1p");
		/*
		for (int i = 2; i < 5; i++)
		{
			if (pennies[p].equals(""+i+"p")) 
			{
				hist.add(pennies[p]);
				p++;
			}


				for (int h = 0; h < hist.size(); h++)
				{
					for (int m = i; m > 1; m--)
					{
						if (Integer.parseInt(hist.get(h).split("p")[0]) * m == i) 
						{
							//count++;
							//hist.remove(h);
							hist.add(m + "*" + hist.get(h)); h+=2;
						}
					}
				}
		}
		*/
	}

}
