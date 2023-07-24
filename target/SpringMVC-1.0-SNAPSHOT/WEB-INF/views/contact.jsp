<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            String name = (String) request.getAttribute("name");
            String number = (String) request.getAttribute("contact");
        %>

        <h2>My name is:  <%= name%></h2>
        <h2>My name contact number is:  <%= number%></h2>
    </body>
</html>
