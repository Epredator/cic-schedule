/*
 * This file is part of CIC-Schedule
 * Copyright (C) 2012 
 * 
 *  is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/
 */

package org.cicts.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.cicts.client.Agency;

/**
 * A simple JavaBean class representing an entity associated to an appointment,
 * most likely a person, but might as well be a resource (like a conference room or a
 * projector).
 */
@SuppressWarnings("serial")
public class Group implements Serializable {

   /**
    * The <code>Attendee</code> name (if a person) or description
    * (when a resource).
    */
   private String GroupName;
   private String Group;
   
   private String InvoiceStatus;
   private String GroupStatus;
   private String ReservationWay;
   private List<Agency> agencies = new ArrayList<Agency>();

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

   private Integer GroupId;
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

	   /**
	    * Sets the name 
	    * of this <code>GroupName</code>.
	    *
	    * @param name The name of this Group
	    */
		public void setGroupName(String GroupName) {
			this.GroupName = GroupName;
		}
//===============================================================
			public String getGroup() {
				return Group;
			}

			public void setGroup(String Group) {
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
			 */
			public List<Agency> getagencies() {
				return agencies;
			}
			 /**
			    * Sets the item 
			    * of <code>Agency</code> list .
			    *
			    * @param name The name of this Group
			    */
			
			public void setagencies(List<Agency> agencies) {
				this.agencies = agencies;
			}			  
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

   /**
    * Sets this <code>Attendee</code> email address.
    * @param email The email address
    */
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
}
