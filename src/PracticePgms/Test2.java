package PracticePgms;

class Test2 extends Test1{
	void run() {
		System.out.println("This is child method");
	}
	public static void main(String[] args) {
		Test2 a = new Test2();
		a.run();
	}

}
