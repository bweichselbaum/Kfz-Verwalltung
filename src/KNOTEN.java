/**
 * Created by bweic on 23.06.2017.
 */
public class KNOTEN extends LISTENELEMENT{
    LISTENELEMENT nachfolger;
    DATENELEMENT daten;
    KNOTEN(LISTENELEMENT na, DATENELEMENT de){
        nachfolger = na;
        daten = de;
    }
    KNOTEN hintenEinfuegen(DATENELEMENT d){
        nachfolger = nachfolger.hintenEinfuegen(d);
        return this;

    }
    KNOTEN einfuegenVor(DATENELEMENT dneu, DATENELEMENT dvgl){
        if(daten == dvgl){
            KNOTEN kneu = new KNOTEN(this, dneu);
            return kneu;
        }else{
            nachfolger = nachfolger.einfuegenVor(dneu, dvgl);
            return this;
        }
    }
    KNOTEN sortiertEinfuegen(DATENELEMENT d){
        if(daten.istKleinerAls(d)){
            KNOTEN kneu = new KNOTEN(this, d);
            return kneu;
        }else{
            nachfolger = nachfolger.sortiertEinfuegen(d);
            return this;
        }
    }
    LISTENELEMENT knotenEntfernen(DATENELEMENT dvgl){
        if(daten == dvgl){
            return nachfolger;
        }else{
            nachfolger = nachfolger.knotenEntfernen(dvgl);
            return this;
        }
    }
    DATENELEMENT endeGeben(DATENELEMENT d){
        return nachfolger.endeGeben(daten);
    }
    LISTENELEMENT endeEntfernen(DATENELEMENT d_letzter){
        if(daten == d_letzter){
            return nachfolger;
        }else{
            nachfolger = nachfolger.endeEntfernen(d_letzter);
            return this;
        }
    }
    DATENELEMENT datenelementGeben(){
        return daten;
    }
    LISTENELEMENT nachfolgerGeben(){
        return nachfolger;
    }
    DATENELEMENT suchen(String vgl){
        if(daten.schluesselIstGleich(vgl)){
            return daten;
        }else{
            return nachfolger.suchen(vgl);
        }
    }
    String informationAusgeben(){
       nachfolger.informationAusgeben();
       return daten.infoAusgeben();
    }
    int restlaengeGeben(){
        return nachfolger.restlaengeGeben() +1;
    }
}
