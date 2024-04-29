package Programs;

public class Testcase {
	// how can we create object when we make constructor as private  ie 
		//can you call it from outside of the class
		// ans: using static block 
	//2. call the object from outside of the class when constructor is private
/*
	public static void main(String[] args) {
		
       Static.display();
       Static.test();

	}
*/
	// it is posssilbe to run java program without main() method
	//ans: yes using static block and we need to 
	//call that object from outside or another  of the class
	static {
		System.out.println("static block1..");
	
	}
	
	static {
		System.out.println("static block2..");
	
	}
}
