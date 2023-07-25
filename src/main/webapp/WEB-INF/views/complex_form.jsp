<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Complex Form</title>
    </head>
    <body style="background: #e0e0e0;">

        <div class="container mt-4">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-body">

                            <div class="text-center">
                                <h3 class="text-uppercase">Complex form</h3>
                            </div>

                            <form action="register" method="post">

                                <div class="form-group">
                                    <label for="name">User name</label>
                                    <input type="text" name="name" class="form-control" id="name" placeholder="Enter name">
                                </div>

                                <div class="form-group">
                                    <label for="id">User Id</label>
                                    <input type="text" name="id" class="form-control" id="id" placeholder="Enter user id">
                                </div>

                                <div class="form-group">
                                    <label for="dob">Date of Birth</label>
                                    <input type="text" name="dob" class="form-control" id="dob" placeholder="dd/mm/yyyy">
                                </div>

                                <div class="form-group">
                                    <label for="course">Courses</label>
                                    <select multiple name="course" id="course" class="form-control">
                                        <!--<option selected disabled>--Select Courses--</option>-->
                                        <option value="python">Python</option>
                                        <option value="java">Java</option>
                                        <option value="c++">C++</option>
                                        <option value="spring">Spring</option>
                                        <option value="dbms">DBMS</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <span for="gender">Select gender:</span>
                                    <input class="ml-5" type="radio" name="gender" value="male" id="m"> <label for="m">Male</label>
                                    <input class="ml-5" type="radio" name="gender" value="female" id="f"> <label for="f">Female</label>
                                </div>

                                <div class="form-group">
                                    <label for="type">Select Type</label>
                                    <select name="type" id="type" class="form-control">
                                        <option selected disabled>--Select Student Type--</option>
                                        <option value="old">Old Student</option>
                                        <option value="present">Present Student</option>
                                    </select>
                                </div>

                                <div class="text-center">
                                    <button type="submit" class="btn btn-success">Submit</button>
                                </div>  
                            </form>

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