import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DBConnection;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	


        String action = req.getParameter("action");
        System.out.println("Action = " + action);

        try {
            Connection con = DBConnection.getConnection();

            if ("insert".equals(action)) {

                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                int marks = Integer.parseInt(req.getParameter("marks"));

                PreparedStatement ps =
                    con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, marks);
                ps.executeUpdate();
            }

            else if ("update".equals(action)) {

                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                int marks = Integer.parseInt(req.getParameter("marks"));

                PreparedStatement ps =
                    con.prepareStatement(
                        "UPDATE student SET name=?, marks=? WHERE id=?");
                ps.setString(1, name);
                ps.setInt(2, marks);
                ps.setInt(3, id);
                ps.executeUpdate();
            }

            else if ("delete".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));

                PreparedStatement ps =
                    con.prepareStatement("DELETE FROM student WHERE id=?");
                ps.setInt(1, id);
                ps.executeUpdate();
            }

            RequestDispatcher rd =
                req.getRequestDispatcher("display.jsp");
            rd.forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
