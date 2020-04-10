package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FreshServlet", urlPatterns = {"/"})
public class Hello extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        String head = "<h3>Hello, world of HttpServlet 4.0!</h3>";
        String sub = "<p>This page is directly generated from servlet. No html or jsp has been used for this assignment</p>";
        String click = "<p>Please click on link below to try out contact, which is assignment 12.</p>";
        String url = "<a href=\"contact\">click</a>";
        PrintWriter out = response.getWriter();
        out.println(head);
        out.println(sub);
        out.println(click);
        out.println(url);

    }
}
