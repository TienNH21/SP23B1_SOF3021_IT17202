<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello, ${ data.ho_ten }</h1>
	<form action="/dang-ky" method="POST">
		<div>
			<label>Họ tên</label>
			<input type="text" name="ho_ten" />
		</div>
		<div>
			<label>Năm sinh</label>
			<input type="text" name="nam_sinh" />
		</div>
		<div>
			<label>Địa chỉ</label>
			<input type="text" name="dia_chi" />
		</div>
		<div>
			<label>Chuyên ngành</label>
			<input type="text" name="chuyen_nganh" />
		</div>
		<button>Submit</button>
	</form>
</body>
</html>