package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContactController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String missingItems = null;
        String name = request.getParameter("forName");
        String gender = request.getParameter("forGender");
        String category = request.getParameter("forCat");
        String message = request.getParameter("forMes");
        if (name.equals(""))
            missingItems = "<p style= 'color: red;'>Name is missing.</p>";
        if (gender == null)
            missingItems += "<p style= 'color: red;'>Gender is missing.</p>";
        if (category == null)
            missingItems += "<p style= 'color: red;'>Category is missing.</p>";

        if (message.equals(""))
            missingItems += "<p style= 'color: red;'>Message is missing.</p>";

        if (missingItems != null) {
            PrintWriter out = response.getWriter();
           request.setAttribute("error", missingItems);
           request.getRequestDispatcher("/WEB-INF/view/contact.jsp").forward(request, response);

        }
        else {
           request.getRequestDispatcher("/WEB-INF/view/thanks.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/WEB-INF/view/contact.jsp").forward(request, response);
    }
}
