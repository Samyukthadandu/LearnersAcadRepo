package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="teacher_subject")
@Immutable



public class TeacherSubjectPojo {
	
	private int TID;
	private int SubID;
	
	
	
	public TeacherSubjectPojo() {
	
	}
	public TeacherSubjectPojo(int tID, int subID) {
		super();
		TID = tID;
		SubID = subID;
	}
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public int getSubID() {
		return SubID;
	}
	public void setSubID(int subID) {
		SubID = subID;
	}
	
	
	

}
