package com.gcu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import groovy.util.logging.Slf4j;


@ComponentScan({"com.gcu"})
@SpringBootApplication
@Slf4j
public class CST323ActivityApp 
{
	private static Logger logger = LoggerFactory.getLogger(CST323ActivityApp.class);
	public static void main(String[] args) 
	{
		SpringApplication.run(CST323ActivityApp.class, args);
		
		//logger.debug("Debug log message");
        logger.info("Logger initialized");
        //logger.error("Error log message");
	}

}
