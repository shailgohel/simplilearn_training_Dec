package base;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	public Logger logger = Logger.getLogger(BaseClass.class);
	
	public BaseClass() {
		PropertyConfigurator.configure("log4j.properties");
	}
}
