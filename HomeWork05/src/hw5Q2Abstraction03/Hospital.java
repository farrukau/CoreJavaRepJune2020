package hw5Q2Abstraction03;

/*
 02) Copy your previous package "hw4Q2Abstraction02" and rename it to "hw5Q2Abstraction03" inside your HW project and execute the remaining. Read the question very carefully. i) Create one default and one static method morgue and pharmacy inside interface "Hospital".
 * */

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
public default void morgue() { //default
	System.out.println("morgue facility");
}

public static void pharmacy() { //static
	System.out.println("pharmacy space");
}

}
