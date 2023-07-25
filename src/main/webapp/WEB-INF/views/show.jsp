<!--JSTL uri-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Show Page</title>
    </head>
    <body>

        <div class="container my-5">

            <div class="row my-5">

                <div class="col-md-6 offset-md-3">

                    <div class="card">

                        <div class="card-body">
                            <!--showing form data-->
                            <h1 class="text-success"> Hello! ${student.name} welcome to my page....!</h1>
                            <h2>Your Id is : ${student.id}</h2>
                            <h3>Your Date of Birth : ${student.dob}</h3>
                            <h3>You have selected : <c:forEach var="i" items="${student.course}"><span>${i}, </span></c:forEach> subjects.</h3>
                            <h3>Your gender : ${student.gender}</h3>
                            <h3>You are a ${student.type} student.</h3>
                            <h4 class="text-warning">Thank You..!</h4>

                        </div>

                    </div>

                </div>

            </div>

        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>