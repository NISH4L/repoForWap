package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Contact", urlPatterns = {"/contact"})
public class Contact extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //response.getWriter().println("<h1>contact page is showing up</h1>");
        String form = this.contactForm(request, response);
        PrintWriter out = response.getWriter();
        out.println(form);
    }

    protected String contactForm(HttpServletRequest request, HttpServletResponse response){
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>");
        sb.append("<html lang='en'>");
        sb.append("<head>");
        sb.append("    <meta charset='UTF-8'>");
        sb.append("<title>Simple Contact Form</title>");
        sb.append("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
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
        sb.append("<a class=\"nav-link\" href=\"#\">Contact Us</a>");
        sb.append("</li>");
        sb.append("</ul>");
        sb.append("<button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Login</button> &nbsp; &nbsp;");
        sb.append("&nbsp; &nbsp; <button class=\"btn btn-secondary my-2 my-sm-1\" type=\"submit\">SignUp</button> &nbsp; &nbsp;");
        sb.append("</div>");
        sb.append("</nav>");
        sb.append("</header>");



        sb.append("<div class=\"container\">");
        sb.append("<form id=\"formCustomerContact\" method=\"post\" action=\"processing\">");
        sb.append("<fieldset>");
        sb.append("<legend>Customer Contact Form</legend>");

        // First check if the error message exists
        Object objCheckError = request.getAttribute("errorMsg");
        if(objCheckError != null) {
            String errorMsg = (String) objCheckError;
            sb.append("<div><p>");
            sb.append(errorMsg);
            sb.append("</p></div>");
        }

        // read and write existing values
        String forName = request.getParameter("forName");
        String forGender  = request.getParameter("forGender");
        String forCat = request.getParameter("forCat");
        String forMes = request.getParameter("forMes");

        sb.append("<div class=\"form-group\">");
        sb.append("<label for=\"forName\">*Name:</label>");
        if(forName != null) {
            if(forName.equals("")) {
                sb.append("<input type=\"text\" class=\"form-control\" id=\"forName\" name=\"forName\" aria-describedby=\"forNameHelp\" placeholder=\"John H. Smith\" title=\"Enter your full name.\" >");
            } else {
                sb.append("<input type=\"text\" class=\"form-control\" id=\"forName\" name=\"forName\" aria-describedby=\"forNameHelp\" placeholder=\"John H. Smith\" title=\"Enter your full name.\" value=\'" + forName + "'>");
            }
        } else {
            sb.append("<input type=\"text\" class=\"form-control\" id=\"forName\" name=\"forName\" aria-describedby=\"forNameHelp\" placeholder=\"John H. Smith\" title=\"Enter your full name\" >");
        }
        sb.append("<small id=\"forNameHelp\" class=\"form-text text-muted\">Enter your full name.</small>");
        sb.append("</div>");

        //Gender Radio
        sb.append("<label>*Gender:</label><br/>");
        sb.append("<label class=\"custom-control custom-radio\">");
        sb.append("  <input id=\"forGenderMale\" name=\"forGender\" type=\"radio\" class=\"custom-control-input\" value='male'");
        if(forGender != null) {
            if(forGender.equals("male")) {
                sb.append(" checked>");
            }
            else {
                sb.append(">");
            }
        } else {
            sb.append("  <input id=\"forGenderMale\" name=\"forGender\" type=\"radio\" class=\"custom-control-input\" value='male'>");
        }
        sb.append("  <span class=\"custom-control-indicator\"></span>");
        sb.append("  <span class=\"custom-control-description\">Male</span>");
        sb.append("</label>");
        sb.append("<label class=\"custom-control custom-radio\">");
        sb.append("  <input id=\"forGenderFemale\" name=\"forGender\" type=\"radio\" class=\"custom-control-input\" value='female'");
        if(forGender != null) {
            if(forGender.equals("female")) {
                sb.append(" checked>");
            } else {
                sb.append(">");
            }
        } else {
            sb.append("  <input id=\"forGenderFemale\" name=\"forGender\" type=\"radio\" class=\"custom-control-input\" value='female'>");
        }
        sb.append("  <span class=\"custom-control-indicator\"></span>");
        sb.append("  <span class=\"custom-control-description\">Female</span>");
        sb.append("</label>");

        sb.append("  <div class=\"form-group\">");
        sb.append("    <label for=\"forCat\">*Category:</label>");
        sb.append("    <select class=\"form-control\" id=\"forCat\" name=\"forCat\">");
        if(forCat == null) {
            sb.append("      <option value=\"null\">Select..</option>");
            sb.append("      <option value=\"feedback\">Feedback</option>");
            sb.append("      <option value=\"inquiry\">Inquiry</option>");
            sb.append("      <option value=\"complaint\">Complaint</option>");
        } else {
            switch (forCat) {
                case "null":
                    sb.append("      <option selected value=\"null\">Select...</option>");
                    sb.append("      <option value=\"feedback\">Feedback</option>");
                    sb.append("      <option value=\"inquiry\">Inquiry</option>");
                    sb.append("      <option value=\"complaint\">Complaint</option>");
                    break;
                case "feedback":
                    sb.append("      <option value=\"null\">Select...</option>");
                    sb.append("      <option selected value=\"feedback\">Feedback</option>");
                    sb.append("      <option value=\"inquiry\">Inquiry</option>");
                    sb.append("      <option value=\"complaint\">Complaint</option>");
                    break;
                case "inquiry":
                    sb.append("      <option value=\"null\">Select...</option>");
                    sb.append("      <option value=\"feedback\">Feedback</option>");
                    sb.append("      <option selected value=\"inquiry\">Inquiry</option>");
                    sb.append("      <option value=\"complaint\">Complaint</option>");
                    break;
                case "complaint":
                    sb.append("      <option value=\"null\">Select...</option>");
                    sb.append("      <option value=\"feedback\">Feedback</option>");
                    sb.append("      <option value=\"inquiry\">Inquiry</option>");
                    sb.append("      <option selected value=\"complaint\">Complaint</option>");
                    break;
                default:
                    break;
            }
        }
        sb.append("   </select>");
        sb.append("  </div>");

        sb.append("<div class=\"form-group\">");
        sb.append("<label for=\"message\">*Message:</label>");
        if(forMes != null) {
            if(forMes.equals("")) {
                sb.append("<textarea class=\"form-control\" id=\"forMes\" name=\"forMes\" rows=\"3\" ></textarea>");
            } else {
                sb.append("<textarea class=\"form-control\" id=\"forMes\" name=\"forMes\" rows=\"3\">" + forMes + "</textarea>");
            }
        } else {
            sb.append("<textarea class=\"form-control\" id=\"forMes\" name=\"forMes\" rows=\"3\" ></textarea>");
        }
        sb.append("</div>");

        sb.append("<button id=\"btnSubmit\" type=\"submit\" class=\"btn btn-primary btn-block\">Submit</button>");
        sb.append("</fieldset>");
        sb.append("</form>");
        sb.append("</div>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();





    }



}
