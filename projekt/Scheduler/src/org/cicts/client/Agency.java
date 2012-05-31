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

/**
 * A simple JavaBean class representing an entity associated to an appointment,
 * most likely a person, but might as well be a resource (like a conference room or a
 * projector).
 */
@SuppressWarnings("serial")
public class Agency implements Serializable {

 
   private String AgencyName ;
   private String AgencyManager;
   private Integer AgencyID;
   
   private String AgencyAddress;
	private String Country;
	private String City;
	private Integer AgencyPhone;
	private Integer AgencyFax;
	private String AgencyEmail;

	   /**
	    * This <code>Group</code> email address.
	    */
	private String Email;
	private String AgencyWeb ;
	private String Notes ;

   private String createdBy;

   /**
    * A URL to an image to depict this <code>Group</code>.
    */
	private String imageUrl;
//===============================================================
   /**
    * Returns the name  
    * of this <code>AgencyName </code>.
    *
    * @return The currently configured name of this agency
    */
	public String getAgencyName () {
		return AgencyName ;
	}

   /**
    * Sets the name 
    * of this <code>GroupName</code>.
    *
    * @param name The name of this Group
    */
	public void setAgencyName (String AgencyName ) {
		this.AgencyName = AgencyName ;
	}
//===============================================================
		public Integer getAgencyID() {
			return AgencyID;
		}

		public void setAgencyID(Integer AgencyID) {
			this.AgencyID = AgencyID;
		}
//===============================================================
		public String getAgencyManager() {
			return AgencyManager;
		}

		public void setAgencyManager(String AgencyManager) {
			this.AgencyManager = AgencyManager;
		}
//===============================================================
		public String getAgencyAddress() {
				return AgencyAddress;
			}

			public void setAgencyAddress(String AgencyAddress) {
				this.AgencyAddress = AgencyAddress;
			}
//===============================================================
		public String getCountry() {
				return Country;
			}
		public void setCountry(String Country) {
				this.Country = Country;
			}
//===============================================================
		public String getCity() {
			return City;
		}
	public void setCity(String City) {
			this.City = City;
		}
//===============================================================	
	public Integer getAgencyPhone() {
		return AgencyPhone;
	}
public void setAgencyPhone(Integer AgencyPhone) {
		this.AgencyPhone = AgencyPhone;
	}
//===============================================================
public Integer getAgencyFax() {
	return AgencyFax;
}
public void setAgencyFax(Integer AgencyFax) {
	this.AgencyFax = AgencyFax;
}
//===============================================================	
public String getAgencyEmail() {
	return AgencyEmail;
}
public void setAgencyEmail(String AgencyEmail) {
	this.AgencyEmail = AgencyEmail;
}
//===============================================================
public String getAgencyWeb() {
	return AgencyWeb;
}
public void setAgencyWeb(String AgencyWeb) {
	this.AgencyWeb = AgencyWeb;
}
//===============================================================	
public String getNotes() {
	return Notes;
}
public void setNotes(String Notes) {
	this.Notes = Notes;
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
