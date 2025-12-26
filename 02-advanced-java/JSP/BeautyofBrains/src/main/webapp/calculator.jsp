<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator JSP</title>
</head>
<body>

<%! 
    int add(int a,int b){ return a+b; }
    int sub(int a,int b){ return a-b; }
    int mul(int a,int b){ return a*b; }
    int div(int a,int b){ return a/b; }
%>

<h1 style="color:red;">
    <%= add(5,5) %>
</h1>

<h1 style="color:yellow;">
    <%= sub(10,5) %>
</h1>

<h1 style="color:blue;">
    <%= mul(5,5) %>
</h1>

<h1 style="color:green;">
    <%= div(20,5) %>
</h1>

<script>
		alert("Hey , Are you loving JSP?");
</script>

</body>
</html>
