<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2>Register</h2>

<form action="RegisterServlet" method="post">
    Username: <input type="text" name="username"><br><br>
    Password: <input type="password" name="password"><br><br>
    Email: <input type="text" name="email"><br><br>

    <input type="submit" value="Register">
</form>

<a href="login.jsp">Go to Login</a>

</body>
</html>
