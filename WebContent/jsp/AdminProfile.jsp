<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Master.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="WebContent/bootstrap/bootstrap.css"></script>
<script type="text/javascript" src="WebContent/bootstrap/bootstrap.min.css"></script>
</head>
<body>

	
	<form action="admin" method="post">


<br>
<br>
		<button name="profile" value="user" type="submit"
			class="btn btn-info btn-lg">Add User Record</button>
			
			<button name="profile" value="logout" type="submit"
			class="btn btn-info btn-lg">logout</button>
		<!--<input name="addbook" value="book" type="submit">-->


	</form>
</body>
</html>