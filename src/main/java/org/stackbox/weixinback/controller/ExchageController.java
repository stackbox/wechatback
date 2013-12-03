package org.stackbox.weixinback.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.stackbox.weixinback.util.SignHelper;

@Controller
public class ExchageController {
	
	@RequestMapping(value={"/corecontroller"}, method=RequestMethod.GET)
	@ResponseBody
	public String checkSign(HttpServletRequest request) {
		String signature = null;
		String timestamp = null;
		String echoStr = null;
		String nonce = null;
		try {
			signature = request.getParameter("signature");
			timestamp = request.getParameter("timestamp");
			echoStr = request.getParameter("echostr");
			nonce = request.getParameter("nonce");
		} catch (Exception e) {
			return "";
		}
		if(SignHelper.checkSignature(signature, timestamp, nonce)) {
			return echoStr;
		} else {
			return "";
		}
	}
}
