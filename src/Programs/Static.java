package Programs;

public class Static {
// how can we create object when we make constructor as private  ie 
	//can you call it from outside of the class
	// ans: using static block 
	//2. from outside the class using classname with method
	static int i=10;
	static {
		Static s = new Static();
		System.out.println("static block ..." +i);
		
		System.out.println("-------------------------------");
	}
	private Static(){
		
	}
	public static void test() {
		System.out.println("static method .."+i);
		Static s1 = new Static();
		System.out.println("-------------------------------");
	}
	public static void display() {
		System.out.println("display method ...");
		
	}
	public static void main(String[] args) {
		
        display();
        test();

	}

}
