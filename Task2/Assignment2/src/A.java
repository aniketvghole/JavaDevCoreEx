//Covarient 

class E {}	
class B extends E {}
 
class C
{
    E disp()
    {
        System.out.println("display() from class C");
        return new E();
    }
}
 
class D extends C
{
    B disp()
    {
        System.out.println("display() from class D");
        return new B();
       
    }
}
public class A {

	public static void main(String[] args) {
		C c = new C();
	       c.disp();
	      
	 
	       D d = new D();
	       d.disp();
	}

}
