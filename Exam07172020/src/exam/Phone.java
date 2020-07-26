package exam;
/*
 Q.2) Phone is an interface which has four abstract method interfaceInfo, call, message, camera and 2 non abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. When you get a chance to implement interfaceInfo, print out answer for the following questions: [What are the features of Interface you know? Can we create constructor inside an interface? Can we write variable inside Interface? Don't copy paste, write how much you can remember, use new line (\n), tab(\t)], for other abstract method, also print whatever you like.Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wireless and One regular class name LandPhone and one abstract class satelitePhone. make a relation of this 4, with Phone if possible. [points: 30]
 * */

public interface Phone {
	
	public abstract void interfaceInfo();
		//System.out.println("interface is a class - can't be implemented/declared only");
	
	public abstract void call();
	public abstract void message();
	public abstract void camera();
	//we can implement these abstract methods by writing in a concrete class- or Iphone1 (see the codes in Iphone1 class)
	
	public default void battery() {
		System.out.println("battery is a default method from Java 1.8");
	}
	public static void wireless() {
		System.out.println("wireless is a static method from Java 1.8");
	}
	
	
	
	//We can only apply extends keyword but NOT implements for inheritance in interface. 
	//Interface can inherit multiple interfaces using extends keyword.
	
	
	

}
