package hello;

import java.util.logging.Logger;

public class How {

    private static final Logger logger = Logger.getLogger(How.class.getName());

    public void sayHow() {
        logger.info("How are you, World!");
    }
}
