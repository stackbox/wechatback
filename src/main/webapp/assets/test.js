function sendMsg() {
	var text = "<xml>" + 
	 "<ToUserName><![CDATA[toUser]]></ToUserName>" + 
	 "<FromUserName><![CDATA[fromUser]]></FromUserName>" +
	 "<CreateTime>1348831860</CreateTime>" +
	 "<MsgType><![CDATA[text]]></MsgType>" +
	 "<Content><![CDATA[this is a test]]></Content>" +
	 "<MsgId>1234567890123456</MsgId>" +
	 "</xml>";
	
	$.ajax({
	    url: "http://localhost:8080/corecontroller",
	    data: text, 
	    type: 'POST',
	    contentType: "text/xml",
	    dataType: "text",
	    success : parse,
	    error : function (xhr, ajaxOptions, thrownError){  
	        console.log(xhr.status);          
	        console.log(thrownError);
	    } 
	}); 
}