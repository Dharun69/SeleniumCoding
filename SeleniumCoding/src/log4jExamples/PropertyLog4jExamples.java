package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExamples {

	static Logger logger=Logger.getLogger(PropertyLog4jExamples.class);
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properites");
		logger.debug("This is a debug");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is a error");
		logger.fatal("This is a fatal");
	}

}
