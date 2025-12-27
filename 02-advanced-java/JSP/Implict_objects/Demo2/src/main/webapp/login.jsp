<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--     <% 
        // Getting the value of "username" sent from HTML form / URL
        String un = request.getParameter("username");

        // Getting the value of "password" sent from HTML form / URL
        String pw = request.getParameter("password");

        /*
         * This statement would print the username and password on the browser.
         * out.println(un + ", Your Password is " + pw);
         */
    %>

    <!-- 
        Expression tag <%= %>
        is used to directly print the value to the browser.
        It is shorter than writing out.println().
    -->
    <%= un + " Your password is (printed by expression tag) " + pw %> --%>

	<%-- <h1>${ sessionScope.username } Your Password is ${ sessionScope.password}</h1>
 --%>




	<h1>Your Details</h1>
	${ param.name }
	
	${ param.lastname }








</body>
</html>
