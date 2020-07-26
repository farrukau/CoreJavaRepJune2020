package exam;
/*
 Q.3) Assume AppleWatch is an abstract Class which have 2 method: One is abstractClassInfo [which is a non abstract method, print out all the features of an abstract class compared with Interface, regular class]. what type of method would be the other one - name appleWatchInfo? Create two interface name Watch, DigitalWatch. And a regular class name AppleWatchSeries5. Can you make a relationship with AppleWatch, Watch, DigitalWatch and AppleWatchSeries5?
 * */
public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch{
	
	public void abstractClassInfo() { //non-abstract method; implemented
		System.out.println("Features of Abstract Class: \n1) a superclass, can not create object or can not be instantiated, \n2) can have abstract and nonabstract methods, \n3) abstract method can not be implemented, only declared, \n4) extends keyword is used to inherit only one abstract or regular class but NOT an interface \n5) implements keyword is used to inherit one or multiple interfaces but NOT any abstract/regular class.");
	}
	
	public abstract void appleWatchInfo(); //abstract method that contains 'abstract keyword; methods only declared here

}
