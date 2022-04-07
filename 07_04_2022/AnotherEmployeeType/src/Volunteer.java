
//*********************************************
//  Volunteer.java		Author: Lewis/Loftus
//
//  Represents a staff member that works as a volunteer.
//*********************************************

public class Volunteer extends StaffMember {
	public Volunteer (String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}
	
	public double pay() {
		return 0.0;
	}
}
