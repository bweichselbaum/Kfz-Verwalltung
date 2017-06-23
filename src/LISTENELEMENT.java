/**
 * Created by bweic on 23.06.2017.
 */
public abstract class LISTENELEMENT{
    abstract KNOTEN hintenEinfuegen(DATENELEMENT d);
    abstract KNOTEN einfuegenVor(DATENELEMENT dneu, DATENELEMENT dvor);
    abstract KNOTEN sortiertEinfuegen(DATENELEMENT d);
    abstract LISTENELEMENT knotenEntfernen(DATENELEMENT dvgl);
    abstract DATENELEMENT endeGeben(DATENELEMENT d);
    abstract LISTENELEMENT endeEntfernen(DATENELEMENT d_letzter);
    abstract DATENELEMENT datenelementGeben();
    abstract LISTENELEMENT nachfolgerGeben();
    abstract DATENELEMENT suchen(String vgl);
    abstract String informationAusgeben();
    abstract int restlaengeGeben();
}

