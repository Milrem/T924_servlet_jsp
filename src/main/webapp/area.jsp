<%@ page import="br.com.ada.t924.model.Comodo" %>
<%@ page import="br.com.ada.t924.service.Area" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>&Aacute;reas</title>
</head>
<body>
    <%
        boolean isPiso = request.getParameter("pisos") != null;
        boolean isTinta = request.getParameter("tinta") != null;
        boolean isArea = request.getParameter("areas") != null || isPiso || isTinta;
        boolean isNone = !isArea && !isPiso && !isTinta;
        Comodo comodo = new Comodo();
        if (!isNone) {
            comodo.setLargura(Float.valueOf(request.getParameter("largura")));
            comodo.setComprimento(Float.valueOf(request.getParameter("comprimento")));
            comodo.setAltura(Float.valueOf(request.getParameter("altura")));
            comodo.setNome(request.getParameter("name"));
        }
    %>
    <h1>&Aacutereas calculadas para o c&ocirc;modo <%= comodo.getNome() %><h1>
    <% if (isArea) { %>
    <h2>A &aacute;rea total do c&ocirc;modo &eacute; <%= Area.areaPiso(comodo) %></h2>
    <% } %>
    <% if (isPiso) { %>
    <h2>S&atilde;o necess&aacute;rias <%= Area.calcularPisos(comodo, 1.27f) %> caixas de pisos</h2>
    <% } %>
    <% if (isTinta) { %>
    <h2>S&atilde;o necess&aacute;rias <%= Area.calcularTinta(comodo, 3.7f) %> latas de tinta</h2>
    <% } %>
</body>
</html>