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
	<h1>Hello, ${ data.ho_ten }</h1>
	<sf:form action="/dang-ky" method="POST"
		modelAttribute="data">
		<div>
			<label>Họ tên</label>
			<sf:input type="text" name="ho_ten" path="ho_ten" />
			<div style="color: red;">
				<sf:errors path="ho_ten" element="span"></sf:errors>
			</div>
		</div>
		<div>
			<label>Năm sinh</label>
			<sf:input type="text" name="nam_sinh" path="nam_sinh" />
		</div>
		<div>
			<label>Địa chỉ</label>
			<sf:input type="text" name="dia_chi" path="dia_chi" />
		</div>
		<div>
			<label>Chuyên ngành</label>
			<sf:input type="text" name="chuyen_nganh" path="chuyen_nganh" />
		</div>
		<button>Submit</button>
	</sf:form>
</body>
</html>