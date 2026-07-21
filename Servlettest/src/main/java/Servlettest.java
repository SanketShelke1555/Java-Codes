import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlettest extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	response.setContentType("text/html");
    	
    	 PrintWriter out = response.getWriter();
    	 
    	 out.println("Hello World...");
    }
}