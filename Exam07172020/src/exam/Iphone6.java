package exam;

public class Iphone6 extends Iphone5{
	
	public void dropbox() {
		System.out.println("Dropbox was introduced in iPhone6");
	}

/*
 Q.8) Now, Think about Iphone6. It also has 2 method same name materials(). They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice). What kind of concept you can use? Can you use final or static method here as same method name? if yes, create them and take more int variable of your own. [points: 30] . Instantiate the class in TestPhone and initialize those methods. [points: 30] . Now think about a regular class Name ConfiguredIphone6 which extends Iphone6. Override those method and change the logic at your own to show the changes. [points: 20] . Show the output in TestPhone. [points: 20] .Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance and single inheritance. [points: 20] .
 * */	
	
	//we can use java_oop_polymorphism concept in this case:
	
	public void materials(int ramPrice, int cameraPrice) { //method-1
		int total = ramPrice + cameraPrice;
		System.out.println("Iphone6 Price: " + total);
	}
	
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice) { //method-2
		int total = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("Iphone6 Price: " + total);
	}
	
	// Final type Method:
	public final int materials(int ramPrice, int cameraPrice, int coverPrice) { //method-3
			int total = ramPrice + cameraPrice + coverPrice;
			System.out.println("Iphone6 Price: " + total);
			return total;
	}
	//Static type Method:
	public static int materials(int screenPrice, String BatteryPrice) { //method-4
		int total = screenPrice + Integer.parseInt(BatteryPrice);
		System.out.println("Iphone6 Price: " + total);
		return total;
			
	}
	
}
