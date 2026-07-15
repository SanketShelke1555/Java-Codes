import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class Servletexample2 extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get ServletConfig object
        ServletConfig config = getServletConfig();

        // 1. getServletName()
        String servletName = config.getServletName();
        out.println("<h3>Servlet Name: " + servletName + "</h3>");

        // 2. getServletContext()
        ServletContext context = config.getServletContext();
        out.println("Server Info: " + context.getServerInfo() + "<br>");

        // 3. getInitParameter(String name)
        String username = config.getInitParameter("username");
        out.println("Username: " + username + "<br>");

        // 4. getInitParameterNames()
        out.println("<h4>All Init Parameters:</h4>");

        Enumeration<String> params = config.getInitParameterNames();

        while (params.hasMoreElements()) {

            String paramName = params.nextElement();
            String paramValue = config.getInitParameter(paramName);

            out.println(paramName + " = " + paramValue + "<br>");
        }
    }
}