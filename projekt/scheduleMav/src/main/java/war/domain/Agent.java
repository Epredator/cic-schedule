package war.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Agent {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private Long agent_id;
		private String Name;
		private String phone;
		private String mobile;
		private String email;
		
		  public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@ManyToOne
		    private Agency agency;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAgent_id() {
			return agent_id;
		}

		public void setAgent_id(Long agent_id) {
			this.agent_id = agent_id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
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

		public Agency getAgency() {
			return agency;
		}

		public void setAgency(Agency agency) {
			this.agency = agency;
		}

}
