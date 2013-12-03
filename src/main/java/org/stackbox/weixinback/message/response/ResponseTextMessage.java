package org.stackbox.weixinback.message.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.stackbox.weixinback.common.AdapterXmlCDATA;

@XmlRootElement(name = "xml")
public class ResponseTextMessage {
	private String toUserName;
	private String formUserName;
	private Long createTime;
	private String msgType;
	private String content;
	
	public ResponseTextMessage() {}

	public ResponseTextMessage(String toUserName, String formUserName,
			Long createTime, String msgType, String content) {
		super();
		this.toUserName = toUserName;
		this.formUserName = formUserName;
		this.createTime = createTime;
		this.msgType = msgType;
		this.content = content;
	}

	@XmlJavaTypeAdapter(AdapterXmlCDATA.class)
	public String getToUserName() {
		return toUserName;
	}

	@XmlElement
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	@XmlJavaTypeAdapter(AdapterXmlCDATA.class)
	public String getFormUserName() {
		return formUserName;
	}

	@XmlElement
	public void setFormUserName(String formUserName) {
		this.formUserName = formUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	@XmlElement
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@XmlJavaTypeAdapter(AdapterXmlCDATA.class)
	public String getMsgType() {
		return msgType;
	}

	@XmlElement
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	@XmlJavaTypeAdapter(AdapterXmlCDATA.class)
	public String getContent() {
		return content;
	}

	@XmlElement
	public void setContent(String content) {
		this.content = content;
	}
	
}
