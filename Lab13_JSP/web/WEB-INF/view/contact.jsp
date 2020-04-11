<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Contact</title>
</head>

<body>

<%--Header Start--%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="#">Home - JSP</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ">
                <a class="nav-link" href="index.jsp">Home </a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="#">Contact Us <span class="sr-only">(current)</span></a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <button class="btn btn-secondary my-2 my-sm-0" type="submit">Login</button> &nbsp; &nbsp;
            &nbsp; &nbsp; <button class="btn btn-secondary my-2 my-sm-1" type="submit">SignUp</button> &nbsp; &nbsp;
        </form>
    </div>
</nav>
<%--Header End--%>

<%--Container Start--%>
<div class="container" style="margin-top: 50px">

    <h1> Customer Contact Form</h1>
    <form action="process" method="post">
        <div> ${error}</div>
        <div class="form-group">
            <label for="forName">*Name:</label>
            <input type="text" class="form-control" name="forName" id="forName" placeholder="e.g. John Smith">
            <span style="font-size: 8pt">Enter your full name</span>
        </div>
        <label> *Gender: </label><br>
        <div class="form-group form-check-inline">

            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio"  id="forGenderMale" name="forGender" value="Male">
                <label class="form-check-label" for="forGenderMale" name="forGender">Male</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" id="forGenderFemale" value="Male" name="forGender">
                <label class="form-check-label" for="forGenderFemale" name="forGender">Female</label>
            </div>
        </div>
        <div class="form-group">
            <label for="forCat">*Category:</label>
            <select class="form-control" name="forCat" id="forCat">
                <option value="" disabled selected hidden>Select..</option>
                <option>FeedBack</option>
                <option>Inquiry</option>
                <option>Complaint</option>

            </select>
        </div>

        <div class="form-group">
            <label for="forMes">*Message</label>
            <textarea class="form-control" id="forMes" rows="3" name="forMes"></textarea>
        </div>
        <div class="form-group">
            <button style="width: 100%" type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form>
</div>
<%--Container End--%>

</body>
</html>
