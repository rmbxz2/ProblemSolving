package hi.config;

import lodsve.web.webservice.EnableWebService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * .
 *
 * @author ahmad
 */
@Configuration
@EnableWebService
@ComponentScan(value = {"hi.service"})
@ImportResource({"classpath*:/META-INF/spring/*.xml"})
public class AppConfig {

}