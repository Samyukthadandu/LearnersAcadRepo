package simplilearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="teacherstable")
@Immutable
public class Teachers {
	
	@Id
	private int TID;
	private String TFirstName;
	private String TLastName;
	
	
	
	
	public Teachers() {
		
	}
	public Teachers(int tID, String tFirstName, String tLastName) {
		super();
		this.TID = tID;
		this.TFirstName = tFirstName;
		this.TLastName = tLastName;
	}
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public String getTFirstName() {
		return TFirstName;
	}
	public void setTFirstName(String tFirstName) {
		TFirstName = tFirstName;
	}
	public String getTLastName() {
		return TLastName;
	}
	public void setTLastName(String tLastName) {
		TLastName = tLastName;
	}
	
	

}
