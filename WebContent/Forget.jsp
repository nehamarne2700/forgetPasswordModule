<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

	function nospace(x)
	{
		if(x.keyCode == 32)
			{
			alert("No Space Allowed");
			return false;
			}
		return true;
	}
</script>

</head>
<body>
	Forget page
	<form action="forgetPasswordServlet" method="post">
	<label for="accno"> enter Account No : </label>
		<input required title="please enter valid Account no"  type="accno" placeholder="Account no" name="accno" class="form-control"  id="accno" ><br>
	<label for="email"> enter Email : </label>
		<input required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="please enter valid Email" type="email" placeholder="Email ID" name="email" class="form-control"  id="email" onkeydown="return nospace(event)"><br>
	
	<input type="submit" class="btn btn-primary" value="Submit" id="submit1" onclick="success()">
	</form>
</body>
</html>