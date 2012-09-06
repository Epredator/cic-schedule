package war.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.vaadin.addon.customfield.demo.data.Address;

public class POP implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String popName = "";
     private String responsible = "";
     private Date birthdate;
     private Integer shoesize = 42;
     private String password = "";
     private UUID uuid;
     private String countryCode = "";

     public POP(String popName, String responsible) {
    	 this.popName            = popName;
    	 this.responsible            = responsible;
         uuid = UUID.fromString("3856c3da-ea56-4717-9f58-85f6c5f560a5");
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

     public Date getBirthdate() {
         return birthdate;
     }

     public void setBirthdate(Date birthdate) {
         this.birthdate = birthdate;
     }

     public Integer getShoesize() {
         return shoesize;
     }

     public void setShoesize(Integer shoesize) {
         this.shoesize = shoesize;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public UUID getUuid() {
         return uuid;
     }



 }

