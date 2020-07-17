package hw5Q2Abstraction03;
/*
02) Copy your previous package "hw4Q2Abstraction02" and rename it to "hw5Q2Abstraction03" inside your HW project and execute the remaining. Read the question very carefully. i) Create also one default and one static method dorm and studyRoom inside interface "College". How many keywords are used for the inheritance in Java? how many keywords are used for the inheritance in Interface, answer by Java comments? if you can use the keyword 'implements' in Interface, please use it. Use all the interfaces -- University, Hospital, and College to answer my questions
 * */
public interface College extends University, Hospital { //interface can inherit more than one interface
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
public default void dorm() { //default method
	System.out.println("dorm facility");
}

public static void studyroom() { //static method
	System.out.println("studyroom facility");
}

}
    
	/*
	 Two keywords -'extends' and 'implements'are used for the inheritance in Java.
	 The keyword 'extends' is only used for inheritance in interface.
	 An interface can not inherit by implements keyword.  
	 **/

