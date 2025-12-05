package com.cecurity.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.*;

import java.util.Arrays;

@SpringBootApplication
public class App1Application {
    private final static Logger log = LoggerFactory.getLogger( App1Application.class );
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication( App1Application.class );
        app.setHeadless( false );
        app.setBannerMode( Banner.Mode.CONSOLE );
        app.setLogStartupInfo( true);
        log.info( "Log with arguments {}, {} and {}", 1, "2", 3.0 );
        ApplicationContext ctx =app.run( args);
        /*

        Arrays.stream( ctx.getBeanDefinitionNames() )
                .sorted()
                .forEach( System.out::println );

         */
    }

}
