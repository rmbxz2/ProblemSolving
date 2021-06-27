package mySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Describe class Test here.
 *
 *
 * Created: Sat Oct 20 12:11:33 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Test {

    /**
     * Creates a new <code>Test</code> instance.
     *
     */
    public Test(){
	ApplicationContext context = new FileSystemXmlApplicationContext("file:///home/jdee_workspace/app2/src/extra/etc/ApplicationContext.xml");

 	// put it in the classpath, notes that the src/ in classpath(.classes not .java)
	// ApplicationContext context = new ClassPathXmlApplicationContext("extra/etc/ApplicationContext.xml");
	Reading reading = (Reading)context.getBean("reading");
    }

}
