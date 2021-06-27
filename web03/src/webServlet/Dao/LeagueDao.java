package webServlet.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.mariadb.jdbc.Driver;
import webServlet.exception.DaoException;
import webServlet.exception.RecordNotFoundException;
import webServlet.model.League;

/**
 *
 *
 *
 *
 *
 *
 *
 */
public class LeagueDao {

    /**
     * Creates a new <code>LeagueDao</code> instance.
     *
     * @exception ClassNotFoundException if an error occurs
     */
    public LeagueDao() throws ClassNotFoundException {
  	Class.forName("org.mariadb.jdbc.Driver");  
    }  

    /** (setq debug-on-error t)
     * Describe <code>getConnection</code> method here.
     *
     * @return a <code>Connection</code> value
     * @exception SQLException if an error occurs
     */
    protected Connection getConnection() throws SQLException {
	return  DriverManager.getConnection("jdbc:mysql://localhost/soccer","root","ahmadjar");
    }

    /**
     * Describe <code>addLeague</code> method here.
     *
     * @param league a <code>League</code> value
     * @exception DaoException if an error occurs
     */
    public void addLeague(final League league) throws DaoException {
	Connection connection = null;
	PreparedStatement ps = null;
	try {
	    connection = getConnection();
	    String sql= "INSERT INTO League (year, season,title) VALUES (?,?,?)";
	    ps = connection.prepareStatement(sql);
	    ps.setInt(1,league.getYear());
	    ps.setString(2, league.getSeason());
	    ps.setString(3, league.getTitle());
	    if (ps.executeUpdate() == 0) {
		throw new DaoException();
 	    }
	} catch (SQLException e) {
	    throw new DaoException(e);
	} finally {
	    closeDBObjects(connection, ps, null, null);
	}
    }

    /**
     * Describe <code>closeDBObjects</code> method here.
     *
     * @param connection a <code>Connection</code> value
     * @param ps a <code>PreparedStatement</code> value
     */
    private void closeDBObjects(final Connection connection,final PreparedStatement ps, final Statement stmt, final ResultSet rs) throws DaoException {
	try { 
	    if (rs != null) {
		rs.close();
	    }
	    if (stmt != null) {
 		stmt.close();
	    }
	    if (ps != null) {
		ps.close();
	    }
	    if (connection != null) {
		connection.close();
	    }
	} catch (SQLException e) {
	    throw new DaoException(e);
	}
    }

    /**
     * Describe <code>findLeague</code> method here.
     *
     * @param LeagueID an <code>int</code> value
     * @return a <code>League</code> value
     */
    public League findLeague(int leagueID) throws DaoException{
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
	    connection = getConnection();
	    String sql = "SELECT LID, year, season, title FROM League WHERE LID=? ";
	    ps = connection.prepareStatement(sql);
	    ps.setInt(1, leagueID);
	    rs = ps.executeQuery();
	    League league = null;
	    if (rs.next()) {
		league = populateLeague(rs);
	    } else { // rs.next = false, no more rows
		throw new RecordNotFoundException();
	    }             
	    return league;
	} catch (SQLException e) {
	    throw new DaoException(e);
	} finally {
 	    closeDBObjects(connection, ps, null, rs);
	}
    }

    /**
     * Describe <code>deleteEmployee</code> method here.
     *
     */
    public void deleteLeague(int LID) throws DaoException{
	Connection connection = null;
	PreparedStatement ps = null;
	try {
	    connection = getConnection();
	    String sql = "DELETE FROM League WHERE LID = ? ";
	    ps = connection.prepareStatement(sql);
	    ps.setInt(1, LID);
	    if (ps.executeUpdate() == 0) { // return row count as int , 0 means no row effected, or 4 rows effected 
      		throw new DaoException();  // throw direct to throws, but must execute finally 
	    }
	} catch (SQLException e) {
	    throw new DaoException(e);
	} finally {

	    closeDBObjects(connection,ps,null,null);

	}
    }


    /**
     * Describe <code>populateLeague</code> method here.
     *
     * @param rs a <code>ResultSet</code> value
     * @return a <code>League</code> value
     */
    private League populateLeague(ResultSet rs) throws SQLException {
	League league = new League();
	league.setLID(rs.getInt(1));
     	league.setYear(rs.getInt(2));
	league.setSeason(rs.getString(3));
	league.setTitle(rs.getString(4));
	return league;
    }



    /**
     * Describe <code>listLeagues</code> method here.
     *
     * @return an <code>ArrayList</code> value
     */
    public ArrayList<League> listLeagues() throws DaoException {
	Connection connection = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
	    connection = getConnection();
	    String sql = "SELECT  LID, year, season, title FROM League ";
	    stmt = connection.createStatement();
	    rs = stmt.executeQuery(sql);
	    League league = null;
	    ArrayList<League> listLeagues = new ArrayList<League>();
	    while (rs.next()) {
		league= populateLeague(rs);
		listLeagues.add(league);
	    }
	    return listLeagues;
	} catch (SQLException e) {
	    throw new DaoException(e);
	} finally {
	    closeDBObjects(connection, null, stmt, rs);
	}
    }


    /**
     * Describe <code>updateLeague</code> method here.
     *
     * @param league a <code>League</code> value
     * @exception DaoException if an error occurs
     */
    public void updateLeague(final League league) throws DaoException {
	Connection connection = null;
	PreparedStatement ps = null;
	try {
	    connection = getConnection();
	    String sql= "UPDATE League SET year = ?, season = ?, title = ? WHERE  LID = ? ";
	    ps = connection.prepareStatement(sql);
	    ps.setInt(1,league.getYear());
	    ps.setString(2, league.getSeason());
	    ps.setString(3, league.getTitle());
	    ps.setInt(4, league.getLID());
	    if (ps.executeUpdate() == 0) {
		throw new DaoException();
 	    }
	} catch (SQLException e) {
	    throw new DaoException(e);
	} finally {
	    closeDBObjects(connection, ps, null, null);
	}
    }


    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) throws ClassNotFoundException, DaoException{
	LeagueDao leagueDao = new LeagueDao();
	
	// add
	// League league = new League(2010,"dao5","Winter");
	// leagueDao.addLeague(league);

	// find
	// League league2 = leagueDao.findLeague(6);
  	//	 System.out.println(league2);
	
	// delete
	//leagueDao.deleteLeague(2);

	// list 
	 ArrayList<League> list = leagueDao.listLeagues();
	 System.out.println(list);

	 for (League league : list) {
	     System.out.println(league);
	 }

	// update
	// League league = new League(9, 2010,"league update 09", "Winter"); 
	// leagueDao.updateLeague(league);

	 // spring
	 //  ApplicationContext  context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
    }
}
// (lsp-send-execute-command "vscode.java.resolveClasspath" (vector "" "web01"))
// (replace-regexp-in-string "\[" "" (lsp-send-execute-command "vscode.java.resolveClasspath" (vector "" "web01")))
// (replace-regexp-in-string "\\[\|\\]"  " " (lsp-send-execute-command "vscode.java.resolveClasspath" (vector "" "web01")))
