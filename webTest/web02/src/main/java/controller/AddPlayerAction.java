package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PlayerDao;
import exception.DaoException;
import model.Player;
import service.PlayerService;

/**
* Describe class here.
*
*
*
*
*
*/
public class AddPlayerAction extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> playerErrors = new ArrayList<String>();
		req.setAttribute("playerErrors", playerErrors);

		try {
			String name = req.getParameter("name").trim();
			String address = req.getParameter("address").trim();
			String city = req.getParameter("city").trim();
			String province = req.getParameter("province").trim();
			String postalCode = req.getParameter("postalCode").trim();

			if (name.length() == 0) {
				playerErrors.add("please enter name");
			}
			if (address.length() == 0) {
				playerErrors.add("please enter address");
			}
			if (city.length() == 0) {
				playerErrors.add("please enter city");
			}
			if (province.length() == 0) {
				playerErrors.add("please enter province");
			}
			if (postalCode.length() == 0) {
				playerErrors.add("please enter postalCode");
			}

			if (!playerErrors.isEmpty()) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("player_error.view");
				requestDispatcher.forward(req, resp);
				return;
			}

			Player player = new Player(name, address, city, province, postalCode);

			try {
				PlayerService playerService = new PlayerService();
				playerService.createPlayer(player);
			} catch (Exception e) {
				throw new DaoException(e);
			}
			req.setAttribute("player", player);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("player_success.view");
			requestDispatcher.forward(req, resp);
			return;

		} catch (Exception e) {
			playerErrors.add(e.getMessage());
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("player_error.view");
			requestDispatcher.forward(req, resp);

		}

	}
}
