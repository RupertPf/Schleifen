package course.string;

public class MonthAsString {
    String lsMonth [] = new String[13];
    public MonthAsString() {
        lsMonth[0] = "";
        lsMonth[1] = " Januar ";
        lsMonth[2] = " Februar ";
        lsMonth[3] = " März ";
        lsMonth[4] = " April ";
        lsMonth[5] = " Mai ";
        lsMonth[6] = " Juni ";
        lsMonth[7] = " Juli ";
        lsMonth[8] = " August ";
        lsMonth[9] = " Septemper ";
        lsMonth[10] = " Oktober ";
        lsMonth[11] = " November ";
        lsMonth[12] = " Dezember";
    }
    private String getMonth(String str) {
        String strMonat = str.substring(3, 5);
        int iMonat = Integer.valueOf(strMonat);
        return lsMonth[iMonat];
    }
    public String monthAsString(String strDatum) {
        String m = getMonth(strDatum);
        return m;
    }
    public static void main(String[] args) {
        MonthAsString datum = new MonthAsString();
        String text = datum.monthAsString("06.09.2098");
        System.out.println("Der Monat ist der" + text);

    }
}