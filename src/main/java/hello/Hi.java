package hello;

import java.util.logging.Logger;

public class Hi {

    private static final Logger logger = Logger.getLogger(Hi.class.getName());

    public void sayHi() {
        logger.info("Hi, World!");
    }
}
