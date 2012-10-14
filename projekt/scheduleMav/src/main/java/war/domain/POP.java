package war.domain;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class POP {
	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long id;
	private Long pop_id;
	private String popName;
    private String responsible;
    private Integer mobile;
    private Integer phone;
    private String email;
    private String address;
    private String city;
    private String zip;
    private Integer no_person;
    private Integer no_seat;
    private String www;
    private String note;
    @ManyToOne
    private Shrine shrine;
    

	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPop_id() {
		return pop_id;
	}

	public void setPop_id(Long pop_id) {
		this.pop_id = pop_id;
	}

	public String getPopName() {
		return popName;
	}

	public void setPopName(String popName) {
		this.popName = popName;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Integer getNo_person() {
		return no_person;
	}

	public void setNo_person(Integer no_person) {
		this.no_person = no_person;
	}

	public Integer getNo_seat() {
		return no_seat;
	}

	public void setNo_seat(Integer no_seat) {
		this.no_seat = no_seat;
	}

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Shrine getShrine() {
		return shrine;
	}

	public void setShrine(Shrine shrine) {
		this.shrine = shrine;
	}

	@Override
	    public boolean equals(Object obj) {
	        if (obj instanceof POP) {
	            POP p = (POP) obj;
	            if (this == p) {
	                return true;
	            }
	            if (this.id == null || p.id == null) {
	                return false;
	            }
	            return this.id.equals(p.id);
	        }

	        return super.equals(obj);
	    }//eof
	 
	 @Override
	    public int hashCode() {
	        return id == null ? 0 : id.hashCode();
	    }//eof




 }


