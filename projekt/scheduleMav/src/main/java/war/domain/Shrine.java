package war.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Shrine {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	 private Integer shrine_id;
	 private String shrineName;
	 private String sanctSuperior;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getShrine_id() {
		return shrine_id;
	}
	public void setShrine_id(Integer shrine_id) {
		this.shrine_id = shrine_id;
	}
	public String getShrineName() {
		return shrineName;
	}
	public void setShrineName(String shrineName) {
		this.shrineName = shrineName;
	}
	public String getSanctSuperior() {
		return sanctSuperior;
	}
	public void setSanctSuperior(String sanctSuperior) {
		this.sanctSuperior = sanctSuperior;
	}
	 
	 

}
