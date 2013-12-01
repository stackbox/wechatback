<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();

%>

<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
  <ul>
    <li class="active">
	<a href="javascript:void(0)">
	    <i class="icon icon-home"></i> 
            <span>仪表盘</span>
	    <span class="label label-important">9</span>
	</a>
    </li>

    <li> 
 	<a href="javascript:void(0)">
		<i class="icon icon-signal"></i> 
		<span>最近消息</span>
	</a>
    </li>
	
     <li> 
 	<a href="javascript:void(0)">
		<i class="icon icon-signal"></i> 
		<span>用户管理</span>
	</a>
    </li>
  </ul>
</div>
<!--sidebar-menu-->