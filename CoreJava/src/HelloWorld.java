public class HelloWorld {	
	//method definition
	//method is a logical group of statements 
	static void sum(){	
		int num1 = 2;
		int num2 = 3;		
		int result = num1 + num2;			
		System.out.println(result);		
	}
	
	static void method1() {
		System.out.println("method1");
	}
	
	static void method2() {
		System.out.println("method2");
		
	}
	

	public static void main(String[] args) {		
		//method calling
		sum();			
		method1();
		method2();
		method1();
		
		//here the caller method is main()
		
	}
}


