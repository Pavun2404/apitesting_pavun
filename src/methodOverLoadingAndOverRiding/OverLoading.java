package methodOverLoadingAndOverRiding;

public class OverLoading {
	
	// ###### Method overloading is same class name and method name parameter(Signature)only different###### 
	
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b-c;
	}
	public static void main(String []args) {
		
		OverLoading obj = new OverLoading();
		
		System.out.println("First method output is:"+obj.add(5, 5));
		System.out.println("Second method output is:"+obj.add(5, 10, 4));
	}
	

}
