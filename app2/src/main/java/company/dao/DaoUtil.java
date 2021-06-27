package company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import company.exception.DaoException;

public class DaoUtil {
	/**
	 * @param connection
	 * @param ps
	 * @param rs
	 * @throws DaoException
	 */
	public static void closeDBObjcets(Connection connection, PreparedStatement ps, ResultSet rs) throws DaoException {
		try {
			if (rs != null) {
				rs.close();
			}
			closeDBObjcets(connection, ps);
		} catch (SQLException e) {
			throw new DaoException(e);
		}

	}

	/**
	 * @param connection
	 * @param ps
	 * @throws DaoException
	 */
	public static void closeDBObjcets(Connection connection, PreparedStatement ps) throws DaoException {
		try {
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

}
