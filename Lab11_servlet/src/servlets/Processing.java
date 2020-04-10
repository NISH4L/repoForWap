package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Processing", urlPatterns = {"/process"})
public class Processing extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String missingItems = "";
        String userName = request.getParameter("forName");
        String gender = request.getParameter("forGender");
        String category = request.getParameter("forCat");
        String message = request.getParameter("forMes");
        System.out.println("name= "+ userName + ", gender= " + gender + ", cat= " + category + ", msg= " + message);



        //following checks if the field is empty.
        if(userName.equals("")) {
            missingItems += "<span style='color:red;font-size:1em'>Name is missing.</span><br/>";
        }
        if(gender == null) {
            missingItems += "<span style='color:red;'>Gender is missing.</span><br/>";
        }
        if(category.equals("null")) {
            missingItems += "<span style='color:red;'>Category is missing.</span><br/>";
        }
        if(message.equals("")) {
            missingItems += "<span style='color:red;'>Message is missing.</span><br/>";
        }
        if(!missingItems.equals("")) {
            request.setAttribute("objCheckError", missingItems);
            // If the field are empty, send back
            RequestDispatcher rd = request.getRequestDispatcher("/contact");
            rd.forward(request, response);
        } else {
            String redirectUrl = "thankyou?forName="+userName+"&forGender="+gender+"&forCat="+category+"&forMes="+message;
            response.sendRedirect(redirectUrl);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("contact");

    }
}
