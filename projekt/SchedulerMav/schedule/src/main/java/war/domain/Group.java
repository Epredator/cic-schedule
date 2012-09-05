package war.domain;

import java.util.Date;

import javax.persistence.Entity;


import org.vaadin.addon.customfield.demo.data.Address;


@Entity
public class Group {

	  private String groupName = "";
	    private String responsible = "";
	    private Integer phone = null;
	    private String email = "";
	    private String country = "";
	    private Address address;
	    
	    

		private Date arrival;
	    private Date departure;
	    
	    public Group() {
	    }

		public Group(String groupName, String responsible, Integer phone, String email, String country,
	            Address address, Date arrival, Date departure ) {
	        this.groupName = groupName;
	        this.responsible = responsible;
	        this.phone = phone;
	        this.email = email;
	        this.country = country;

	        this.address = address;
	        this.arrival = arrival;
	        this.departure = departure;
	    }

	    public String getGroupName() {
	        return groupName;
	    }

	    public void setGroupName(String groupName) {
	        this.groupName = groupName;
	    }

	    public String getResponsible() {
	        return responsible;
	    }

	    public void setResponsible(String responsible) {
	        this.responsible = responsible;
	    }

	  

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public Address getAddress() {
	        return address;
	    }
	    
	    public Date getArrival() {
			return arrival;
		}

		public void setArrival(Date arrival) {
			this.arrival = arrival;
		}

		public Date getDeparture() {
			return departure;
		}

		public void setDeparture(Date departure) {
			this.departure = departure;
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
		

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}



	}
