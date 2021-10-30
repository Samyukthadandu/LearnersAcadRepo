package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="students")
@Immutable
public class StudentPojo {
	@Id
	private int SID;
	private String SFirstName;
	private String SLastName;
	private String ClassSection;
	
	
	
	public StudentPojo() {
		
	}
	
	
	
	public StudentPojo(int sID, String sFirstName, String sLastName, String classSection) {
		super();
		SID = sID;
		SFirstName = sFirstName;
		SLastName = sLastName;
		ClassSection = classSection;
	}



	public int getSID() {
		return SID;
	}



	public void setSID(int sID) {
		SID = sID;
	}



	public String getSFirstName() {
		return SFirstName;
	}



	public void setSFirstName(String sFirstName) {
		SFirstName = sFirstName;
	}



	public String getSLastName() {
		return SLastName;
	}



	public void setSLastName(String sLastName) {
		SLastName = sLastName;
	}



	public String getClassSection() {
		return ClassSection;
	}



	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}



	
	

}
