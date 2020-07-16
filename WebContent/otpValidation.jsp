<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String ano=request.getAttribute("ano").toString();
String otp=request.getAttribute("otp").toString();
%>
<body>
OTP validate page
	<form action="validateOtpServlet" method="post">
	<label for="otp"> enter OTP : </label>
		<input required title="please enter valid OTP"  type="accno" placeholder="123456" name="userotp" class="form-control"  id="otp" ><br>
	<input type="submit" class="btn btn-primary" value="Validate" id="validate" onclick="success()">
	<input type="hidden" name="ano" value=<%=ano%>>
	<input type="hidden" name="otp" value=<%=otp%>>
	</form>
</body>
</html>