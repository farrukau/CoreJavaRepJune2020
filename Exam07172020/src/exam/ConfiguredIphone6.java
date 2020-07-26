package exam;

//following code is part of Q-08

public class ConfiguredIphone6 extends Iphone6{
	
	@Override
	public void materials(int ramPrice, int cameraPrice) { //method-1
		int total = ramPrice + cameraPrice + 20;
		System.out.println("Total price: " + total);
	}
	@Override
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice) { //method-2
		int total = ramPrice + cameraPrice + 20 + Integer.parseInt(ProcessorPrice);
		System.out.println("Total price: " + total);
	}
	
	//@Override// Final type Method (can not be override/changed):
		//public final int materials(int ramPrice, int cameraPrice, int coverPrice) { //method-3
				//int total = ramPrice + cameraPrice + coverPrice;
				//System.out.println("Total price: " + total);
				//return total;
		
	//@Override//Static type Method: it can not be override as well as it is a local method.
	//But it can belong to this ConfiguredIhone6 class if we remove the @override keyword at the beginning
		public static int materials(int screenPrice, String BatteryPrice) { //method-4
			int total = screenPrice + 30 + Integer.parseInt(BatteryPrice);
			System.out.println("Total price: " + total);
			return total;
		}

}
