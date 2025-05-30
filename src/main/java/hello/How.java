package hello;

import java.util.logging.Logger;

public class How {

    private static final Logger logger = Logger.getLogger(this.getClass().getName());

    public void sayHow() {
        logger.info("How are you, World!");
    }
}
