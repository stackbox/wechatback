package org.stackbox.weixinback.entity;

public class ReplyTextMessage  implements java.io.Serializable {
	
	private Long id;
	
	/**
	 * developer's account
	 */
	private String toUserName;
	
	/**
	 * subscriber's openID
	 */
	private String fromUserName;
	
	/**
	 * UNIX 32bit timestamp
	 */
	private Long createdTime;
	
	/**
	 * message type
	 */
	private String msgType;
	
	/**
	 * Text content
	 */
	private String content;

	public ReplyTextMessage() { }

	public ReplyTextMessage(Long id) {
		super();
		this.id = id;
	}

	public ReplyTextMessage(Long id, String toUserName, String fromUserName,
			Long createdTime, String msgType, String content) {
		super();
		this.id = id;
		this.toUserName = toUserName;
		this.fromUserName = fromUserName;
		this.createdTime = createdTime;
		this.msgType = msgType;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
