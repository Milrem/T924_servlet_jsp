package br.com.ada.t924.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BemVindoServlet extends HttpServlet {
    private static final String MSG_BEM_VINDO = "%s, seja bem vindo ao serviço %s";
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String remoteAddress = req.getRemoteAddr();
        String localAddress = req.getLocalAddr();

        String msg = String.format(MSG_BEM_VINDO, remoteAddress, localAddress);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<title>Servlet e JSP</title>");
        out.println("</HEAD>");
        out.println("<body>");
        out.println("<H1>BEM VINDO</H1>");
        out.println("<h3>");
        out.println(msg);
        out.println("</h3>");
        out.println("</body>");
        out.println("</HTML>");
        out.flush();
    }
}
