<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="Master.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="file.js"></script>
<script>
	function doc(id) {
		return document.getElementById(id);
	}
	function buildCounty() {
		var opts = doc('county').options;
		for (var i = 0; i < arr.length; i++) {
			opts[opts.length] = new Option(arr[i][0], arr[i][0]);
		}
		doc('county').onchange = function() {
			this.blur();
			var val = this.value;
			if (!val) {
				return;
			}
			var co = doc('city').options;
			co.length = 1;
			for (var j = 0; j < arr.length; j++) {
				if (arr[j][0] !== val) {
					continue;
				} else {
					var temp = arr[j][1];
					for (var k = 0; k < temp.length; k++) {
						co[co.length] = new Option(temp[k], temp[k]);
					}
					break;
				}
			}
		}
	}

	window.onload = buildCounty;
</script>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="styleSheet.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<script src="https://code.jquery.com/jquery.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="/js/dateofbirth.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/dateofbirth.css">
<link
	href="/vendor/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet" />
<script src="//oss.maxcdn.com/momentjs/2.8.2/moment.min.js"></script>
<script
	src="/vendor/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
	$(function() {
		$("#datepicker").datepicker();
	});

	$(function() {
		$("#mem").datepicker();
	});

	$(function() {
		$("#exp").datepicker();
	});
</script>
</head>

<br>
<br>

<body>
	<form action="user" method="post">
		<div class="container">
			<div class="row">

				<div class="col-lg-6">
					<div class="well well-sm">
						<strong><span class="glyphicon glyphicon-asterisk"></span>Required
							Field</strong>
					</div>
					<div class="form-group">
						<label for="InputName">Enter User First Name</label>
						<div class="input-group">
							<input type="text" class="form-control" name="fname"
								id="InputName" placeholder="Enter Name"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>

					<div class="form-group">
						<label for="InputName">Enter User Middle Name</label>
						<div class="input-group">
							<input type="text" class="form-control" name="mname"
								id="InputName" placeholder="Enter Name"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>


					<div class="form-group">
						<label for="InputEmail">Enter Last name</label>
						<div class="input-group">
							<input type="text" class="form-control" name="lname"
								placeholder="Enter Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>

					<div class="form-group">
						<div class="input-group">
							<tr>
								<td><br> <strong>Date of Birth:</strong></td>
								<td><br> <input style="z-index: 100000" type="text"
									id="datepicker" class="form-control" name="dateofbirth"
									placeholder="Enter your Date of Birth"></td>
							</tr>
						</div>
					</div>
					<strong>Select Gender </strong>strong><select name="gender"
						class="form-control">
						<option>--Select--</option>
						<option value="Female">Female</option>
						<option value="Male">Male</option>


					</select>
					<div class="form-group">
						<label for="InputEmail">Enter Email Id 1 </label>
						<div class="input-group">
							<input type="text" class="form-control" name="email"
								placeholder="Enter Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="InputEmail">Enter Email Id2 </label>
						<div class="input-group">
							<input type="text" class="form-control" name="email2"
								placeholder="Enter Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="InputEmail">Enter phone Number1 </label>
						<div class="input-group">
							<input type="text" class="form-control" name="ph1"
								placeholder="Enter Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="InputEmail">Enter phone Number2 </label>
						<div class="input-group">
							<input type="text" class="form-control" name="ph2"
								placeholder="Enter Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>

					<div class="form-group">
						<label for="InputEmail">Enter Address Line 1</label>
						<div class="input-group">
							<input type="text" class="form-control" name="add1"
								placeholder="Confirm Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="InputEmail">Enter Address Line 2</label>
						<div class="input-group">
							<input type="text" class="form-control" name="add2"
								placeholder="Confirm Email"> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>

					<table align="center" cellspacing="3" cellpadding="3">
						<tr>
							<td>County Name:</td>
							<td><select name="country" id="county"><option
										value="india">Select county</option>
									<option value="">india</option></select></td>
						</tr>
						<tr>
							<td>City:</td>
							<td><select name="city" id="city"><option value="">Select
										city</option>
									<option value="maharashtra">maharashtra</option></select></td>
						</tr>
						<tr>
							<td>City:</td>
							<td><select name="state" id="city"><option value="">Select
										city</option>
									<option value="maharashtra">maharashtra</option></select></td>
						</tr>
					</table>


					<div>
						<div class="form-group">
							<label for="InputEmail">Enter Pincode</label>
							<div class="input-group">
								<input type="text" class="form-control" name="pin"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>



						<div class="input-group">
							<table>
								<tr>
									<td><br> <strong>Date Membership:</strong></td>
									<td><br> <input type="text" id="mem"
										class="form-control" name="memdate"
										placeholder="Enter your Date of Birth"></td>
								</tr>
							</table>
						</div>


						<div class="input-group">
							<table>
								<tr>
									<td><br> <strong>Select Expiry date</strong></td>
									<td><br> <input type="text" id="exp"
										class="form-control" name="expdate"
										placeholder="Enter your Date of Birth"></td>
								</tr>
							</table>
						</div>


						<strong>Select Security Question </strong>strong><select
							name="question" class="form-control">

							<option value="pet">What is your favourite pet?</option>
							<option value="food">What is your favourite food?</option>
							<option value="color">What is your favourite color?</option>


						</select> <br> <br> 
						
						
						<div>
						<div class="form-group">
							<label for="InputEmail">Enter Answer</label>
							<div class="input-group">
								<input type="text" class="form-control" name="answer"
									> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="input-group">
							<table>
								<tr>
									<td><br> <strong>Date Membership:</strong></td>
									<td><br> <input type="text" id="mem"
										class="form-control" name="memdate"
										placeholder="Enter your Date of Birth"></td>
								</tr>
							</table>
						</div>
						
						<input type="submit" name="submit"
							id="submit" value="Submit" class="btn btn-info pull-right">
						<br> <br> <br>
					</div>

				</div>


			</div>
		</div>
	</form>
</body>
</html>