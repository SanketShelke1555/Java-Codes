import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServletex extends HttpServlet {

	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
  throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();

        // Read context parameters from web.xml
        String company = context.getInitParameter("company");
        String city = context.getInitParameter("city");

        out.println("Company: " + company + "<br>");
        out.println("City: " + city + "<br>");

        // Set a context attribute
        context.setAttribute("company", "XYZ");

        // Read the context attribute
        String msg = (String) context.getAttribute("company");
        out.println("Message: " + msg);
    }
}