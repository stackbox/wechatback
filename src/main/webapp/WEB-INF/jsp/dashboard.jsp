<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();

%>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/fullcalendar.css" />
<link rel="stylesheet" href="assets/css/matrix-style.css" />
<link rel="stylesheet" href="assets/css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part--> 


<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">叠搭宝箱</span></a></li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>
<!--close-top-Header-menu-->

<!--close-top-serch-->
<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
  <ul>
    <li class="active">
	<a href="index.html">
	    <i class="icon icon-home"></i> 
            <span>仪表盘</span>
	    <span class="label label-important">9</span>
	</a>
    </li>

    <li> 
 	<a href="charts.html">
		<i class="icon icon-signal"></i> 
		<span>最近消息</span>
	</a>
    </li>
	
     <li> 
 	<a href="charts.html">
		<i class="icon icon-signal"></i> 
		<span>用户管理</span>
	</a>
    </li>


   
   

  </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">

<!--breadcrumbs-->
  <div id="content-header">
    <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
  </div>
<!--End-breadcrumbs-->

 

<!--Chart-box-->    
    
      <div class="widget-box">
        <div class="widget-title bg_lg"><span class="icon"><i class="icon-signal"></i></span>
          <h5>Site Analytics</h5>
        </div>
        <div class="widget-content" >
          <div class="row-fluid">
            <div class="span9">
              <div class="chart"></div>
            </div>
          </div>
        </div>
      </div>
 
<!--End-Chart-box--> 
    <hr/>

    
  </div>
</div>

<!--end-main-container-part-->

<!--Footer-part-->

<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; Wechat backstag <a href="http://stackbox.org/">stackbox.org</a> </div>
</div>

<!--end-Footer-part-->

<script src="assets/js/excanvas.min.js"></script> 
<script src="assets/js/jquery.min.js"></script> 
<script src="assets/js/jquery.ui.custom.js"></script> 
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/jquery.flot.min.js"></script> 
<script src="assets/js/jquery.flot.resize.min.js"></script> 
<script src="assets/js/jquery.peity.min.js"></script> 
<script src="assets/js/fullcalendar.min.js"></script> 
<script src="assets/js/matrix.js"></script> 
<script src="assets/js/matrix.dashboard.js"></script> 
<script src="assets/js/jquery.gritter.min.js"></script> 
<script src="assets/js/matrix.interface.js"></script> 
<script src="assets/js/matrix.chat.js"></script> 
<script src="assets/js/jquery.validate.js"></script> 
<script src="assets/js/matrix.form_validation.js"></script> 
<script src="assets/js/jquery.wizard.js"></script> 
<script src="assets/js/jquery.uniform.js"></script> 
<script src="assets/js/select2.min.js"></script> 
<script src="assets/js/matrix.popover.js"></script> 
<script src="assets/js/jquery.dataTables.min.js"></script> 
<script src="assets/js/matrix.tables.js"></script> 

<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
              resetMenu();            
          } 
          // else, send page to designated URL            
          else {  
            document.location.href = newURL;
          }
      }
  }

// resets the menu selection upon entry to this page:
function resetMenu() {
   document.gomenu.selector.selectedIndex = 2;
}
</script>
</body>
</html>