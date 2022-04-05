<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<center>
		<h1>Addition Program</h1>
		<form action="ADD" method="post">
		<input
				type="submit" name="btnsubmit" value="+" /> <br> <br> <input
				type="submit" name="btnsubmit" value="-" /> <br> <br> <input
				type="submit" name="btnsubmit" value="*" /> <br> <br> <input
				type="submit" name="btnsubmit" value="/" /> <br>
		</form>
		<%
			if (request.getParameter("q") != null) {
				out.print("result is " + request.getParameter("q"));
			}
		%>
	</center>
	</form>
</body>
</html>