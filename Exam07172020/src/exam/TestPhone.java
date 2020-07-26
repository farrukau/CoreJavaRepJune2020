package exam;

public class TestPhone {

	public static void main(String[] args) {
		
		
		//this portion for Q-8
		System.out.println("\n------------------Method overloading------------------------");
		Iphone6 cal = new Iphone6(); //instantiated
		cal.materials(10, 20);
		cal.materials(10, 20, "30");
		cal.materials(10, 20, 15);
		Iphone6.materials(12, "50");
		
		System.out.println("\n------------------Method overriding------------------------");
		ConfiguredIphone6 mcal = new ConfiguredIphone6(); //instantiated
		mcal.materials(10, 20);
		mcal.materials(10, 20, "30");
		ConfiguredIphone6.materials(12, "50");		
	   //------------------------------------------------------------------------------------	
/*
Q.4) (Remaining part) Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this. [points: 30] .
* */		
		System.out.println("\n------------------------------------------");
		Iphone1 iphone1 = new Iphone1(); //Iphone1 class is instantiated
		iphone1.appleWatchInfo();
		iphone1.regularClassInfo();
				
		System.out.println("\n------------------------------------------");
		AppleWatch appleWatch = new Iphone1(); //an abstract class can't be instantiated w/o the help of a concrete class
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		
		System.out.println("\n------------------------------------------");
		Phone phone = new Iphone1(); //like an abstract class an interface can't be instantiated w/o the help of a concrete class Iphone1
		phone.interfaceInfo();
		phone.battery();
		Phone.wireless(); //as Wireless is a static method, it doesn't need an object; it can be directly called by a class/interface
		phone.call();
		phone.message();
		phone.camera();
		
		
//Following is a part of Ans. to the Q.6) 
//Using "inheritance" concept we can relate all Iphone classes
 		
		System.out.println("\n------------------------------------------");
		Iphone2 iphone2 = new Iphone2();
		iphone2.voiceControl();
		iphone2.iphone1Info();
		iphone2.iphone2Info();
				
		System.out.println("\n------------------------------------------");
		Iphone3 iphone3 = new Iphone3();
		iphone3.map();
		iphone3.iphone1Info();
		
		System.out.println("\n------------------------------------------");
		Iphone4 iphone4 = new Iphone4();
		iphone4.photos();
		iphone4.voiceControl();
		iphone4.iphone1Info();
		
		System.out.println("\n------------------------------------------");
		Iphone5 iphone5 = new Iphone5();
		iphone5.youtube();
		iphone5.photos();
		iphone5.voiceControl();
		iphone5.iphone1Info();
		
		System.out.println("\n------------------------------------------");
		Iphone6 iphone6 = new Iphone6();
		iphone6.dropbox();
		iphone6.youtube();
		iphone6.photos();
		iphone6.voiceControl();
		iphone6.iphone1Info();
		
//Following is a part of Ans. to the Q.7) 
//Iphone1 and Iphone2 classes are already instantiated in above codes, following is the rest		
		System.out.println("\n------------------------------------------");
		iphone1.iphone1Info();
		
		System.out.println("\n------------------------------------------");
		iphone2.iphone2Info();
		
/*
 Q.5) (Remaining part) Now print out in TestPhone: "I bought this phone in 2000, the price was 750$, users sex and boolean value for made in USA is: false".
 * */	
		iphone1.setPrice(600);
		iphone1.setInfo("I bought this phone in 2001");
		iphone1.setUser('M');
		iphone1.setMadeInUSA(false);
		
		System.out.println("Price: "+iphone1.getPrice()+", Info: "+iphone1.getInfo()+", User: "+iphone1.getUser()+", Made in USA: "+iphone1.isMadeInUSA());
		
	}
	

/*
 This is last part of the ans. to the Q.8: (Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance and single inheritance.)
 
 1. Hierarchical: Iphone2 extends Iphone1 and Iphone3 extends Iphone1.
 2. Multilevel: Iphone6 extends Iphone5; Iphone5 extends Iphone4; Iphone4 extends Iphone2 and Iphone2 extends Iphone1.
 3. Single: ConfiguredIphone6 extends Iphone6 or IPhone4 extends Iphone2 or Iphone3 extends Iphone1 and so on..
 * */
	
	
	
	
	
	
	
	

}
