import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        out.println("<h2>Welcome to CFS</h2>");
        out.println("<p>Contact us with No:+911234567890</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Name=req.getParameter("name");
        String Course=req.getParameter("course");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h2>Student Details</h2>");
        out.println("<p>Student Name : "+Name+"</p>");
        out.println("<p>Student Course :"+Course+"</p>");
    }
}
