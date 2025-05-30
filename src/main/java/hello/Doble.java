import java.util.logging.Logger;

public class Doble {

    private static final Logger logger = Logger.getLogger(this.getClass().getName());

    public void checkConditions(int a, int b, int c, int d) {
        // Bloque 1: Totalmente anidado
        if (a > 10 && b < 5 && c == 0 && d != 7) {
            logger.info("Condition met: a > 10, b < 5, c == 0, and d != 7");
        }
        // Bloque 2: No anidado
        if (a < 0) {
            logger.info("Condition met: a < 0");
        }
        // Bloque 3: Mixto
        if (a > 0 && b == 3) {
            logger.info("Condition met: a > 0 and b == 3");
        }
    }
}
