<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PNR Status</title>
</head>
<body>

	  <!--header -->
		  <div class="container">
	<div class="row">
		<h2 style="color:blue;">Centre For Railway Information Systems </h2>
	</div>
</div>

  
	<center>
		<h1>Your PNR NO. is <s:property value="pdd.user_pnr"/></h1>
		<h1>Your Date of Birth is<s:property value="pdd.dob"/></h1>
		<h1>Name<s:property value="name"/></h1>
	</center>
</body>
</html>