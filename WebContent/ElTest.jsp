<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int i=3;
	out.println("i="+i);
	request.setAttribute("ia", 3);// 다이렉트로 i=3하면 안나오고 setattribute 써야 됨
%>
<p>i=<%=i %></p>

<p>i=${ia }</p>

<p>i=${ia+4 }</p>
<p>i=${ia>4 }</p> <!-- 연산자 가능 -->
</body>
</html>