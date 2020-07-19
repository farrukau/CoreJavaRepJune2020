package hw6Q2Abstraction04;

public interface College { 
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
   

