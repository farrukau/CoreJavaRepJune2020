package hw6Q2Abstraction04;


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
