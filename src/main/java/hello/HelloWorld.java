package hello;

import org.joda.time.LocalTime;
import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger logger = Logger.getLogger(this.getClass().getName());

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        logger.info("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        logger.info(greeter.sayHello());
    }
}
