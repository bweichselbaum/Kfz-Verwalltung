/**
 * Created by bweic on 23.06.2017.
 */
public class Kunde {

    static String vorname;
    static String nachname;
    static int alter;
    static String gebu;
    static int nummer;
    static boolean vip;

    public static void main(String[] args){
        Kunde k1 = new Kunde("Dieter", "Kotz", 50, "20.10.1966", 1001, true);
        System.out.println(k1.datenausgeben());
    }

    Kunde(String vn, String nn, int alt, String gb, int num, boolean vipeingabe){
        vorname = vn;
        nachname = nn;
        alter = alt;
        gebu = gb;
        nummer = num;
        vip = vipeingabe;
    }

    public static String datenausgeben(){
        return "Name: " + vorname + " " + nachname + "; Alter: " + alter +
                "; Geburtsdatum: " + gebu + "; Kundennummer: " + nummer + "; VIP?: " + vip;
    }

}
