package war.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TemporalType;



@Entity
public class Group {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
		private Long id;
		private String groupName;
	    private String responsible;
	    private Integer mobile;
	    private Integer phone;
	    private String email;
	    private String homeEmail;
	    private String street;
	    private Integer zip;
	    private String city; 
	    private String state; 
	    private String country;
	    private String language;
	    
	    @Temporal(value = TemporalType.DATE) 
	    private Date arrival;
	    @Temporal(value = TemporalType.DATE) 
	    private Date departure;
	    
	    private String invStatus;
	    private String groupStatus;
	    private String reservWay;
	    private String church;
	    private String celebrant;
	    private String staying;
	    private Integer noBishop;
	    private Integer noPriest;
	    private Integer noParticipatn;
	    private String note;
	    
	    @ManyToOne
	    private POP pop;
	    
	    @ManyToOne
	    private Agent agent;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
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

		public String getInvStatus() {
			return invStatus;
		}

		public void setInvStatus(String invStatus) {
			this.invStatus = invStatus;
		}

		public String getGroupStatus() {
			return groupStatus;
		}

		public void setGroupStatus(String groupStatus) {
			this.groupStatus = groupStatus;
		}

		public String getReservWay() {
			return reservWay;
		}

		public void setReservWay(String reservWay) {
			this.reservWay = reservWay;
		}

		public String getChurch() {
			return church;
		}

		public void setChurch(String church) {
			this.church = church;
		}

		public String getCelebrant() {
			return celebrant;
		}

		public void setCelebrant(String celebrant) {
			this.celebrant = celebrant;
		}

		public String getStaying() {
			return staying;
		}

		public void setStaying(String staying) {
			this.staying = staying;
		}

		public Integer getNoBishop() {
			return noBishop;
		}

		public void setNoBishop(Integer noBishop) {
			this.noBishop = noBishop;
		}

		public Integer getNoPriest() {
			return noPriest;
		}

		public void setNoPriest(Integer noPriest) {
			this.noPriest = noPriest;
		}

		public Integer getNoParticipatn() {
			return noParticipatn;
		}

		public void setNoParticipatn(Integer noParticipatn) {
			this.noParticipatn = noParticipatn;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public POP getPop() {
			return pop;
		}

		public void setPop(POP pop) {
			this.pop = pop;
		}

		public Agent getAgent() {
			return agent;
		}

		public void setAgent(Agent agent) {
			this.agent = agent;
		}

	    
	    

		
	    
	 



	}
