/**
 * @author Alexander Karg
 */
package a6;

/**
 * Klasse Kraftfahrzeug die von der Abstrakten Klasse Fahrzeug Erbt
 */
public class Kraftfahrzeug extends Fahrzeug{

    /**
     * Klassenattribute
     */
    private String modell;
    private double verbrauchProKilometer;

    /**
     * Konstruktor zum erstellen von einem Objekt Kraftfahrzeug
     * super Konstruktor wird mit aufgerufen surch das Schlüsselwort super()
     * @param _modell
     * @param _verbrauchProKilometer
     * @param _baujahr
     */
    public Kraftfahrzeug(String _modell, double _verbrauchProKilometer, int _baujahr){
        super(_baujahr);
        this.setModell(_modell);
        this.setVerbrauchProKilometer(_verbrauchProKilometer);
    }

    /**
     * Getter Methode zum abrufen des Wert im Attribut modell
     * @return
     */
    public String getModell() {
        return modell;
    }

    /**
     * Setter Methode zum setzen des Wert im Attribut modell
     * @param modell
     */
    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Getter Methode zum abrufen des Wert im Attribut verbrauchProKilometer
     * @return
     */
    public double getVerbrauchProKilometer() {
        return verbrauchProKilometer;
    }

    /**
     * Setter Methode zum setzen des Wert im Attribut verbrauchProKilometer
     * @param verbrauchProKilometer
     */
    public void setVerbrauchProKilometer(double verbrauchProKilometer) {
        this.verbrauchProKilometer = verbrauchProKilometer;
    }


    /**
     * Klassenmethode Verbrauch berechnet den Verbrauch des jeweiligen Kraftfahrzeug
     * @param km
     * @return
     */
    public double verbrauch(int km){
        return km*this.getVerbrauchProKilometer();
    }

    /**
     * Geerbte Methode aus der Klasse Fahrzeug
     */
    @Override
    public void fahre() {
        System.out.println("Fahre");
    }

    /**
     * Geerbte Methode zum erstellen eines String für die Ausgabe von den Klassenattributen
     * @return
     */
    public String toString(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("Bj. " + this.getBaujahr()).append(this.getModell()).append(this.getVerbrauchProKilometer());
        return tmp.toString();
    }
}
