package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoughTest {

	public static Logger log = LogManager.getLogger(RoughTest.class);
	public static void main(String[] args) {
		
		
		
		System.out.println("hello world");
		log.info("Log4j info message");
		log.debug("Log4j debug message");
		log.warn("Log4j warn message");
		log.error("Log4j error message");
		log.fatal("Log4j fatal message");
		
		System.out.println("completed");
	}

}
