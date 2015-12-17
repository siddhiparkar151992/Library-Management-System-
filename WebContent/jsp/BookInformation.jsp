<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="Master.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!--  -->


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
</script>


<!--<script src="bootstrap/bootstrap.min.js"></script>
<link rel="stylesheet" href="/css/main.css"></link>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">  -->
<script>
	$('.dropdown-toggle').dropdown();
	function checkEmail() {

		var email = $('#InputName').val();
		var filter = /^[a-zA-Z\\s]+$/;

		if (!filter.test(email)) {
			alert('Please enter a valid name');
			return false;
		}

	}

	function checkNum() {

		var email = $('#inputnum').val();
		var filter = /[\\d{1,8}]+$/;

		if (!filter.test(email)) {
			alert('Please enter a valid Range');
			return false;
		}

	}

	function checkRange() {

		var email = $('#range').val();
		var filter = /\b(1|16)\b/;

		if (!filter.test(email)) {
			alert('Please enter a valid Number');
			return false;
		}

	}
</script>

<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<br>
	<form action="BookInfo" method="post">
		<!--<table align="center">  -->

		<div style="margin-left: 100px;"class="form-group">
		<div class="input-group">
			Date of Birth: <input type="text" id="datepicker"
				class="form-control" name="dobhjghjh"
				placeholder="Enter your Date of Birth">
				</div>
		</div>
		</table>

		<div class="container">
			<div class="row">
				<form role="form" class="form-horizontal">
					<div class="col-lg-6">
						

						<div class="form-group">
							<label for="InputName">Enter Book Title</label>
							<div class="form-group has-success has-feedback">
								<div class="input-group">
									<input onchange="checkEmail()" type="text" class="form-control"
										name="btitle" id="InputName" placeholder="Enter Name">
									<span class="input-group-addon"></span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="InputName">Enter Book Date oF publication</label>
							<div class="input-group">
								<input type="text" class="form-control" name="dopublication"
									value="bt" id="InputName" onchange="checkEmail()"
									placeholder="Enter Name"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>

						<div class="form-group">
							<label for="InputName">Enter Book Category</label>
							<div class="input-group">
								<input type="text" class="form-control" name="bcat" value="bt"
									id="InputName" onchange="checkEmail()" placeholder="Enter Name">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputName">Enter Book Edition</label>
							<div class="input-group">
								<input type="text" class="form-control" name="bedition"
									value="bt" id="range" onchange="checkRange()"
									placeholder="Enter Name"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						
						
						<div class="form-group">
							<label for="InputEmail">Enter Date of Publication </label>
							<div class="input-group">
								<input type="text" class="form-control" name="pdob"
									placeholder="Enter Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						
						<div class="form-group">
							<label for="InputName">Enter Book Price</label>
							<div class="input-group">
								<input type="text" class="form-control" name="price" value="bt"
									id="price" placeholder="Enter Name"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>

						<div class="form-group">
							<label for="InputEmail">Enter Isbn </label>
							<div class="input-group">
								<input type="text" class="form-control" name="bisbn"
									placeholder="Enter Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>

						<div class="form-group">
							<label for="InputEmail">Enter Author first name</label>
							<div class="input-group">
								<input type="text" id="InputName" onchange="checkEmail()"
									class="form-control" name="authfname" placeholder="Enter Email">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Author Middle name </label>
							<div class="input-group">
								<input type="text" id="InputName" onchange="checkEmail()"
									class="form-control" name="authmname" placeholder="Enter Email">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">EnterAuthor Last name</label>
							<div class="input-group">
								<input type="text" id="InputName" onchange="checkEmail()"
									class="form-control" name="authlname" placeholder="Enter Email">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Date of birth </label>
							<div class="input-group">
								<input id="datepicker" type="text" class="form-control"
									name="dateofbirth" placeholder="Enter Birthdate"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>



						<!--  <div class="form-group">
							<label for="InputEmail">Enter Gender</label>
							<div class="input-group">
								<input type="text" class="form-control" 
									name="authg" placeholder="Confirm Email" > <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>-->
						Gender <select name="gender" class="form-control">
							<option>--Select--</option>
							<option value="Female">Female</option>
							<option value="Male">Male</option>


						</select>
						<div class="form-group">
							<label for="InputEmail">Enter Address Line 1</label>
							<div class="input-group">
								<input type="text" id="InputName" onchange="checkEmail()"
									class="form-control" name="authad1" placeholder="Confirm Email">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Address Line 2</label>
							<div class="input-group">
								<input type="text" id="InputName" onchange="checkEmail()"
									class="form-control" name="authad2" placeholder="Confirm Email">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Street</label>
							<div class="input-group">
								<input type="text" id="InputName" onchange="checkEmail()"
									class="form-control" name="authstreet"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter City</label>
							<div class="input-group">
								<input type="text" class="form-control" rows="1" name="authcity"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Pincode</label>
							<div class="input-group">
								<input type="text" class="form-control" rows="1" id="inputnum"
									onchange="checkNum()" name="authpin" placeholder="Confirm Pin">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Country</label>
							<div class="input-group">
								<input type="text" name="authcountry" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>

						<div class="form-group">
							<label for="InputMessage">Enter State</label>
							<div class="input-group">
								<input type="text" name="authstate" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Contact</label>
							<div class="input-group">
								<input type="text" name="authcontact" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Email id1 </label>
							<div class="input-group">
								<input onchange="checkEmail()" type="text" name="authemail1"
									id="emailauth" class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Email id2</label>
							<div class="input-group">
								<input type="text" name="authemail2" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Phone Number 1</label>
							<div class="input-group">
								<textarea name="authpn1" id="InputMessage" class="form-control"
									rows="1"></textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Phone Number 2</label>
							<div class="input-group">
								<input type="text" name="authpn2" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>


						<div class="form-group">
							<label for="InputEmail">Enter Publisher first name</label>
							<div class="input-group">
								<input type="text" class="form-control" name="pname"
									placeholder="Enter Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>

						<div class="form-group">
							<label for="InputEmail">Enter Date of Foundation </label>
							<div class="input-group">
								<input type="text" class="form-control" name="pdateoff"
									placeholder="Enter Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>

						<div class="form-group">
							<label for="InputEmail">Enter Address Line 1</label>
							<div class="input-group">
								<input type="text" class="form-control" name="pad1"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Address Line 2</label>
							<div class="input-group">
								<input type="text" class="form-control" name="pad2"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Street</label>
							<div class="input-group">
								<input type="text" class="form-control" name="pstreet"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter City</label>
							<div class="input-group">
								<input type="text" class="form-control" rows="1" name="p"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputEmail">Enter Pincode</label>
							<div class="input-group">
								<input type="text" class="form-control" rows="1" name="ppin"
									placeholder="Confirm Email"> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Contact</label>
							<div class="input-group">
								<input type="text" name="pcontact" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Email id1 </label>
							<div class="input-group">
								<input type="text" name="pemail1" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Email id2</label>
							<div class="input-group">
								<input type="text" name="pemail2" id="InputMessage"
									class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Phone Number 1</label>
							<div class="input-group">
								<input type="text" name="pphn1" class="form-control" rows="1">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Phone Number 2</label>
							<div class="input-group">
								<input type="text" name="pphn2" class="form-control" rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label for="InputMessage">Enter Country</label>
							<div class="input-group">
								<input name="pcountry" id="InputMessage" class="form-control"
									rows="1">
								</textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>


						<button name="submit" value="Submit" type="submit"
							class="btn btn-info btn-lg">Submit</button>
						</br> </br> <br>
					</div>
				</form>
				<!--	<div class="col-lg-5 col-md-push-1">
					<div class="col-md-12">
						<div class="alert alert-success">
							<strong><span class="glyphicon glyphicon-ok"></span>
								Success! Message sent.</strong>
						</div>
						<div class="alert alert-danger">
							<span class="glyphicon glyphicon-remove"></span><strong>
								Error! Please check all page inputs.</strong>
						</div>
					</div>
				</div>-->
			</div>
		</div>
	</form>

</body>
</html>