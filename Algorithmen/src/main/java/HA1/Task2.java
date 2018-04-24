package HA1;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(function(2, 4));
    }

    public static int function(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("input < 0 is not allowed.");
        } else if (a == 1 || b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        }else {
            int result = a;
            while (b > 1) {
                result *= a;
                b--;
            }
            return result;
        }
    }
}
