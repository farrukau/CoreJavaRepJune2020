package hw6Q2Abstraction04;
/*
 02) Copy your previous package "hw5Q2Abstraction03" and rename it to "hw6Q2Abstraction04" inside your HW project and execute the remaining. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.  
 * */
public abstract class MedicalSchool extends NursingSchool{
	
	public abstract void anatomyLab();
	
	public void reseachCenter() {
		System.out.println("cutting-edge biomedical research");
	}

	
}


