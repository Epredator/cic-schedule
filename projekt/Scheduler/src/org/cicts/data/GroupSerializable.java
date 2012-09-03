package org.cicts.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bradrydzewski.gwt.calendar.client.Appointment;
import com.bradrydzewski.gwt.calendar.client.Attendee;
import com.bradrydzewski.gwt.calendar.client.DateUtils;


@SuppressWarnings("serial")
public class GroupSerializable implements Comparable<GroupSerializable>,  Serializable {
	
	
	public GroupSerializable() {

	}

	private Integer GroupId;

    private String GroupName;
    private Integer Group;

    private String InvoiceStatus;
    private String GroupStatus;
    private String ReservationWay;
    private List<AgencySerializable> agencies = new ArrayList<AgencySerializable>();

    private Date Arrival;
    private Date Departure;
    private String Responsible;
    private String Staying;
    private String Country;
    private String Language;
    private Integer Phone;
    /**
     * This <code>Group</code> email address.
     */
    private String Email;

    private String Church;
    private String Celebrant ;
    private String OtherContact ;
    private String Notes ;

    private Integer Bishop;
    private Integer Priest;
    private Integer Participants;

    
    private String createdBy;

    /**
     * A URL to an image to depict this <code>Group</code>.
     */
    private String imageUrl;
//===============================================================
    /**
     * Returns the name
     * of this <code>GroupName</code>.
     *
     * @return The currently configured name of this group
     */
    public String getGroupName() {
        return GroupName;
    }

    public  void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }
    //===============================================================
    public Integer getGroup() {
        return Group;
    }

    public void setGroup(Integer Group) {
        this.Group = Group;
    }
    //===============================================================
    public String getInvoiceStatus() {
        return InvoiceStatus;
    }

    public void setInvoiceStatus(String InvoiceStatus) {
        this.InvoiceStatus = InvoiceStatus;
    }
    //===============================================================
    public String getGroupStatus() {
        return GroupStatus;
    }
    public void setGroupStatus(String GroupStatus) {
        this.GroupStatus = GroupStatus;
    }
    //===============================================================
    public String getReservationWay() {
        return ReservationWay;
    }
    public void setReservationWay(String ReservationWay) {
        this.ReservationWay = ReservationWay;
    }
//===============================================================
    /**
     * Returns the list
     * of  <code>Agencies</code>.
     *
     * @return The currently configured name of this group
     
    public List<AgencySerializable> getagencies() {
        return agencies;
    }




    public void setagencies(List<AgencySerializable> agencies) {
        this.agencies = agencies;
    }
    */
    //===============================================================
    public Date getArrival() {
        return Arrival;
    }

    public void setArrival(Date Arrival) {
        this.Arrival = Arrival;
    }
    //===============================================================
    public Date getDeparture() {
        return Departure;
    }

    public void setDeparture(Date Departure) {
        this.Departure = Departure;
    }
    //===============================================================
    public String getResponsible() {
        return Responsible;
    }
    public void setResponsible(String Responsible) {
        this.Responsible = Responsible;
    }
    //===============================================================
    public String getChurch() {
        return Church;
    }
    public void setChurch(String Church) {
        this.Church = Church;
    }
    //===============================================================
    public String getStaying() {
        return Staying;
    }
    public void setStaying(String Staying) {
        this.Staying = Staying;
    }
    //===============================================================
    public String getCelebrant() {
        return Celebrant;
    }
    public void setCelebrant(String Celebrant) {
        this.Celebrant = Celebrant;
    }
    //===============================================================
    public String getOtherContact() {
        return OtherContact;
    }
    public void setOtherContact(String OtherContact) {
        this.OtherContact = OtherContact;
    }
    //===============================================================
    public String getNotes() {
        return Notes;
    }
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    //===============================================================
    public String getCountry() {
        return Country;
    }
    public void setCountry(String Country) {
        this.Country = Country;
    }
    //===============================================================
    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String Language) {
        this.Language = Language;
    }
    //===============================================================
    public Integer getPhone() {
        return Phone;
    }
    public void setPhone(Integer Phone) {
        this.Phone = Phone;
    }
    //===============================================================
    public Integer getBishop() {
        return Bishop;
    }
    public void setBishop(Integer Bishop) {
        this.Bishop = Bishop;
    }
    //===============================================================
    public Integer getPriest() {
        return Priest;
    }
    public void setPriest(Integer Priest) {
        this.Priest = Priest;
    }
    //===============================================================
    public Integer getParticipants() {
        return Participants;
    }
    public void setParticipants(Integer Participants) {
        this.Participants = Participants;
    }
    //===============================================================
    public Integer getGroupId	() {
        return 	GroupId	;
    }
    public void setGroupId	(Integer GroupId) {
        this.GroupId = GroupId;
    }
    //===============================================================
    public String getcreatedBy	() {
        return 	createdBy	;
    }
    public void setcreatedBy	(String createdBy) {
        this.createdBy = createdBy;
    }
//===============================================================



    /**
     * Returns this <code>Attendee</code> email address.
     *
     * @return  The email address
     */
    public String getEmail() {
        return Email;
    }


    public void setEmail(String Email) {
        this.Email = Email;
    }



    /**
     * Returns the URL to an image to (optionally) depict this <code>Attendee</code>
     * in the views.
     * @return A URL (relative or absolute) meaningful within the
     * deployed application context
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the URL to an image to (optionally) depict this <code>Attendee</code>
     * in the views.
     * @param imageUrl A URL (relative or absolute) meaningful within the
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    
	public List<AgencySerializable> getAgencies() {
		return agencies;
	}
	
	public void setAgencies(List<AgencySerializable> agencies) {
		this.agencies = agencies;
	}
	
	public int compareTo(GroupSerializable group){
		int compare =this.getGroupId().compareTo(group.getGroupId());	
		
		if (compare ==0){
			compare = group.getGroupId().compareTo(this.getGroupId());
		}
		return compare;
	}
	
	
	
    
    public GroupSerializable clone() {
    	GroupSerializable clone = new GroupSerializable();
    	  clone.setArrival(this.Arrival);
    	  clone.setGroupName(this.GroupName);
    	  
    	  
    	 
        
		return clone;
	}
}