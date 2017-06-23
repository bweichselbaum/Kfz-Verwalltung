/**
 * Created by bweic on 23.06.2017.
 */
public class ABSCHLUSS extends LISTENELEMENT{
    ABSCHLUSS(){
    }
    KNOTEN hintenEinfuegen(DATENELEMENT d){
        KNOTEN kneu = new KNOTEN (this, d);
        return kneu;
    }
    KNOTEN einfuegenVor(DATENELEMENT dneu, DATENELEMENT dvor){
        KNOTEN kneu = new KNOTEN (this, dneu);
        return kneu;
    }
    KNOTEN sortiertEinfuegen(DATENELEMENT d){
        return new KNOTEN(this, d);
    }
    LISTENELEMENT knotenEntfernen(DATENELEMENT dvgl){
        return this;
    }
    DATENELEMENT endeGeben(DATENELEMENT d){
        return d;
    }
    LISTENELEMENT endeEntfernen(DATENELEMENT d_letzter){
        return null;
    }
    DATENELEMENT datenelementGeben(){
        return null;
    }
    LISTENELEMENT nachfolgerGeben(){
        return null;
    }
    DATENELEMENT suchen(String vgl){
        return null;
    }
    String informationAusgeben(){
        return "Ende der Liste";
    }
    int restlaengeGeben(){
        return 0;
    }
}

