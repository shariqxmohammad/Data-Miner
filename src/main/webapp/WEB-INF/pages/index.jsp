<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Glorious Data Miner</title>	
	
	<link href="<c:url value ="/resources/css/style.css"/>" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="<c:url value="/webjars/bootstrap/3.2.0/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/webjars/jasny-bootstrap/3.1.3/css/jasny-bootstrap.min.css"/>" rel="stylesheet">
	
	<link rel="icon" type="image/png" href="<c:url value="/resources/images/favicon.ico"/>" >
</head>

<body id = "siteBody">		
	<div class = "navbar navbar-inverse navbar-static-top">
	  <div class = "container">
	  	<a href ="/ExcelFileParser/" class = "navbar-brand"><span class="customColor">Home</span></a>
	  </div>
	</div>
	
	<div class="move-down">
	<div class="parentImage">
			<img id="mainPic" src="<c:url value="/resources/images/header.jpg"/>" class="img-responsive" alt="Responsive image">
			<div class="childButtons">
	  			<form method="POST" action="results" enctype="multipart/form-data">
					<div class="row">
	      			<div class="fileinput fileinput-new" data-provides="fileinput">	      			
  	        		<span class="btn  btn-custom btn-file"><span class="fileinput-new"><span class="customText">Select File</span></span><span class="fileinput-exists">Change</span><input type="file" name="file"></span>
            		<span class="fileinput-filename"></span>
            		<a href="#" class="close fileinput-exists" data-dismiss="fileinput" style="float: none">&times;</a>
          			</div>
          			<span class="btn btn-custom btn-file">       			
            		<span class="customText">Submit</span>           		
          			<input type="submit" value="Upload"><br />
          			</span>
     				</div>
      			</form>
      		</div>
     </div>
     </div><br/>
     
	 <div class = "navbar navbar-inverse navbar-fixed-bottom">
	   <div class = "container ">
	     <p class = "navbar-text"><span class="customColor">Created by: &nbsp; <a href="http://www.william-mckinney.com"><span class="linkText">William McKinney</span></a> & <a href="http://www.shariqmohammad.com"><span class="linkText">Shariq Mohammad</span></a></span></p>
	   </div>
	 </div>
	
	<script type="text/javascript" src="<c:url value="/webjars/jquery/2.1.1/jquery.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/webjars/bootstrap/3.2.0/js/bootstrap.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/webjars/jasny-bootstrap/3.1.3/js/jasny-bootstrap.min.js" />"></script>			
</body>
</html>