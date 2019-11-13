package upgrad.controller;


import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/helloworld")
public class HelloWorldServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print("<!Doctype html>");
        writer.print("<html>");
        writer.print("<head>");
        writer.print("<title>Hello World Servlet!</title>");
        writer.print("</head>");
        writer.print("<body>");
        writer.print("<p>Hello World!</p>");
        writer.print("</body>");
        writer.print("</html>");
        writer.close();
    }
}



