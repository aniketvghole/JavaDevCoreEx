
public class Generic<T> 
	{
		private T t;
		
		public void setValue(T t)
		{
			this.t=t;
		}
		public T getValue()
		{
			return t;
		
		}
	

	public static void main(String[] args) {
	Generic <Integer> obj =  new Generic<Integer>();
	obj.setValue(10);
	System.out.println(obj.getValue());
	Generic<String> obj1 = new Generic<String>();
	obj1.setValue("Ten");
    System.out.println(obj1.getValue());
	}

}
