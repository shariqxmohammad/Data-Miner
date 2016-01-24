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
	</div><br/>
	
	<div class="container">
	  <img src="<c:url value="/resources/images/error.jpg"/>" class="img-responsive" alt="Responsive image"> <br/><br/>
	  <span class="errorText">The file you entered should be an Excel spreadsheet saved as a .xlsx file. Our web application 
	  				          is intended to support data from Excel 2007 OOXML (.xlsx) or a later version.</span>
	</div>
	
	<div class = "navbar navbar-inverse navbar-fixed-bottom">
	  <div class = "container">
	    <p class = "navbar-text"><span class="customColor">Created by: &nbsp;<a href="http://www.william-mckinney.com"><span class="linkText">William McKinney</span></a> & <a href="http://www.shariqmohammad.com"><span class="linkText">Shariq Mohammad</span></a></span></p>
	  </div>
	</div>
	
	<script type="text/javascript" src="<c:url value="/webjars/jquery/2.1.1/jquery.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/webjars/bootstrap/3.2.0/js/bootstrap.min.js" />"></script>		
</body>
</html>