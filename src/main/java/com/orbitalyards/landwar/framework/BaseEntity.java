package com.orbitalyards.landwar.framework;

import java.sql.Timestamp;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

public abstract class BaseEntity implements DomainObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "CREATE_TM", insertable = true, updatable = false)
	private Timestamp createDate;
	
	@Version
	@Column(name = "UPDATE_TM")
	private Timestamp updateDate;
	
	@PrePersist
	protected void onCreate() {
		createDate = new Timestamp(System.currentTimeMillis());
	}
	
	@PreUpdate
	public void onUpdate() {
		updateDate = new Timestamp(System.currentTimeMillis());
	}
	
	public Optional<Timestamp> getCreateDate() {
		return Optional.ofNullable(createDate);
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Optional<Timestamp> getUpdateDate() {
		return Optional.ofNullable(updateDate);
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
}
