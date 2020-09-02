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
<h2>회원 가입 양식</h2>
<form action="MProc2" method="post">
<table width=400 border=1>
<tr height=40>
	<td width=150 align="center"><input type="text" name="id"  placeholder="아이디 : "></td>
</tr>
<tr height=40>
	<td width=150 align="center"><input type="password" name="password"  placeholder="패스워드 : "></td>
</tr>
<tr height=40>
	<td width=150 align="center"><input type="email" name="emil"  placeholder="이메일 : "></td>
</tr>
<tr height=40>
	<td width=150 align="center"><input type="tel" name="tel"  placeholder="전화 : "></td>
</tr>
<tr height=40>
	<td width=150 align="center"><input type="text" name="address"  placeholder="주소 : "></td>
</tr>
<tr height=40>
	<td width=150 align="center"><input type="submit" value="회원가입"></td>
</tr>
</table>
</form>
</center>
</body>
</html>