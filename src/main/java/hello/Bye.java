package hello;

import java.util.logging.Logger;

public class Bye {

    private static final Logger logger = Logger.getLogger(this.getClass().getName());

    public void saybye() {
        logger.info("Bye, World!");
    }
}
