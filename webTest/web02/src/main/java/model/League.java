package model;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
* Describe class here.
*
*
*
*
*
*/
public class League implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {
	private int id;
	private int year;
	private String season;
	private String title;

	/**
	 * 
	 */
	public League() {
	}

	/**
	 * @param year
	 * @param season
	 * @param title
	 */
	public League(int year, String season, String title) {
		this.year = year;
		this.season = season;
		this.title = title;
	}

	/**
	 * @param id
	 * @param year
	 * @param season
	 * @param title
	 */
	public League(int id, int year, String season, String title) {
		this.id = id;
		this.year = year;
		this.season = season;
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the season
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * @param season the season to set
	 */
	public void setSeason(String season) {
		this.season = season;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		League other = (League) obj;
		if (id != other.id)
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "League [id=" + id + ", season=" + season + ", title=" + title + ", year=" + year + "]";
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("listen , league  is bound to the session");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("listen , league  is un-bound to the session");
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("listen , league attribute  is activate  to the jvm");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("listen , league attribute  is passivate  from jvm");
	}

}
