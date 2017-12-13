class bitwise_operator { 
//public static void main(String args[]) 
//{ 
//int var1 = 42; 
//int var2 = ~var1; 
//System.out.print(var1 + " " + var2); 
//} 
//}
	
		public static void throwit () 
		{ 
		System.out.print("throwit "); 
		throw new RuntimeException(); 
		} ` static void main(String [] args) 
		{ 
		try 
		{ 
		System.out.print("hello "); 
		throwit(); 
		} 
		catch (Exception re ) 
		{ 
		System.out.print("caught "); 
		} 
		finally 
		{ 
		System.out.print("finally "); 
		} 
		System.out.println("after "); 
		} 
		}