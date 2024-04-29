package Programs;

class ComplierOptimization {
	// will static block will be excuted with final variable declared in another class? 
	// ans: static block will not be excuted
	
	public static void main(String[] args) {
		  System.out.println(Main.x);
	  }
}

class Main{
public static final int x= 100;
	
	static {
		System.out.println("static block ...");
	}
}


// compiler will not excute the class below becuase when main method is
// loaded it takes the x value from the common memory location,so without 
// excuting the class complier will get the value of x 
// this process is know as compiler optmization 