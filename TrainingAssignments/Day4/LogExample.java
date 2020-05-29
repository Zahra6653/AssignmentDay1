package logFile;

import org.apache.log4j.Logger;

public class LogExample {
	
	static Logger logger=Logger.getLogger("LogExample.class");
    public static void main(String args[]) 
    {
    	logger.debug("This is DEBUG message");
    	logger.info("This is INFO message");
    	logger.error("This is ERROR message");
    	logger.fatal("This is FATAL message");
	
    }
	
}
