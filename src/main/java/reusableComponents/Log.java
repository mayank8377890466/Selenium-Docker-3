package reusableComponents;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

    //Initialize Log4j logs
    //private static Logger Log = Logger.getLogger(Log.class.getName());//
    //private static final Logger Log =  LogManager.getLogger(Log.class);

    private static Logger Log = Logger.getLogger("devpinoyLogger");
    // This is to print log for the beginning of the test case, as we usually run so many test ExecutionEngine as a test suite
    public static void startTestCase(String sTestCaseName){
        Log.info("****************************************************************************************");
        Log.info("$$$$$$$$$$$$$$$$$$$$$ Starting Test : "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        Log.info("****************************************************************************************");
    }

    //This is to print log for the ending of the test case
    public static void endTestCase(String sTestCaseName){
        Log.info("****************************************************************************************");
        Log.info("$$$$$$$$$$$$$$$$$$$$$ Ending Test :   "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        Log.info("****************************************************************************************");
        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
    }

    // Need to create these methods, so that they can be called
    public static void info(String message) {
        Log.info(message);
    }

    public static void warn(String message) {
        Log.warn(message);
    }

    public static void error(String message) {
        Log.error(message);
    }

    public static void fatal(String message) {
        Log.fatal(message);
    }

    public static void debug(String message) {
        Log.debug(message);
    }

}

