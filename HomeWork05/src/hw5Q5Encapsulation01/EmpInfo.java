package hw5Q5Encapsulation01;


public class EmpInfo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Farruk");
		employee.setAge(40);
		employee.setSex('M');
		employee.setUsCitizen(false);
		
		System.out.println("Name: "+employee.getName()+", Age: "+employee.getAge()+", Sex: "+employee.getSex()+", US Citizen: "+employee.isUsCitizen());

	}

}
