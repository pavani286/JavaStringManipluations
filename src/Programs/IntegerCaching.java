package Programs;

public class IntegerCaching {

	public static void main(String[] args) {
		
		//The Integer Cache works only on autoboxing 
		//which means Conversion from a primitive type to an object reference is called autoboxing.
        //This is applicable for Integer values in the range between –128 to +127.
		//It will help you when you will check any object reference values. 
		//And if the value will be in range declaration then the object reference for both values will be the same 
		//and if it is not in range declaration then the object reference will be different.
		//So, if you will compare values even if it is same and it might be chance and
		//you have taken out of range values then, in that case, both values even if it will same but will return false
		//means it’s not equal because for both values object reference will be different.
		
		Integer num1 = 128;
		Integer num2 = 129;   //object references varaiables
		
		//range -128 to +127
		if(num1 == num2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
	}

}
