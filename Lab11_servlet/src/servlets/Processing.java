package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Processing", urlPatterns = {"/processing"})
public class Processing extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("contact");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String missingItems = "";
        String forName = request.getParameter("forName");
        String forGender = request.getParameter("forGender");
        String forCat = request.getParameter("forCat");
        String forMes = request.getParameter("forMes");
        System.out.println("forName= "+ forName + ", forGender= " + forGender + ", forCat= " + forCat + ", forMes= " + forMes);

        //following checks if the field is empty.
        if(forName.equals("")) {
            missingItems += "<span style='color:red;font-size:1em'>Name is missing.</span><br/>";
        }
        if(forGender == null) {
            missingItems += "<span style='color:red;'>Gender is missing.</span><br/>";
        }
        if(forCat.equals("null")) {
            missingItems += "<span style='color:red;'>Category is missing.</span><br/>";
        }
        if(forMes.equals("")) {
            missingItems += "<span style='color:red;'>Message is missing.</span><br/>";
        }
        if(!missingItems.equals("")) {
            //System.out.println("HELLO");
            request.setAttribute("errorMsg", missingItems);
            // If the field are empty, send back
            RequestDispatcher rd = request.getRequestDispatcher("/contact");
            rd.forward(request, response);
        } else {
            String redirectUrl = "thanks?forName="+forName+"&forGender="+forGender+"&forCat="+forCat+"&forMes="+forMes;
            response.sendRedirect(redirectUrl);
        }
    }

}
