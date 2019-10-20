/**
 * @author Alexander Karg
 */
package a6;

/**
 *
 */
public class Programm {

    /**
     *
     * @param args0
     */
    public static void main(String[] args0){
        Kraftfahrzeug[] autoArr = new Kraftfahrzeug[2];
        autoArr[0] = new Kraftfahrzeug("Focus",0.065, 1995);
        autoArr[1] = new Kraftfahrzeug("Tesla",0.00, 1995);

        int km = 400;
        System.out.printf("Verbrauch auf %d km:%n",km);
        for(int i = 0; i < autoArr.length;i++){
            System.out.printf("%s: %.0f Liter %n",
                    autoArr[i].getModell(),
                    autoArr[i].verbrauch(km));
        }


        Fahrzeug[] fahrzeugArr = new Fahrzeug[2];
        fahrzeugArr[0] = new Kraftfahrzeug ("Golf", 0.065,1995);
        fahrzeugArr[1] = new Fahrrad(280,1974);
        for (int j = 0; j < 2; j++)
        {
            fahrzeugArr[j].fahre();
        }
    }
}
