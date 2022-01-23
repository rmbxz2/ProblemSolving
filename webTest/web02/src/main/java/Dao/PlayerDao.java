package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import exception.DaoException;
import exception.RecordNotFoundException;
import model.Player;

/**
* Describe class here.
*
*
*
*
*
*/
public class PlayerDao {

	/**
	* 
	* @throws ClassNotFoundException
	*/
	public PlayerDao() throws ClassNotFoundException {
		// Class.forName("org.mariadb.jdbc.Driver");  
		Class.forName("org.postgresql.Driver");
	}

	/**
	* 
	* @return
	* @throws SQLException
	*/
	protected Connection getConnection() throws SQLException {
		// return  DriverManager.getConnection("jdbc:mysql://localhost/soccer","root","ahmadjar");
		return DriverManager.getConnection("jdbc:postgresql://localhost/soccer", "ahmad", "ahmadjar");

	}

	/**
	* 
	* @param player
	* @throws DaoException
	*/
	public void addPlayer(Player player) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = getConnection();
			String sql = "INSERT INTO  player (name,  address,  city,  province,  postal_code)  VALUES (?,?,?,?,?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, player.getName());
			ps.setString(2, player.getAddress());
			ps.setString(3, player.getCity());
			ps.setString(4, player.getProvince());
			ps.setString(5, player.getPostalCode());
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
	private void closeDBObjects(final Connection connection, final PreparedStatement ps, final Statement stmt,
			final ResultSet rs) throws DaoException {
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
	* 
	* @param playerID
	* @return
	* @throws DaoException
	* @throws SQLException
	*/
	public Player findPlayer(int playerID) throws DaoException, SQLException {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = getConnection();
			String sql = "SELECT name, address, city, province, postal_code FROM player WHERE pid= ?";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, playerID);
			rs = ps.executeQuery();
			Player player = null;
			if (rs.next()) {
				player = populatePlayer(rs);
			} else { // rs.next = false, no more rows
				throw new RecordNotFoundException();
			}
			return player;
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			closeDBObjects(connection, ps, null, rs);
		}
	}

	/**
	* 
	* @param playerId
	* @throws DaoException
	*/
	public void deletePlayer(int playerId) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = getConnection();
			String sql = "DELETE FROM Player WHERE pid = ? ";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, playerId);
			if (ps.executeUpdate() == 0) { // return row count as int , 0 means no row effected, or 4 rows effected 
				throw new DaoException(); // throw direct to throws, but must execute finally 
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			closeDBObjects(connection, ps, null, null);
		}
	}

	/**
	* 
	* @param rs
	* @return
	* @throws SQLException
	*/
	private Player populatePlayer(ResultSet rs) throws SQLException {
		Player player = new Player();
		player.setName(rs.getString("name"));
		player.setAddress(rs.getString("address"));
		player.setCity(rs.getString("city"));
		player.setProvince(rs.getString("province"));
		player.setPostalCode(rs.getString("postal_code"));
		return player;
	}

	/**
	* 
	* @return
	* @throws DaoException
	*/
	public ArrayList<Player> listPlayers() throws DaoException {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = getConnection();
			String sql = "SELECT name,  address,  city,  province,  postal_code FROM player";
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			Player player = null;
			ArrayList<Player> listAllPlayers = new ArrayList<Player>();
			while (rs.next()) {
				player = populatePlayer(rs);
				listAllPlayers.add(player);
			}
			return listAllPlayers;
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			closeDBObjects(connection, null, stmt, rs);
		}
	}

	public void updatePlayer(Player player) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = getConnection();
			String sql = "UPDATE Player SET name = ?, address = ?, city = ?, province=? , postal_code = ?  WHERE  pid = ? ";
			ps = connection.prepareStatement(sql);
			ps.setString(1, player.getName());
			ps.setString(2, player.getAddress());
			ps.setString(3, player.getCity());
			ps.setString(4, player.getProvince());
			ps.setString(5, player.getPostalCode());
			ps.setInt(6, player.getPid());
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
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, DaoException, SQLException {
		PlayerDao playerDao = new PlayerDao();

		// add
		// Player player = new Player("saad", "syria", "deer", "amman", "999");
		// playerDao.addPlayer(player);

		// find
		//		Player player = playerDao.findPlayer(4);
		//		System.out.println(player);

		// delete
		// playerDao.deletePlayer(4);

		// list 
		//ArrayList<Player> listOfPlayers = playerDao.listPlayers();
		//System.out.println(listOfPlayers);
		// listOfPlayers.forEach(System.out::println);

		// update
		// Player player = new Player(5, "Saad", "syria", "deer", "amman", "888");
		// playerDao.updatePlayer(player);

	}

}
