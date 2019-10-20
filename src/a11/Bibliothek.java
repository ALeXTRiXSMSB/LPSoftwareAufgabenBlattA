/**
 * @author Alexander Karg
 */
package a11;


/**
 * Klasse mit Programmeinstiegspunkt Main
 */
class Bibliothek {

    /**
     * Einstiegspunkt für das Programm
     * 1) Erstellen eines Arrays vom Typ Medium
     * 2) Füllen des Arrays mit Objekten vom Typ Buch, CD und Zeitschrift das ist
     * möglich, weil die Objekte von Medium erben
     * 3) Ausgabe der Daten vom Medium i mit der Abstrakten Methode calculateRepresentation
     * @param args0
     */
    public static void main(String[] args0){
        Medium[] medienArr = new Medium[3];
        medienArr[0] = new Buch("Duden 01. Die deutsche Rechtschreibung",2004,"Bibliographisches Institut, Mannheim","3-411-04013-0","-");
        medienArr[1] = new CD("1","Apple (Bea(EMI))","The Beatles");
        medienArr[2] = new Zeitschrift("Der Spiegel","0038-7452","54",6);

        for (Medium aMedienArr : medienArr) {
            System.out.println(aMedienArr.calculateRepresentation());
        }
    }
}
