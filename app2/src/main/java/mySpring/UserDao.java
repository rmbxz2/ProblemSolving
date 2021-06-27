package mySpring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 * Describe class UserDao here.
 *
 *
 * Created: Sat Oct 20 13:25:34 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    /**
     * Describe <code>insert</code> method here.
     *
     * @param user an <code>User</code> value
     */
    public void insert(User user){
	String sql="INSERT INTO League (year, season,title)  VALUES (2008,'Spring','league 22')";
     	jdbcTemplate.update(sql);
    }

    /**
     * Describe <code>update</code> method here.
     *
     * @param user an <code>User</code> value
     */
    public void update(User user){
	
    }

    /**
     * Describe <code>delete</code> method here.
     *
     * @param user an <code>User</code> value
     */
    public void delete(User user){
	
    }


    /**
     * Gets the value of jdbcTemplate
     *
     * @return the value of jdbcTemplate
     */
    public final JdbcTemplate getJdbcTemplate() {
	return this.jdbcTemplate;
    }

    /**
     * Sets the value of jdbcTemplate
     *
     * @param argJdbcTemplate Value to assign to this.jdbcTemplate
     */
    public final void setJdbcTemplate(final JdbcTemplate argJdbcTemplate) {
	this.jdbcTemplate = argJdbcTemplate;
    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	//ApplicationContext context = new FileSystemXmlApplicationContext("file:///home/jdee_workspace/app2/src/extra/etc/ApplicationContext.xml");

 	// put it in the classpath                                "./src/resources/"  ,can put word classpath and can remove it
  	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/WEB-INF/mySpring/AhmadApplicationContext.xml");
	//                                 
	// important notes 
	// AplicationContext and BeanFactory are  spring-container.
	// AplicationContext are spring-container for big project.
	// BeanFactory are  spring-container for small project.
	    
        // DriverManagerDataSource dm  = (DriverManagerDataSource)context.getBean("MydataSourcex");
	// JdbcTemplate jdbcTemplateX = new JdbcTemplate(dm);
	// jdbcTemplateX.update("INSERT INTO League (year, season,title)  VALUES (2008,'Spring','league 103')");

         JdbcTemplate  jdbcTemplateX  = (JdbcTemplate)context.getBean("jdbcTemplate");
 	 jdbcTemplateX.update("INSERT INTO League (year, season,title)  VALUES (2008,'Spring','league 103')");
    
	// ds.update("INSERT INTO League (year, season,title)  VALUES (2008,'Spring','league 22')");	

	 ///////////// by bean factory  ///////
	 // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("AhmadApplicationContext.xml"));

    }
}
