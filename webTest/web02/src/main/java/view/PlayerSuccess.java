package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Player;

/**
* Describe class here.
*
*
*
*
*
*/
public class PlayerSuccess extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Player player = (Player) req.getAttribute("player");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("succeed player =" + player);
		out.println("</body>");
		out.println("</html>");
	}
}
