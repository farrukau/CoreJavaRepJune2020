package hw5Q4UseOfSuper01;

/*
 04) Create a package name "hw5Q4UseOfSuper01" in the HW project. Inside the package b) Create a class Son, declare variable stId, grade. Declare default and parameterized constructor, and implement a regular method son and declare a sysout. Create a parameterized method sonInfo() which contains 2 of its variables. Use super keyword and show all the use of the super keyword in child class and initialize in a TestFamily Class.  
 * */

public class Son {
	public int stId;
	public char grade;
	
	
	public Son() {
		System.out.println("this default constrcutor is from Son class");
	}
	
	public Son(int stId, char grade) {
		this.stId = stId;
		this.grade = grade;
		System.out.println("StudentID: "+stId+", Grade: "+grade);
	
	}
	
	public void sonInfo() {
		System.out.println("This method from Son class");
		
	}
	
	public void info(int stId, char grade) {
		this.stId = stId;
		this.grade = grade;
		System.out.println("StudentID: "+stId+", Grade: "+grade);
	}

}
