package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Describe class here.
*
*
*
*
*
*/
public class SessionTestAtrribute extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String nameAttribute = (String) session.getAttribute("nameAttribute");
		PrintWriter out = resp.getWriter();
		out.println("session attribute name = " + nameAttribute);
		out.close();
	}
}
