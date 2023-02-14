<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello IT17202</h1>
	<form method="GET" action="/hello">
		<label>Họ tên</label>
		<input type="text" name="ho_ten" />
		<button>Submit</button>
	</form>
</body>
</html>