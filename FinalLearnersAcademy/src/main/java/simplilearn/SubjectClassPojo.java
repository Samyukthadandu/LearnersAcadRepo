package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="subject_classes")
@Immutable
public class SubjectClassPojo {
	@Id
	private int SerialNo;
	private int SubID;
	private int CID;
	
	
	
	public SubjectClassPojo() {
		
	}

	

	public SubjectClassPojo(int serialNo, int subID, int cID) {
		super();
		SerialNo = serialNo;
		SubID = subID;
		CID = cID;
	}



	public int getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}

	public int getSubID() {
		return SubID;
	}

	public void setSubID(int subID) {
		SubID = subID;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}
	
	
	
	

}
