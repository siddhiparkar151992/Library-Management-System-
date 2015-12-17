<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
      <%@ include file="Profile.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/userbookrequestsearch.css">
<title>Insert title here</title>
</head>
<body>
<div id="userBookRequest" class="container">
<table id="bookTable" class="table table-bordered">

			<tr class="info">
				
				<td class="info">Book Title</td>
				<td class="info">Check in</td>
				<td class="info">Check out</td>
				<td class="info">Status</td>
				<td class="info">Action</td>
				
			</tr>
			<tbody>
				<c:set var="count" value="0" />
				<c:forEach items="${BookRequestSet}" var="li">

					<tr>

						<c:forEach items="${li}" var="str">
							<td>${str}</td>


						</c:forEach>

						<c:set var="count" value="${count + 1}" />
						<td>
							<form method="post" id="renewRequestButtons">
								<button id="RenewRequest" type="button"
									onclick="showButtonName(this);" value="${count}"
									class="btn btn-default">Renew</button>
								<input name="requestIdHiddenText" type="hidden" id="requestIdhiddenText${count}"
									value="${count}">
							</form>
						</td>


					</tr>

				</c:forEach>
			</tbody>
		</table>
</div>
</body>
</html>