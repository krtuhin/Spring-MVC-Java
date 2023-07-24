<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Help Page</title>
    </head>
    <body>
        <h1>This is help page...!</h1>

        <!--fetch data from model and view object-->
        <%
            String name = (String) request.getAttribute("name");
            LocalDateTime time = (LocalDateTime) request.getAttribute("time");
        %>

        <h3>Hello I am <%= name%></h3>
        <h2>Now time is: <%= time.toString() %></h2>
    </body>
</html>
