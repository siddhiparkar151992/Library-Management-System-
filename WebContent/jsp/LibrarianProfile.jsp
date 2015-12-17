<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="Master.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian</title>
</head>
<body>
	</br>
	</br>
	</br>
	<form action="librarian" method="post">

 <input id="addRecordButton" name="librarian" value="Add Book Record" type="submit"
			class="btn btn-info btn-lg"/>
	
		<input id="showRecordButton" name="librarian" value="Show Book Record" type="submit"
			class="btn btn-info btn-lg"/>
		
		<input id="showRequestButton" name="librarian" value="Show requests" type="submit"
			class="btn btn-info btn-lg"/>
		
		<input id="logoutButton" class="btn btn-info btn-lg" name="logoutButton" value="Logout" type="submit"/>
			

	</form>
</body>
</html>