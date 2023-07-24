<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    <body>

        <h1>You have registered successfully...!</h1>

        <h2>Welcome ${name}</h2>
        <h2>Your email : ${email}</h2>
        <h2>Your password : ${password}</h2>

        <h1>${title}</h1>

        <h2>Welcome ${user.name}</h2>
        <h2>Welcome ${user.email}</h2>
        <h2>Welcome ${user.password}</h2>

    </body>
</html>
