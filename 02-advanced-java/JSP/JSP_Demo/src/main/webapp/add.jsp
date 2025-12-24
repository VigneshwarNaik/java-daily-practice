<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
Page directive:
- language="java" → JSP uses Java
- contentType → response type
-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add JSP</title>
</head>
<body>

<%!
    /*
    Declaration tag:
    Used to declare variables and methods
    These become part of servlet class
    */
    int a = 100;
    int b = 200;

    public int add() {
        return a + b;
    }
%>

<%
    /*
    Scriptlet tag:
    Used to write Java code
    Executed when JSP runs
    */
    out.println("This is by JSP: " + add());
%>

</body>
</html>
