package course.loops.whileLoop;

public class WhileLoop {

    public static long fakultaet(int n) {
        long result = 1;
        int a = 1;
        while (a <= n) {
            result *= a; //multipliziere die vorherige Zahl mit der aktuellen
            a++;
        }
        result = 0;
        for (int u = 1; u <= n; u++)
            result *= u;
        return result;
    }

    public static double aussenTemp() {
        return 30.0;
    }

    public static double temp() {
        while(aussenTemp() <= 30.0) {
            System.out.println("Temperatur ist okay");
        }
        System.out.println("Achtung die Außentemperatur ist größer 30 Grad!");

        for (;aussenTemp() <= 30.0;) {
            System.out.println("Temperatur ist okay");
        }
        System.out.println("Achtung die Außentemperatur ist größer 30 Grad!");
        return aussenTemp();
    }

    public static double array_summe(double [] arr) {
        int a = 0;
        double result2 = 0;
        while (a < arr.length) {
            result2 += arr[a];
            a++;
        }
        return result2;
    }

    public static int primeNumbers(int n) {
        int i = 2;
        while (i <= n) {
            boolean isPrimzahl = true;
            int j = 2;
            while (j < i && isPrimzahl == true) {
                if ((i % j) == 0) {
                    isPrimzahl = false;
                }
                j++;
            }
            if (isPrimzahl == true) {
                System.out.println(i + " ist eine Primzahl!");
            }
            if (i < n) {
                i++;
            }
        }
        return i;
    }

    public static int ggt(int n, int m) {
        if (n == 0) {
            return m;
        }
        while (m != 0) {
            if (n > m) {
                n = n - m;
            } else {
                m = m - n;
            }
        }
        return n;
    }

    public static void main(String[] args) {

        int n = 55;
        int m = 10;
        int a = n;
        int b = m;
        System.out.println("Der größte gemeinsame Teiler von " + a + " und " + b + " ist " + ggt(n,m));

        //int n = 20;
        //System.out.println(primeNumbers(n) + " ist eine Primzahl!");

        //double[] arr = {5.5, 6.1, 4.2, 4.9, 9,5};
        //System.out.println(array_summe(arr));
        /**
         *
         * while (eine Anweisung) {
         *
         * }
         *
         * Ausgabe von Quadratzahlen für alle Zahlen von 0 bis n
         *
         * while (a <= n) {
         *      Ausgabe von a*a (= Psuedocode)
         *      a++ (= a inkrementieren)
         * }
         *
         * n = 3
         *a = 0
         *
         * while (0 <= 3) 1. Iteration
         * wahr -> 0 * 0 = 0
         * a = 1
         *
         * while (1 <= 3) 2. Iteration
         *  wahr -> 1 * 1 = 1
         *  a = 2
         *
         * while (2 <= 3) 3. Iteration
         *  wahr -> 2 * 2 = 4
         *  a = 3
         *
         * while (3 <= 3) 4. Iteration
         *  wahr -> 3 * 3 = 9
         *  a = 9
         *
         * while (4 <= 3) 5. Iteration
         *  falsch -> Abbruch
         */
        //int n = 9;
        //System.out.println(n + "! = " + fakultaet(n));

    }

}
