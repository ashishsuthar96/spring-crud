<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Add User</h1>
				<form action="adduser" method="post">
					<div class="form-group">
						<label for="username">Name</label> <input type="text"
							class="form-control" id="username" placeholder="Enter your name"
							name="name">
					</div>
					<div class="form-group">
						<label for="age">Age</label> <input type="number"
							class="form-control" id="age" placeholder="Enter your age"
							name="age">
					</div>
					<div class="form-group">
						<label for="city">City</label> <input type="text"
							class="form-control" id="city" placeholder="Enter your city"
							name="city">
					</div>

					

					<div class="container text-center mt-3">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-outline-success">Add</button>

					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>