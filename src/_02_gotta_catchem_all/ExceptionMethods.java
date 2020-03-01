package _02_gotta_catchem_all;

public class ExceptionMethods {
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0
	//3. Complete the JUnit test method to test the divide method.
	public static double divide(double x, double y) {
		return  (x/y);
	}
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	public static void reverseString(String x) {
		String temp ="";
		for(int i=x.length()-1; i>=0; i--) {
			temp = temp+x.charAt(i);
		}
		
	}
	
}
