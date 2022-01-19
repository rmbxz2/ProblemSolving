package webServlet.model;

/**
 * Describe class League here.
 *
 *
 */
public class League {
 
    private int LID;
    private int year;
    private String title;
    private String season;
   
     /**
     * Creates a new <code>League</code> instance.
     *
     */
    public League(){
 
    }

    /**
     * Creates a new <code>League</code> instance.
     *
     * @param LID an <code>int</code> value
     * @param year an <code>int</code> value
     * @param title a <code>String</code> value
    * @param season a <code>String</code> value
     */
    public League(int LID,int year, String title, String season) {
	this.LID=LID;
	this.year=year;
	this.title=title;
	this.season=season;
    }

    /**
     * Creates a new <code>League</code> instance.
     *
     * @param year an <code>int</code> value
     * @param title a <code>String</code> value
     * @param season a <code>String</code> value
     */
    public League(int year, String title, String season) {
	this.year=year;
	this.title=title;
	this.season=season;
    }

    /**
     * Gets the value of year
     *
     * @return the value of year
     */
    public final int getYear() {
	return this.year;
    }

    /**
     * Sets the value of year
     *
     * @param argYear Value to assign to this.year
     */
    public final void setYear(final int argYear) {
	this.year = argYear;
    }

    /**
     * Gets the value of title
     *
     * @return the value of title
     */
    public final String getTitle() {
	return this.title;
    }

    /**
     * Sets the value of title
     *
     * @param argTitle Value to assign to this.title
     */
    public final void setTitle(final String argTitle) {
	this.title = argTitle;
    }

    /**
     * Gets the value of season
     *
     * @return the value of season
     */
    public final String getSeason() {
	  return this.season;
    }

    /**
     * Sets the value of season
     *
     * @param argSeason Value to assign to this.season
     */
    public final void setSeason(final String argSeason) {
	this.season = argSeason;
    }

    /**
     * Gets the value of lID
     *
     * @return the value of lID
     */
    public final int getLID() {
	return this.LID;
    }

    /**
     * Sets the value of lID
     *
     * @param argLID Value to assign to this.lID
     */
    public final void setLID(final int argLID) {
	this.LID = argLID;
    }

    /**
     * Check if this object is equal (equivalent) to another object.
     */
    public final boolean equals(final Object obj) {
	if (obj == this) return true;
	if ((obj == null) || !getClass().equals(obj.getClass())) return false;
	
	League o = (League) obj;
	
	return (LID == o.LID)
	    && (year == o.year)
	    && (title == null ? o.title == null : title.equals(o.title))
	    && (season == null ? o.season == null : season.equals(o.season));
    }

    /**
     * Calculate the hash code for this object.
     * 
     * <p>The rules laid out in J. Blosh's Effective Java are used
     * for the hash code calculation.</p>
     * 
     * @return the hash code.
     * 
     * @see java.lang.Object#hashCode
     */
    public final int hashCode() {
	int code = 11;
	
	code = code * 37 + LID;
	code = code * 37 + year;
	code = code * 37 + (title == null ? 13 : title.hashCode());
	code = code * 37 + (season == null ? 17 : season.hashCode());
	
	return code;
    }

    /**
     * Get a string representation of this object.
     * 
     * @return a string representation of this object.
     * 
     * @see java.lang.Object#toString
     */
    public final String toString() {
	return new StringBuilder("LID=" + LID)
	    .append(", year=" + year)
	    .append(", title=" + title)
	    .append(", season=" + season)
	    .toString();
    }
}
  
//   (message (format "%s"    (replace-regexp-in-string "/src/.*"  "" (expand-file-name ""))))
//   (message (format "%s"    (replace-regexp-in-string "/src/.*"  "" (expand-file-name ""))))
// (message (format "/home/myLSP/lspWorkspace/%s"  (replace-regexp-in-string  "/.*" ""  (replace-regexp-in-string "/home/myLSP/lspWorkspace/"  "" (expand-file-name "")))))
