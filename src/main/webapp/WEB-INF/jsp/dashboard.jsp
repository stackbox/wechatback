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
<link href="//netdna.bootstrapcdn.com/font-awesome/3.0.2/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>



<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="leftbar.jsp"></jsp:include>


<!--main-container-part-->
<div id="content">

<!--breadcrumbs-->
  <div id="content-header">
    <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
  </div>
<!--End-breadcrumbs-->
    
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
   <hr/>
</div>

<!--end-main-container-part-->

<jsp:include page="footer.jsp"></jsp:include>

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