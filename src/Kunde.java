/**
 * Created by bweic on 23.06.2017.
 */
public class Kunde implements DATENELEMENT{
    static String vorname;
    static String nachname;
    static int alter;
    static String gebu;
    static int nummer;
    static String vip;

    Kunde(String vn, String nn, int alt, String gb, int num, String vipeingabe){
        vorname = vn;
        nachname = nn;
        alter = alt;
        gebu = gb;
        nummer = num;
        vip = vipeingabe;
    }
    public String infoAusgeben(){
         return "Name: " + vorname + " " + nachname + "; Alter: " + alter +
                "; Geburtsdatum: " + gebu + "; Kundennummer: " + nummer + "; VIP?: " + vip + "\n";
    }
    public boolean istKleinerAls(DATENELEMENT dvgl){
        Kunde p = (Kunde) dvgl;
        if(nachname.compareTo(p.nachname) < 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean schluesselIstGleich(String vgl){
        if(nachname == vgl){
            return true;
        }else{
            return false;
        }
    }
}
