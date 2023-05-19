
public class Person {
	//state or instance variables
	String name;
	private int age;//accessible only within the class
	char gender;
	
	//behavior or instance methods
	void speaking() {
		
	}
	
	public static void main(String args[]) {
		//syntax for creating an object
		Person person1 = new Person();
		Person person2 = new Person();		
		//set the values for instance variables for person1 
		person1.name = "abc";
		person1.age = -20;
		person1.gender = 'M';		
		//call the instance method for person1
		person1.speaking();				
		//set the values for instance variables for person2
		person2.name = "xyz";
		person2.age = 40;
		person2.gender = 'F';		
	}
}

class Employee extends Person{
	/*no need to again write name, age and gender in 
	 * employee class
	 */	
	/*int age;
	String name;*/
	
	int empId;
	String organization;
	
}

class Student extends Person{
	int rollNo;
	String course;
	
}
