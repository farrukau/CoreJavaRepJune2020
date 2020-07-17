package hw5Q4UseOfSuper01;

/*
04) Create a package name "hw5Q4UseOfSuper01" in the HW project. Inside the package, a) Create a class, Father. declare some variable Name, age, sex, usCitizen. Declare default and parameterized constructor. Create a regular method father() which is implemented, declare a sysout. Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout.  
Use super keyword and show all the use of the super keyword in child class and initialize in a TestFamily Class.    
 * */

public class Father extends Son {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	

	public Father() {
		super(121, 'A'); //Either default or parameterized constructor is called using 'super' keyword
		super.sonInfo(); //method is called using super keyword
		super.info(121, 'A'); //parameterized method is called using super
		super.stId = 121; 
		System.out.println("Student ID: " + stId); //super keyword can initialize variables
		System.out.println("This default constructor is from Father class");
	}

	public Father(String Name, int age, char sex, boolean usCitizen) { //parameterized constructor declared
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: "+Name+", Age: "+age+", Sex: "+sex+" and US Citizen: "+usCitizen);
    }
	
	public void fatherInfo() { 
		System.out.println("This method is from Father class");
	}
	public void info(String Name, int age, char sex, boolean usCitizen){ //parameterized method
			this.Name = Name;
			this.age = age;
			this.sex = sex;
			this.usCitizen = usCitizen;
			System.out.println(Name+" "+age+" "+sex+" "+usCitizen);
		}
		
	}		
		