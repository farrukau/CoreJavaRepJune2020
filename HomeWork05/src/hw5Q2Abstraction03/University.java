package hw5Q2Abstraction03;

/*
 02) Copy your previous package "hw4Q2Abstraction02" and rename it to "hw5Q2Abstraction03" inside your HW project and execute the remaining. Read the question very carefully. i) Create one default and one static method gymnasium and library inside interface "University". 
 * */

public interface University extends Hospital { //an interface can inherit another interface
	public void classsize();
	public void field();
	public void teacher();
	
	public default void gymnasium() { //default method
		System.out.println("gymnasium facility");
	}	
	public static void library() { //static method
		System.out.println("library facility"); 
	}
	
	
}
