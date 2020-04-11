package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Thankyou", urlPatterns = {"/thanks"})
public class Thankyou extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("forName");
        String gender = request.getParameter("forGender");
        String category = request.getParameter("forCat");
        String message = request.getParameter("forMes");
        response.setContentType("text/html");
        response.getWriter().println(thankyouGenerator(name, gender, category, message));
    }


    private String thankyouGenerator(String name, String gender, String category, String message){
        //Header Elements
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>");
        sb.append("<html lang='en'>");
        sb.append("<head>");
        sb.append("<meta charset='UTF-8'>");
        sb.append("<title>Simple Contact Form</title>");
        sb.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<header>");
        sb.append("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">");
        sb.append("<a class=\"navbar-brand\" href=\"#\">Home - Servlet</a>");
        sb.append("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
        sb.append("<span class=\"navbar-toggler-icon\"></span>");
        sb.append("</button>");
        sb.append("<div class=\"collapse navbar-collapse\" id=\"navbarColor01\">");
        sb.append("<ul class=\"navbar-nav mr-auto\">");
        sb.append("<li class=\"nav-item active\">");
        sb.append("<a class=\"nav-link\" href=\"/\">Home <span class=\"sr-only\">(current)</span></a>");
        sb.append("</li>");
        sb.append("<li class=\"nav-item\">");
        sb.append("<a class=\"nav-link\" href=\"/contact\">Contact Us</a>");
        sb.append("</li>");
        sb.append("</ul>");
        sb.append("<button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Login</button> &nbsp; &nbsp;");
        sb.append("&nbsp; &nbsp; <button class=\"btn btn-secondary my-2 my-sm-1\" type=\"submit\">SignUp</button> &nbsp; &nbsp;");
        sb.append("</div>");
        sb.append("</nav>");
        sb.append("</header>");

        //Body
        sb.append("<p>");
        sb.append("<br/>");
        sb.append("<div class=\"card\">");
        sb.append("<div class=\"card\">");
        sb.append("<h2>Awesome! We got your message:</h2>");
        sb.append("</div>");
        sb.append("<div class=\"card-body\">");
        sb.append("<h4 class=\"card-title\">Name: " + name + "</h4><br/>");
        sb.append("<h5 class=\"card-subtitle mb-2 text-muted\">Gender: " + gender + "</h5><br/>");
        sb.append("<h5 class=\"card-subtitle mb-2 text-muted\">Category: " + category + "</h4><br/>");
        sb.append("<p class=\"card-text\">Message: " + message + "</p><br/><br/>");
        sb.append("<p>Got more queries? <a href=\"contact\" class=\"card-link\">Contact Us</a></p>");
        sb.append("</div>");
        sb.append("</div>");
        sb.append("</p>");

        return sb.toString();

    }
}
