package OOP_notes;

public class Encaps {

	public static void main(String[] args) {
		
		Employee firstemp = new Employee();
		firstemp.setNI_number(22222);
		System.out.println("the NI number of the employee can only be assigned through setNI method "
		+ firstemp.getNI_number());
	
	
		//firstemp.NI_number = 33333; (this will give error as no direct access to data is allowed to this object)
		
		firstemp.phonenum=78956443; //here the object have access to phonenum as it is not private
		
		System.out.println("I can set the phone number directly to "+firstemp.phonenum);
		
	}
}
