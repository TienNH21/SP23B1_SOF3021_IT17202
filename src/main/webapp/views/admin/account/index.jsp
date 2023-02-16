<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Account - Index</title>
<link rel="stylesheet" href="/css/bootstrap.min.css" >
</head>
<body>
	<div class="col-8 offset-2 mt-5">
		<div class="row">
			<div class="col-6">
				<a href="/account/create" class="btn btn-primary">Thêm mới</a>
			</div>
			<div class="col-6"></div>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Username</th>
					<th>Fullname</th>
					<th>Email</th>
					<th>Photo</th>
					<th>Status</th>
					<th>Role</th>
					<th colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ ds }" var="acc">
				<tr>
					<td>${ acc.id }</td>
					<td>${ acc.username }</td>
					<td>${ acc.fullname }</td>
					<td>${ acc.email }</td>
					<td>${ acc.photo }</td>
					<td>${ acc.activated == 1 ? "Active" : "Inactive" }</td>
					<td>${ acc.admin == 1 ? "Admin" : "Member" }</td>
					<td>
						<a class="btn btn-primary"
							href="/account/edit/${ acc.id }">
						Update
						</a>
					</td>
					<td>
						<a
							href="/account/delete/${ acc.id }" 
							class="btn btn-danger">
							Delete
						</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>