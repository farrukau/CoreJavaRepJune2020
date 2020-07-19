package hw6Q2Abstraction04;
/*
 02) Copy your previous package "hw5Q2Abstraction03" and rename it to "hw6Q2Abstraction04" inside your HW project and execute the remaining. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.
 * */
public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n--------------------------------------");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity(); //ColumbiaUniversity class is instantiated
		columbiaUniversity.columbiaUniversityInfo();
		columbiaUniversity.classsize();
		columbiaUniversity.field();
		columbiaUniversity.cafeteria();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();
		//columbiaUniversity.library(); as it is a static method, it can be directly called by a class/interface
		University.library();
		
		columbiaUniversity.vocationalinfo();
		columbiaUniversity.aeronoticalinfo();
		columbiaUniversity.commonRoom();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.surgeryRoom();
		
		System.out.println("\n-------------------------------");
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
		rockefellerUniversity.rockefellerUniversityInfo();
		rockefellerUniversity.aeronoticalinfo();
		
		System.out.println("\n-------------------------------");
		University university = new ColumbiaUniversity(); //bcz an interface can not be instantiated by itself it needs the help from a concrete class such coumbiauniv
		university.classsize();
		university.field();
		university.gymnasium();
		university.teacher();
		
		System.out.println("\n-------------------------------");
		Hospital hospital = new ColumbiaUniversity();
		hospital.cafeteria();
		hospital.emergencyRoom();
		hospital.morgue();
		hospital.surgeryRoom();
		
		System.out.println("\n-------------------------------");
		MedicalSchool medicalSchool = new ColumbiaUniversity(); //like an interface an abstract class can't be instantiated w/o the help of a concrete class
		medicalSchool.anatomyLab();
		medicalSchool.reseachCenter();
		
		System.out.println("\n-------------------------------");
		NursingSchool nursingSchool = new ColumbiaUniversity();
		nursingSchool.nursingBldg();
		nursingSchool.nursingDept();
		


		
		
		
		
		


		
	
		
		
		
		
		
		

	}

}
