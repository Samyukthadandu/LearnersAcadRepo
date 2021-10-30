package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="classestable")
@Immutable
public class ClassPojo {
	@Id
	private int CID;
	private String ClassSectionName;
	
	
	
	public ClassPojo() {
	
	}

	

	public ClassPojo(int cID, String classSectionName) {
		super();
		CID = cID;
		ClassSectionName = classSectionName;
	}



	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public String getClassSectionName() {
		return ClassSectionName;
	}

	public void setClassSectionName(String classSectionName) {
		ClassSectionName = classSectionName;
	}
	
	
	

}
