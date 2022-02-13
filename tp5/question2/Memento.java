package question2;
import java.util.*;

/**
 * Write a description of class Memento here.
 *
 * @author Samira Rahme
 * @version (a version number or a date)
 */
public class Memento
{
     private List mementoListe;

    public Memento(List mementoListe){
        this.mementoListe = mementoListe;
    }

    public List getMementoListe(){
        return mementoListe;
    }

}
