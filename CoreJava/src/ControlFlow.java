
public class ControlFlow {
	
	static void method1() {
		System.out.println("method1");
		method2();
		System.out.println("after calling method2");
		return;		
		//System.out.println("after return");
	}
	
	static void method2() {
		System.out.println("method2");
		int returnValue =  method3();
		System.out.println("after calling method3");
		return;		
	}
	
	static int method3() {
		System.out.println("method3");
		return 1; 
		
	}

	public static void main(String[] args) {		
		method1();		

	}

}
