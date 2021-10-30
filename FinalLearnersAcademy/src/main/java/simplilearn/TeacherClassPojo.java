package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="teacher_classes")
@Immutable
public class TeacherClassPojo {
	
	@Id
	private int SerialNo;
	private int TID;
	private int CID;
	
	
	
	
	public TeacherClassPojo() {
		
	}
    
	

	
	
	public TeacherClassPojo(int serialNo, int tID, int cID) {
		super();
		this.SerialNo = serialNo;
		this.TID = tID;
		this.CID = cID;
	}





	public int getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}

	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	
	

}
