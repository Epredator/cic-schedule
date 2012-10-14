package war.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Agency {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
		private Long id;
		private Long agency_id;
		private String agencyName;
		private String manager;
		private String phone;
		private String mobile;
		private String email;
		private String email2;
		private String address;
		private String city;
		private String country;
		private String zip;
		private String www;
		private String notes;
		 @OneToMany(mappedBy = "agency")
		    private Set<Agent> agents;
		
		
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getAgency_id() {
			return agency_id;
		}
		public void setAgency_id(Long agency_id) {
			this.agency_id = agency_id;
		}
		public String getAgencyName() {
			return agencyName;
		}
		public void setAgencyName(String agencyName) {
			this.agencyName = agencyName;
		}
		public String getManager() {
			return manager;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail2() {
			return email2;
		}
		public void setEmail2(String email2) {
			this.email2 = email2;
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
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getWww() {
			return www;
		}
		public void setWww(String www) {
			this.www = www;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
	    public Set<Agent> getAgent() {
	        return agents;
	    }

	    public void setAgent(Set<Agent> agents) {
	        this.agents = agents;
	    }
		
		
		
}
