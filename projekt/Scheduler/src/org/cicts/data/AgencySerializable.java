package org.cicts.data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: adas
 * Date: 22.07.12
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class AgencySerializable implements Serializable {



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
