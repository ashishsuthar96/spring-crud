<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<h1 class="text-center mb-3">Welcome to Crud App</h1>
			<table class="table table-dark">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Age</th>
						<th scope="col">City</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${user }" var="p">
						<tr>
						
							<th scope="row">USER${p.id }</th>
							<td>${p.name }</td>
							<td>${p.age }</td>
							<td>${p.city }</td>
							<td><a href="delete/${p.id}"><i
									class="fas fa-trash text-danger"></i></a> <a href="update/${p.id}"><i
									class="fas fa-pen-nib text-primary"></i></a></td>
									

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="container text-center mt-3">
				<a href="add" class="btn btn-outline-success">Add User</a>
			</div>
		</div>
	</div>
</body>
</html>