package exam;
/*
 Q.6) NOW, Iphone1 came in 2000, but new model Iphone2, Iphone3 came in 2001. Assume Iphone1 is a super class and Iphone2, Iphone3 is child class of Iphone1. in 2002, Iphone4 come in the market which inherit Iphone2. in 2003, Iphone5 come in the market which inherit Iphone4. In 2004, Iphone6 come in the market which inherit Iphone5. Consider all of them as a regular class and write a method inside them related to one of the feature like map (use in Iphone3 and print out "Map is introduce in Iphone3. The price is increased to: 780$", here price is int type. When we can use a variable inside a println directly?), youtube, dropbox, photos etc. What kind of concept you can use to relate them? Instantiate all of them and call all the methods possible in TestPhone. [points: 30] .  
 * */
public class Iphone2 extends Iphone1{
		
	
	public void voiceControl() {
	System.out.println("voiceControl is the new feature added to iPhone2");
	
	}
//________________________________________________________________________________
//following code is for Q.7
	
	public char user;
	
	public Iphone2() {
		super.madeinUSA = madeinUSA; //executed public variable from Iphone1 superclass
		System.out.println("Made in USA: " + madeinUSA);
		System.out.println("This constructor is from Iphone2 class");
	}
		public Iphone2(char user) { //parameterized constructor
		super('M');
		this.user = user;
		System.out.println("User: " + user);
	}
	
	public void iphone2Info() { //void type or regular method
		super.iphone1Info(); //can call method of the Iphone1 class
		System.out.println("This method is from Iphone2 class");
	}
	
	public void iphone2Info(char user) { //parameterized method
		this.user = user;
		System.out.println("User: " + user);
		System.out.println("Made in USA: " + madeinUSA);
	}
		
	
	
	
}





