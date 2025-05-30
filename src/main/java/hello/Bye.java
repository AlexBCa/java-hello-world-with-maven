package hello;

import java.util.logging.Logger;

public class Bye {

    private static final Logger logger = Logger.getLogger(Bye.class.getName());

    public void saybye() {
        logger.info("Bye, World!");
    }
}
