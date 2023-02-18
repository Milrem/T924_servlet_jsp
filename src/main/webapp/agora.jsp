<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalTime" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Server & JSP: Agora</title>
</head>
<body>
    <h1>Hoje &eacute <% out.print(LocalDate.now()); %><h1>
    <h2>O hor&aacuterio atual &eacute <%= LocalTime.now() %></h2>
</body>
</html>