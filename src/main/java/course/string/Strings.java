package course.string;

public class Strings {


    //      [i][c][h][][l][e][r][n][e] = 9
    //      [][J][a][v][a] = 5
    //      [][][][][][][][][][][][][][] ----> 14 Felder werden im Speicher reserviert
    //      [i][c][h][][l][e][r][n][e][][J][a][v][a] ---> Felder werden befüllt
    //      diese Variante ist relativ aufwändig und bei 10.000enden wird es sehr langsam
    //String str = "ich lerne" + "Java";

    //bessere Variante ist StringBuilder ---> Hier wird einfach hinzugefügt und
    //nicht ein ein neuer Speicherplatz belegt.
    //StringBuilder strB = new StringBuilder("ich lerne");
    //strB.append(" Java");
    public static void addString(int limit) {
        String result1 = "";
        for(int i = 0; i < limit; i++) {
            result1 += "Java";
        }
        System.out.println(result1);
    }

    public static void appendString(int limit) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            result.append("abc");
        }
        System.out.println(result);
    }


    public static String revert(String str) { //in: Java => avaJ
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        //System.out.println("Test => " + revert("test"));
        /**
         *
         * Objekt Datentyp, komplexer Datentyp
         *
         * Ein Stringobjekt ist eine Zeichenkette
         * "ich lerne Java" ---> [i][c][h]....[a]
         *
         */
        //addString(1000000);
        //appendString(10000);
        //System.out.println("Java => " + revert("Java"));
        //System.out.println("java".toUpperCase());
    }


}
