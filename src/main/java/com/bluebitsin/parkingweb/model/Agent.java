package com.bluebitsin.parkingweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agent")
public class Agent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile")
	private int mobile;
	
	@Column(name = "agent_code")
	private String agentCode;
	
	@Column(name = "password")
	private String agentPassword;

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(int id, String name, int mobile, String agentCode, String agentPassword) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.agentCode = agentCode;
		this.agentPassword = agentPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentPassword() {
		return agentPassword;
	}

	public void setAgentPassword(String agentPassword) {
		this.agentPassword = agentPassword;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", mobile=" + mobile + ", agentCode=" + agentCode
				+ ", agentPassword=" + agentPassword + "]";
	}

}
