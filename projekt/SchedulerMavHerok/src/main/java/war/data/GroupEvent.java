package war.data;

import java.io.Serializable;
import java.util.Date;


public class GroupEvent implements Serializable {
	
	  private static final long serialVersionUID = -8008027767038119796L;
	    private Integer ID = null;
	    private String groupName = "";
	    private String responsible = "";
	    private Integer mobilePhone = null;
	    private Integer phone = null;
	    private Integer otherPhone = null;
	    private String email = "";
	    private String homeEmail = "";
	    private String street = "";
	    private Integer zip = null;
	    private String city = "";
	    private String state = "";
	    private String country = "";
	   
	    private Date arrival;
	    private Date departure;
	  
	    public GroupEvent() {
	    }
	    
	    public GroupEvent(Integer ID, String groupName,
	    		String responsible, Integer mobilePhone, Integer phone,
	    		Integer otherPhone, String email, String homeEmail, 
	    		String street, Integer zip, String city, String state, 
	    		String country, Date arrival, Date departure) {
	        this.ID = ID;
	        this.groupName = groupName;
	        this.responsible = responsible;
	        this.mobilePhone = mobilePhone;
	        this.phone = phone;
	        this.otherPhone = otherPhone;
	        this.email = email;
	        this.homeEmail = homeEmail;
	        this.street = street;
	        this.zip = zip;
	        this.city = city;
	        this.state = state;
	        this.city = city;
	        this.country = country;
	        this.arrival = arrival;
	        this.departure = departure;
	    }
	    
	    public Integer getID() {
	        return ID;
	    }

	    public void setID(Integer ID) {
	        this.ID = ID;
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
	    
	    public Integer getMobilePhone() {
	        return mobilePhone;
	    }

	    public void setMobilePhone(Integer mobilePhone) {
	        this.mobilePhone = mobilePhone;
	    }
	    
	    public Integer getPhone() {
	        return phone;
	    }

	    public void setPhone(Integer phone) {
	        this.phone = phone;
	    }
	    
	    public Integer getOtherPhone() {
	        return otherPhone;
	    }

	    public void seOtherPhone(Integer otherPhone) {
	        this.otherPhone = otherPhone;
	    }
	    
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getHomeEmail() {
	        return homeEmail;
	    }

	    public void setHomeEmail(String homeEmail) {
	        this.homeEmail = homeEmail;
	    }
	    
	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }
	    
	    public Integer getZip() {
	        return zip;
	    }

	    public void setZip(Integer zip) {
	        this.zip = zip;
	    }
	    
	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }
	    
	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }
	    
	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
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

}
