package com.cecurity.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
@SpringBootApplication
public class App1Application {
    private final static Logger log = LoggerFactory.getLogger( App1Application.class );
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication( App1Application.class );
        app.setHeadless( false );
        app.setBannerMode( Banner.Mode.OFF );
        app.setLogStartupInfo( false );
        log.info( "Log with arguments {}, {} and {}", 1, "2", 3.0 );
        app.run( args);
	}

}
