<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=null;
Cookie[] cookies=request.getCookies();
if(cookies!=null)
{
	for(Cookie cookie:cookies)
	{
		if(cookie.getName().equals("user"))
		{
			username=cookie.getValue();
		}
	}
}
if(username==null)
{
	response.sendRedirect("Loginpage");
}
%>
<h3>Welcome <%=username %></h3>
You Have Successfully logged in 
<form action="profile" method="post">
<button type="submit">Log Out</button>
</form>

</body>
</html>