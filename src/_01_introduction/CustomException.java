package _01_introduction;

public class CustomException extends Exception {
  //  Add a void method called terminate that simply calls System.exit(0);
	
		// 5. Call testMethod2 with a negative number in a try/catch block.
		//    In the catch block, call the terminate method using the 
		//    CustomException object.
		//    This demonstrates how custom exception classes can be used to
		//    handle exceptions in unlimited ways.
	public static void main(String[] args) {
		ExceptionsDemo ed= new ExceptionsDemo();
		try {
			ed.testMethod2(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void terminate() {
		System.exit(0);
	}
}
