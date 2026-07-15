<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date Example</title>
</head>
<body>

<h1>Today's Full Date: <%= new Date() %></h1>

<%
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String formattedDate = dateFormat.format(currentDate);
%>

<h2>Formatted Date: <%= formattedDate %></h2>

</body>
</html>