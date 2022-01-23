package service;

import java.util.ArrayList;

import Dao.LeagueDao;
import exception.DaoException;
import model.League;

/**
* Describe class here.
*
*
*
*
*
*/
public class LeagueService {
	/**
	 * @throws ClassNotFoundException
	 * @throws DaoException
	*
	*
	*/
	public League createLeague(League league) throws ClassNotFoundException, DaoException {
		LeagueDao leagueDao = new LeagueDao();
		leagueDao.addLeague(league);
		return league;

	}

	/**
	* 
	* @param leagueID
	* @return
	 * @throws ClassNotFoundException
	 * @throws DaoException
	*/
	public League findLeague(int leagueID) throws ClassNotFoundException, DaoException {
		LeagueDao leagueDao = new LeagueDao();
		return leagueDao.findLeague(leagueID);
	}

	/**
	* 
	* @param lid
	* @throws ClassNotFoundException
	* @throws DaoException
	*/
	public void deleteLeague(int lid) throws ClassNotFoundException, DaoException {
		LeagueDao leagueDao = new LeagueDao();
		leagueDao.deleteLeague(lid);
	}

	/**
	* 
	* @return
	 * @throws ClassNotFoundException
	 * @throws DaoException
	*/
	public ArrayList<League> listLeagues() throws ClassNotFoundException, DaoException {
		LeagueDao leagueDao = new LeagueDao();
		return leagueDao.listLeagues();
	}

	/**
	* 
	* @param league
	* @throws DaoException
	* @throws ClassNotFoundException
	*/
	public void updateLeague(League league) throws DaoException, ClassNotFoundException {
		LeagueDao leagueDao = new LeagueDao();
		leagueDao.updateLeague(league);
	}

}
