import java.util.logging.Logger;

public class Nif {

    private static final Logger logger = Logger.getLogger(Nif.class.getName());

    public void checkConditions(int a, int b, int c) {
        if (a > 10 && b < 5) {
            logger.info("Condition met: a > 10 and b < 5");
        }
    }
}
