package service;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.PlayerDao;
import exception.DaoException;
import model.Player;

/**
* Describe class here.
*
*
*
*
*
*/
public class PlayerService {

	/**
	* 
	* @param player
	* @return
	* @throws ClassNotFoundException
	* @throws DaoException
	*/
	public Player createPlayer(Player player) throws ClassNotFoundException, DaoException {
		PlayerDao playerDao = new PlayerDao();
		playerDao.addPlayer(player);
		return player;
	}

	/**
	* 
	* @param PlayerID
	* @return
	* @throws ClassNotFoundException
	* @throws DaoException
	 * @throws SQLException
	*/
	public Player findPlayer(int PlayerID) throws ClassNotFoundException, DaoException, SQLException {
		PlayerDao playerDao = new PlayerDao();
		return playerDao.findPlayer(PlayerID);
	}

	/**
	* 
	* @param pid
	* @throws ClassNotFoundException
	* @throws DaoException
	*/
	public void deletePlayer(int pid) throws ClassNotFoundException, DaoException {
		PlayerDao playerDao = new PlayerDao();
		playerDao.deletePlayer(pid);
	}

	/**
	* 
	* @return
	* @throws ClassNotFoundException
	* @throws DaoException
	*/
	public ArrayList<Player> listPlayers() throws ClassNotFoundException, DaoException {
		PlayerDao playerDao = new PlayerDao();
		return playerDao.listPlayers();
	}

	/**
	* 
	* @param player
	* @throws DaoException
	* @throws ClassNotFoundException
	*/
	public void updatePlayer(Player player) throws DaoException, ClassNotFoundException {
		PlayerDao playerDao = new PlayerDao();
		playerDao.updatePlayer(player);
	}

}
