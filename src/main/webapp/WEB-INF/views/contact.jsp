<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--by default it remain true, so it ignores the expression language-->
<%@page isELIgnored="false" %>

<!--JSTL uri-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Page</title>
    </head>
    <body>
        <h1>Hello this is contact page....</h1>

        <!--fetch data from model's attribute-->
        <%
//            String name = (String) request.getAttribute("name");
//            String number = (String) request.getAttribute("contact");
        %>

        <!--show values using expression language-->
        <h2>My name is: ${name}</h2>
        <h2>My name contact number is: ${contact}</h2>
        <h2>My friends are: ${friends}</h2>

        <!--traverse loop using JSTL-->
        <c:forEach items="#{friends}" var="fd">

            <h2>${fd}</h2>

        </c:forEach>
    </body>
</html>
