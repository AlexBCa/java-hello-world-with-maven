public class Doble {
    public void checkConditions(int a, int b, int c, int d) {
        
        // Bloque 1: Totalmente anidado
        if (a > 10) {
            if (b < 5) {
                if (c == 0) {
                    if (d != 7) {
                        System.out.println("Condition met: a > 10, b < 5, c == 0, and d != 7");
                    }
                }
            }
        }

        // Bloque 2: No anidado
        if (a < 0) {
            System.out.println("Condition met: a < 0");
        }

        // Bloque 3: Mixto
        if (a > 0) {
            if (b == 3) {
                System.out.println("Condition met: a > 0 and b == 3");
            }
        }
    }
}
