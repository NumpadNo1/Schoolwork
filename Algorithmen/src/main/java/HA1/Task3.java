package HA1;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("5%2 = " + 5%2);
        System.out.println(modSubtaskBandC(-5,2));
    }

    public static int modSubtaskA(int a, int b) {
        /* Vorbedingung prüfen! */
        if (b == 0) throw new ArithmeticException("Falsche Eingabe!");
        int x = a;
        while (x >= b)
            x = x - b;
        return x;
    }

    /**
     * Zu Subtask C:
     *
     * Algorithmus ist nicht total korrekt, da er nie terminiert.
     *
     * @param a
     * @param b
     * @return
     */
    public static int modSubtaskBandC(int a, int b) {
        /* Vorbedingung prüfen! */
        if (b == 0) throw new ArithmeticException("Falsche Eingabe!");
        int x = a;
        while (b > 0 && (x < 0 || x >= b)
                || b < 0 && (x > 0 || x <= b)
                || (a < 0 ^ b < 0)
                    && modSubtaskBandC(-a,b) == 0 ? x != 0 : x != b - modSubtaskBandC(-a,b)) {
            x = x - b;
        }
        return x;
    }
}