/**
 * Created by bweic on 23.06.2017.
 */
public class LISTE{
    LISTENELEMENT anfang;
    LISTE(){
        anfang = new ABSCHLUSS();
    }
    void vorneEinfuegen(DATENELEMENT d){
        KNOTEN kn = new KNOTEN(anfang, d);
        anfang = kn;
    }
    void hintenEinfuegen(DATENELEMENT d){
        anfang = anfang.hintenEinfuegen(d);
    }
    void einfuegenVor(DATENELEMENT dneu, DATENELEMENT dvor){
        anfang = anfang.einfuegenVor(dneu, dvor);
    }
    void sortiertEinfuegen(DATENELEMENT d){
        anfang = anfang.sortiertEinfuegen(d);
    }
    void knotenEntfernen(DATENELEMENT dvgl){
        anfang.knotenEntfernen(dvgl);
    }
    DATENELEMENT anfangEntfernen(){
        DATENELEMENT d = anfang.datenelementGeben();
        anfang = anfang.nachfolgerGeben();
        return d;
    }
    DATENELEMENT endeEntfernen(){
        DATENELEMENT d_letzter = anfang.endeGeben(null);
        anfang.endeEntfernen(d_letzter);
        return d_letzter;
    }
    DATENELEMENT suchen(String vgl){
        return anfang.suchen(vgl);
    }
    String informationAusgeben(){
       return anfang.informationAusgeben();
    }
    int laengeGeben(){
        return anfang.restlaengeGeben();
    }
}

