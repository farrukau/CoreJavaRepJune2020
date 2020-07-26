package exam;
/*
Q.4) Now think about a regular class Iphone1. Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Write code after answering above]. 
 * */
public class Iphone1 extends AppleWatch implements Phone{
	
	public void regularClassInfo() {
		System.out.println("Regular Class features: \n1) a blueprint that can create objects \n2) unlike abstract/interface, it only has nonabstract method \n3) methods are only implemented but can not be declared \n4) using extends keyword it can only inherit another regular class or an abstract class \n5) using implements keyword it can only inherit single or multiple interfaces");
	}
	
	public void interfaceInfo() { //from interface class Phone
		System.out.println("Features of interface: \n1) a blueprint of Java class, \n2) contains a number of methods with static constants, \n3) has abstract type methods that can only be declared but not implemented, \n4) only default and static methods can be implemented in the newer version of Java/ 1.8. \n-We can not created constructor inside an interface. \n-We can not write any variables inside interface.\tBut may be static variable");
		
	}
	public void call() {
		System.out.println("Call is an important feature of a phone device");
	}
	
	public void message() {
		System.out.println("Messaging comes next");
	}
	
	public void camera() {
		System.out.println("Camera a common features in most phone devices");
	}
	
	//The following is a part of the Ans. to the Q.6
	public void iphone1Info() {
		System.out.println("Iphone1 is the superclass of this series");
	}
	
/*
Q.5) Assume 4 private variable name price (as int), Info (as String, write few words when you bought it), user (as a char, M or F), madeInUSA (as boolean) inside Iphone1 class. If the variables are private how can you use those variable? What kind of concept you can use? use it just after the variables. Now print out in TestPhone: "I bought this phone in 2000, the price was 750$, grade is A and boolean value for made in USA is: false". [points: 30] 
 * */
	
	private int price;
	private String Info;
	private char user;
	private boolean madeInUSA;
		
	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return Info;
	}

	public char getUser() {
		return user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub
		
	}
	
	

/*
 Q.7) Again, from Iphone1, we got 4 private variable we know. Create 2 constructor inside it -- default and parameterized after those variables. In IPhone2, declare a char variable(M or F). create default and parameterized constructor, a regular method iPhone2Info, a parameterized method with same name iPhone2Info INSIDE Iphone2. Use super keyword in constructor and methods in Iphone2. Call constructor and methods. Can you call variable by super key word? create a public variable inside Iphone1 and execute it in Iphone2. Execute all of them in TestPhone.
 * */	
	
	public boolean madeinUSA;
	
	public Iphone1() {
		System.out.println("This constructor is from Iphone1 class");
	}
	
	public Iphone1(int price) {
		this.price = price;
		System.out.println("Price: "+price);
	}
	
	
	
	
}
