package oct_21_session;

public class Control_Statements {

	public static void main(String[] args) {
	// control statements - it is taking control
		//it is giving a condition
		//if you satisfy the condition - then a certain result
		//if you do not then another result
		
		//find the highest of 3 numbers 25, 31, 45
		
		int a = 25; int b = 31; int c = 45;
		
		
		
		if(a>b && a>c) {
			System.out.println("a is the greatest : " + a);
		}else if (b>a && b>c) {
			System.out.println("b is the greatest : " + b);
		}else {
			System.out.println(" c is the greatest : " + c);
		}

	}

}
