/**
 * @author Alexander Karg
 */
package a6;

/**
 * Abstrakteklasse von der die unterklassen Methoden Erben
 */
public abstract class Fahrzeug{

    /**
     * Klassenattribut
     */
    private int baujahr;

    /**
     * Konstruktor zum erstellen von einem Objekt Fahrzeug
     * @param _baujahr
     */
    public Fahrzeug(int _baujahr){
        this.setBaujahr(_baujahr);
    }

    /**
     * Setter Methode zum setzen des Wert im Attribut baujahr
     * @param baujahr
     */
    public void setBaujahr(int baujahr){
        this.baujahr = baujahr;
    }

    /**
     * Getter Methode zum abrufen des Wert im Attribut baujahr
     * @return
     */
    public int getBaujahr(){
        return this.baujahr;
    }

    /**
     * Abstrakte Methode ohne Programm Logik
     * Abstrakte Methoden werden an alle "Kinder" vererbt und müssen in in den "Kinder" klassen mit der Logik
     * gefüllt werden Logik kann sich bei mehreren "Kindern" unterscheiden
     */
    public abstract void fahre();

    /**
     * Methode zum erstellen eines String für die Ausgabe von den Klassenattributen
     * @return
     */
    public String toString(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("Bj. ").append(this.getBaujahr());
        return tmp.toString();
    }
}
