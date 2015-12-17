<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="Master.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<br>
	<br>
	<form action="AdminLogin" method="post">



		Enter Username<input type="text" name="name"></br> Enter Password<input
			type="password" name="pass"></br>
		<button value="submit" name="submit" type="submit">submit</button>
	</form>

</body>
</html>