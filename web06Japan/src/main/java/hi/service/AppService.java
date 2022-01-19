package hi.service;

import org.springframework.stereotype.Service;
import hi.domain.App;

/**
 * .
 *
 * @author ahmad
 */
@Service
public class AppService {
    public App getApp(String appName) {
        App app = new App();
        app.setAppName("App");

        return app;
    }
}