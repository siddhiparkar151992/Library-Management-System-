<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Master.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<script src="https://code.jquery.com/jquery.js"></script>
<script src="js/searchBook.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min">
<link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="/css/bootstrap-responsive.css">
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-responsive.min">
<link rel="stylesheet" type="text/css" href="css/userbooksearch.css">
<link rel="stylesheet" type="text/css" href="css/duerequest.css">
<!-- <script type="text/javascript" src="WebContent/js/searchBook.js"></script> -->
<title>Insert title here</title>
<script type="text/javascript">
function showButtonName(x) {

	var table = x.parentNode.parentNode.parentNode;
	
	cells = table.getElementsByTagName('td');
	var textId = "hiddenText" + table.rowIndex;
	alert(textId);
	document.getElementById(textId).value = cells[1].innerText;
	
		document.forms["renewForm"].action="request?user_id="+cells[1].innerText;
	document.forms["renewForm"].submit();

}
</script>
</head>
<body>
	<form id="renewForm" method="post">
		<input type="hidden" name="searchOption" id="searchOption">
		<table>
		
			<tr class="info">

				<td class="info">Book Id</td>
				<td class="info">User Id</td>
				<td class="info">Check in</td>
				<td class="info">Check out</td>
				<td class="info">Status</td>
				<td class="info">Action</td>

			</tr>
			<tbody>
			<c:set var="count" value="0" />
			<c:forEach items="${datalist}" var="li">

				<tr>
					
					<c:forEach items="${li}" var="str">
						<td >${str}</td>


					</c:forEach>
					<c:set var="count" value="${count + 1}" />
					<td>
						<form method="post" id="reserveButtons">
							<button id="buttonReserve" type="button" onclick="showButtonName(this);" value="${count}"
								class="btn btn-default">Reserve</button>
							<input name="hiddenText" type="hidden" id="hiddenText${count}"
								value="${count}">
						</form>

					</td>
				</tr>

			</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>