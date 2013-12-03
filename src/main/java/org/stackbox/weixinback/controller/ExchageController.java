package org.stackbox.weixinback.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.stackbox.weixinback.message.response.ResponseTextMessage;
import org.stackbox.weixinback.util.SignHelper;


@Controller
public class ExchageController {
	
	@RequestMapping(value={"/corecontroller"}, method=RequestMethod.GET)
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
	
	@RequestMapping(value={"/cc"}, method=RequestMethod.GET)
	public @ResponseBody ResponseTextMessage fetchXML() {
		ResponseTextMessage msg = new ResponseTextMessage();
		msg.setContent("nihao");
		msg.setCreateTime((new java.util.Date()).getTime());
		msg.setFormUserName("tls");
		msg.setToUserName("touser");
		msg.setMsgType("text");
		return msg;
	}
}
