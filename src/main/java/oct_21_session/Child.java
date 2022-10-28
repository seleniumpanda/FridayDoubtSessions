package oct_21_session;

public class Child extends Parent{

	public static void main(String[] args) {
		
		
		Child child = new Child();
		child.bungalow();
		child.land();
		child.money();
		child.shares();

		 GrandParent gp = new GrandParent();
		 gp.bungalow();
		 gp.land();
		 
	}
	
	
	public void superbike() {
		System.out.println("Child's superbike");
	}
	
	public void supercar() {
		System.out.println("Child's supercar");
	}

}
