<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/css/bootstrap.min.css" >
</head>
<body>
	<div class="col-8 offset-2 mt-5">
		<sf:form modelAttribute="data" action="/account/store">
			<div>
				<label>Họ tên</label>
				<sf:input path="fullname" class="form-control" />
			</div>
			<div>
				<label>Username</label>
				<sf:input path="username" class="form-control" />
			</div>
			<div>
				<label>Email</label>
				<sf:input path="email" class="form-control" />
			</div>
			<div>
				<label>Password</label>
				<sf:password path="password" class="form-control" />
			</div>
			<div>
				<label>Photo</label>
				<sf:input path="photo" class="form-control" />
			</div>
			<div>
				<label>Activated</label>
				<sf:radiobutton path="activated" value="1" class="form-check-inline" />
				<label>True</label>
				<sf:radiobutton path="activated" value="0" class="form-check-inline" />
				<label>False</label>
			</div>
			<div>
				<label>Admin</label>
				<sf:radiobutton path="admin" value="1" class="form-check-inline" />
				<label>True</label>
				<sf:radiobutton path="admin" value="0" class="form-check-inline" />
				<label>False</label>
			</div>
			<div>
				<button class="btn btn-primary">Create</button>
				<a class="btn btn-danger" href="/account/index">Cancel</a>
			</div>
		</sf:form>
	</div>
</body>
</html>