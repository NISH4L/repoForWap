<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Thank you!</title>
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

<%--Assigning variables.--%>
<%
    String name = request.getParameter("forName");
    String gender = request.getParameter("forGender");
    String category = request.getParameter("forCat");
    String message = request.getParameter("forMes");

%>

<%--Container Start--%>
<div class="container" style="margin-top: 50px">

    <div class="card">
        <div class="card">
            <h2>Awesome! We got your message:</h2>
        </div>
        <div class="card-body">
            <h4 class="card-title">Name: <%=name%></h4>
            <br />
            <h5 class="card-subtitle mb-2 text-muted">Gender: <%=gender%></h5>
            <br />
            <h5 class="card-subtitle mb-2 text-muted">Category: <%=category%></h5>
            <br />
            <p class="card-text">Message: <%=message%></p>
            <br/>
            <br/>
            <p>Got more queries? <a href="contact" class="card-link">Contact Us</a></p>
        </div>
    </div>
</div>
</body>
<%--Container End--%>

</html>
