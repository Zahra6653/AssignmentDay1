package com.techment.log;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.HTMLLayout;


public class AddDemo {
	
	static Logger logger =Logger.getLogger("AddDemo.class");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileAppender fileappender = new FileAppender(new PatternLayout(),"mylog.txt");
		//FileAppender fileappender = new FileAppender(new HTMLLayout(),"myloghtml.html");
		logger.addAppender(fileappender);
		
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.error("This is error message");
		
		System.out.println("success");
    
	}

}
