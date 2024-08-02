package com.orbitalyards.landwar.domain.user;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orbitalyards.landwar.framework.BaseEntity;


@Entity
@Table(name = "APP_USER")
public class AppUser extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="USERNAME", nullable=false, updatable = true, insertable = true, length = 32)
	private String userName = "";
	
	@Column(name="PASSCODE", nullable=false, updatable = true, insertable = true, length = 64)
	private String passCode = "";
	
	@Column(name="LOGGED_IN", nullable=false, updatable = true, insertable = true)
	private boolean logIn = false;
	
	@Column(name = "LOG_IN_TIME", nullable=true, updatable = true, insertable = true)
	private Timestamp logInTime = new Timestamp(0);
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassCode() {
		return passCode;
	}

	public void setPasscode(String passCode) {
		this.passCode = passCode;
	}
	
	public boolean getLogIn() {
		return logIn;
	}

	public void setLogIn(boolean logIn) {
		this.logIn = logIn;
	}

	public Timestamp getLogInTime() {
		return logInTime;
	}

	public void setLogInTime(Timestamp logInTime) {
		this.logInTime = logInTime;
	}
}
