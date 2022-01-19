package sl314.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Support classes
import java.io.PrintWriter;
import java.io.IOException;

public class SquaresServlet extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
         throws IOException {

    // Specify the content type is HTML
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Generate the HTML response
    out.println("<HTML>");
    out.println("<HEAD>");
    out.println("<TITLE>Equivalent JSP Servlet</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY BGCOLOR='white'>");
    out.println("");
    out.println("<B>Table of numbers squared:</B>");
    out.println("");
    out.println("<TABLE BORDER='1' CELLSPACING='0' CELLPADDING='5'>");
    out.println("<TR><TH>number</TH><TH>squared</TH></TR>");
    for ( int i=0; i<10; i++ ) {
      out.print("<TR><TD>" + i + "</TD><TD>" + (i * i) + "</TD></TR>");
    }
    out.println("</TABLE>");
    out.println("");
    out.println("</BODY>");
    out.println("</HTML>");

    out.close();
  }
}
