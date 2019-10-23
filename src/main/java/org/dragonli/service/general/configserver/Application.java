package org.dragonli.service.general.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring config server. This project is only used to serve config files. NOTE
 * the default port of config server is 8888.
 * 
 * @author liaoxuefeng
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

	static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("start {} {}...", Application.class.getSimpleName(),
				Application.class.getPackage().getImplementationVersion());
		SpringApplication.run(Application.class, args);
	}

}
