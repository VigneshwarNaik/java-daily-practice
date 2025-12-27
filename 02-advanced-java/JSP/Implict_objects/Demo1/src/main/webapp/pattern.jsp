<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
	<% 
	int num=Integer.parseInt(request.getParameter("number"));
	
	response.getWriter();
	
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			%>
			<%= "* "  %>
		
		<%}
		out.println("<br>");
	}
	
	%>
</body>
</html>