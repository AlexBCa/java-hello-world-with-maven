import java.util.logging.Logger;

public class Anidados {

    private static final Logger logger = Logger.getLogger(Anidados.class.getName());

    public void checkConditions(int a, int b, int c, int d) {
        if (a > 10 && b < 5 && c == 0 && d != 7) {
            logger.info("Condition met: a > 10, b < 5, c == 0, and d != 7");
        }
    }
}
