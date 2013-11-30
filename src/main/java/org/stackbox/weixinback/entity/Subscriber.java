package org.stackbox.weixinback.entity;

import java.io.Serializable;
import java.util.Date;

public class Subscriber implements Serializable {
	
	private Long id;
	
	private String userOpenId;
	
	private Date createdTime;

	public Subscriber() {}

	public Subscriber(Long id) {
		super();
		this.id = id;
	}

	public Subscriber(Long id, String userOpenId, Date createdTime) {
		super();
		this.id = id;
		this.userOpenId = userOpenId;
		this.createdTime = createdTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserOpenId() {
		return userOpenId;
	}

	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
}
