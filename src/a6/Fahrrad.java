/**
 * @author Alexander Karg
 */
package a6;

/**
 * Klasse Fahrrad die von der Abstrakten Klasse Fahrzeug Erbt
 */
public class Fahrrad extends Fahrzeug{

    /**
     * Klassenattribut
     */
    public double laengeinzoll;

    /**
     * Konstruktor zum erstellen von einem Objekt Fahrrad
     * super Konstruktor wird mit aufgerufen surch das Schlüsselwort super()
     * @param laengeinzoll
     * @param baujahr
     */
    public Fahrrad(int laengeinzoll, int baujahr){
        super(baujahr);
        this.setLaengeinzoll(laengeinzoll);
    }

    /**
     * Setter Methode zum setzen des Wert im Attribut laengeinzoll
     * @param _laengeinzoll
     */
    public void setLaengeinzoll(double _laengeinzoll){
        this.laengeinzoll = _laengeinzoll;
    }

    /**
     * Getter Methode zum abrufen des Wert im Attribut laengeinzoll
     * @return
     */
    public double getLaengeinzoll(){
        return this.laengeinzoll;
    }

    /**
     * Geerbte Methode aus der Klasse Fahrzeug
     */
    @Override
    public void fahre() {
        System.out.println("Antreten");
    }

    /**
     * Geerbte Methode zum erstellen eines String für die Ausgabe von den Klassenattributen
     * @return
     */
    public String toString(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("Bj. "+this.getBaujahr()).append(this.getLaengeinzoll()+" Zoll");
        return tmp.toString();
    }
}
