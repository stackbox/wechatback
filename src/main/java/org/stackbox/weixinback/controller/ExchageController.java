package org.stackbox.weixinback.controller;

import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.stackbox.weixinback.common.NoEscapeHandler;
import org.stackbox.weixinback.message.request.RequestTextMessage;
import org.stackbox.weixinback.message.response.ResponseTextMessage;
import org.stackbox.weixinback.util.SignHelper;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;


@Controller
public class ExchageController {
	
	@RequestMapping(value={"/corecontroller"},method=RequestMethod.GET)
	@ResponseBody
	public String checkSign(HttpServletRequest request) {
	
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String echoStr = request.getParameter("echostr");
		String nonce = request.getParameter("nonce");
	
		if(SignHelper.checkSignature(signature, timestamp, nonce)) {
			return echoStr;
		} else {
			return "";
		}
	}
	
	@RequestMapping(value={"/corecontroller"}, method=RequestMethod.POST)
	@ResponseBody 
	public String fetchXML(@RequestBody RequestTextMessage reqMsg, HttpServletResponse response) {
		response.setContentType("text/xml;charset=UTF-8");
		try {
			JAXBContext context = JAXBContext.newInstance(ResponseTextMessage.class);
			CharacterEscapeHandler escapeHandler = NoEscapeHandler.theInstance;
			Marshaller m = context.createMarshaller();
			m.setProperty("com.sun.xml.bind.characterEscapeHandler", escapeHandler);
			
			ResponseTextMessage msg = new ResponseTextMessage();
			msg.setContent("喵呜，系统娘正在全力研发中。。。");
			msg.setCreateTime((new java.util.Date()).getTime()/1000);
			msg.setFromUserName(reqMsg.getToUserName());
			msg.setToUserName(reqMsg.getFromUserName());
			msg.setMsgType("text");
			
			StringWriter writer = new StringWriter();
			m.marshal(msg, writer);
			
			System.out.println(writer.toString());
			
			return new String(writer.toString().getBytes("UTF-8"), "ISO-8859-1");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "xx";
		} 
	}
}
