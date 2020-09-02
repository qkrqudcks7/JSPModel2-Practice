<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>로그인</h2>
<form action="LoginProc.do" method="post">
<table width=300 border=1>
<tr height=40>
	<td width=300 align="center"><input type="text" name="id" placeholder="아이디 : "></td>
</tr>
<tr height=40>
	<td width=300 align="center"><input type="password" name="password" placeholder="비밀번호 : "></td>
</tr>

<tr height=40>
	<td width=300 align="center"><input type="submit" value="로그인"></td>
</tr>
</table>
</form>
</center>
</body>
</html>