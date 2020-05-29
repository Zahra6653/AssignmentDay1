package com.techment.log;

import org.apache.log4j.*;

public class LogProperties {

	static Logger logger=Logger.getLogger("LogProperties.class");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.debug("This is DEBUG message");
    	logger.info("This is INFO message");
    	logger.error("This is ERROR message");
    	logger.fatal("This is FATAL message");
    	System.out.println("Success");

	}

}
