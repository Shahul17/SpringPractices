<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/MavenSpringLoginRegister/registerprocess" method=post>
	     <lable>FullName</lable>:<input type="text" name="FullName"/><br/>
	     <lable>Email</lable>:<input type="text" name="email"/><br/>
	     <lable>Username</lable>:<input type="text" name="username"/><br/>
	     <lable>Password</lable>:<input type="text" name="password"/><br/>
	     <input type="submit" value="Register"/>
	</form>
</body>
</html>