package course.loops.forloop;

public class ForLoop {

    public static int summeRekursion(int n) {
        if (n <= 0) {
            return  0;
        } else {
            return  n + summeRekursion(n - 1);
        }
    }

    public static int summeForSchleife(int n) {
        int result = 0;
        for (int index = 0; index <= n; index++) {
            //f ((index % 2) != 0) {                   /* hiermit gebe ich eine Bedingung fest falls die Zahl ungerade ist */
            //    continue;                             /* continue bedeutet "überspringen" */
            if (index == 4) {                           //Gleichheitsoperator -> wenn index = 4, dann ...
                break;                                  //... wird die Schleife beendet
            }
            result += index;
        }
        return result;
    }

    public static int fibonacci(int n) {
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        /**
         *
         * for (3 Anweisungen) {
         *      Logik, die mehrfach ausgeführt wird
         * }
         * Summe von Zahlen von 0 bis n
         *
         * for (int i = 0; i <= n; i += 1) { oder zum Schluss i++
         *      i auf das bestehende Teilergbnis addieren
         * }
         *
         * Quadrat von 0 bis n = 2
         *
         * for (i = 0; 0 <= 2; i = 1) 1. Iteration
         *  Ergebnis = 0
         *
         * for (i = 1; 1 <= 2; i = 2) 2. Iteration
         *  Ergebnis = 1
         *
         * for (i = 2; 2 <= 2; i = 3) 3. Iteration
         *  Ergebnis = 4
         *
         * for (i = 3; 3 <= 2; ) 4. Iteration
         *  Abbruch
         *
         *
         */
        int a = 9;
        System.out.println("Schleife Fibonacci von 1 bis " + a + " ist: " + fibonacci(a));
        //int limit = 100;
        //System.out.println("Schleifen Summe von 0 bis " + limit + " ist: " + summeForSchleife(limit));
        //System.out.println("Rekursion Summe von 0 bis " + limit + " ist: " + summeRekursion(limit));
    }
}
