package sl314.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Support classes
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Iterator;

public class AddLeagueFormServlet extends HttpServlet {

  /** There are the default seasons for the US. */
  private static final String DEFAULT_SEASONS
    = "Spring,Summer,Fall,Winter";

  /** This variable holds the set of seasons. */
  private String[] SEASONS;

  /** The init method configures the set of seasons. */
  public void init() {
    String seasons_list = getInitParameter("seasons-list");
    if ( seasons_list == null ) {
      seasons_list = DEFAULT_SEASONS;
    }
    SEASONS = seasons_list.split(",");
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
         throws IOException {
    generateView(request, response);
  }

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
         throws IOException {
    generateView(request, response);
  }

  public void generateView(HttpServletRequest request,
                           HttpServletResponse response)
         throws IOException {

    // Set page title
    String pageTitle = "Duke's Soccer League: Add a New League";

    // Retrieve the errorMsgs from the request-scope
    List errorMsgs = (List) request.getAttribute("errorMsgs");

    // Specify the content type is HTML
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Generate the HTML response
    out.println("<html>");
    out.println("<head>");
    out.println("  <title>" + pageTitle + "</title>");
    out.println("</head>");
    out.println("<body bgcolor='white'>");

    // Generate page heading
    out.println("<!-- Page Heading -->");
    out.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
    out.println("<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>");
    out.println("  <td><h3>" + pageTitle + "</h3></td>");
    out.println("</tr>");
    out.println("</table>");

    // Generate main body
    out.println("<p>");
    out.println("This form allows you to create a new soccer league.");
    out.println("</p>");
    out.println("<form action='add_league.do' method='POST'>");

    // Display the year field
    out.println("Year: <input type='text' name='year' /> <br/><br/>");

    // Customize the season drop-down menu
    out.println("Season: <select name='season'>");
    out.println("          <option value='UNKNOWN'>select...</option>");
    for ( int i = 0; i < SEASONS.length; i++ ) {
      out.print("          <option value='" + SEASONS[i] + "'");
      out.println(">" + SEASONS[i] + "</option>");
    }
    out.println("        </select> <br/><br/>");

    // Display the title field
    out.println("Title: <input type='text' name='title' /> <br/><br/>");

    out.println("<input type='Submit' value='Add League' />");
    out.println("</form>");

    out.println("</body>");
    out.println("</html>");
  }
}
