package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="subjectstable")
@Immutable
public class SubjectPojo {
	
	@Id
	private int SubID;
	private String SubName;
	
	
	
	public SubjectPojo() {
		
	}

	public SubjectPojo(int sID, String subName) {
		super();
		SubID = sID;
		SubName = subName;
	}

	public int getSubID() {
		return SubID;
	}

	public void setSubID(int subID) {
		SubID = subID;
	}

	public String getSubName() {
		return SubName;
	}

	public void setSubName(String subName) {
		SubName = subName;
	}
	
	
}
