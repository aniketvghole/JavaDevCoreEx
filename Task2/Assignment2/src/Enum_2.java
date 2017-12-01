

	enum Mango
	{ 
		Carrie(10), Fairchild(9),Haden(12);
	
		private int price;
		Mango (int p)
		{
			price = p;
		}
		int getprice()
		{
			return price;
		}
	}
	
	public class Enum_2 
	{
	public static void main(String[] args) 
	{
		
		Mango p = Mango.Carrie;
		System.out.println(p.getprice());
		Mango p1 = Mango.Fairchild;
		System.out.println(p1.getprice());
		Mango p2 = Mango.Haden;
		System.out.println(p2.getprice());
		}
	}

