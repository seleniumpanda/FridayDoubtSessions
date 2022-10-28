package package1;

import oct_21_session.Parent;

public class Class1 extends Parent{
	
	private static int i;

	public static void main(String[] args) {
		
		Class1 child = new Class1();
		child.shares();
		child.money();
		
		
		System.out.println("This is Class 1");
        i = 20;
        System.out.println(i);
        
        Class1 objref = new Class1();
        objref.i = 32;
        System.out.println(i);
	}
	
	public void hello() {
		System.out.println("this is the hello method");
		
	}
	
	protected void hello1() {
		System.out.println("This is the protected hello method");
	}
	
	void hello2() {
		//by default the member of a class is public within its own package, 
		// but cannot be accessed outside of its package
	}
	
	

}
