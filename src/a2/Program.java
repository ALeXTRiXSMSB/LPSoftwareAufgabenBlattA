package a2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args0) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein die Größer als 0 ist");
        String eingabe = input.nextLine();
        try{
            if(Integer.parseInt(eingabe) > 0) {
                int[] zahlenarr = new int[Integer.parseInt(eingabe)];
                for (int i = 0; i < zahlenarr.length; i++) {
                    zahlenarr[i] = (i + 1);
                }
                for (int i = 0; i < zahlenarr.length; i++) {
                    System.out.println("Wurzel der Zahl: " + (i + 1) + " ist: " + Math.sqrt(zahlenarr[i]));
                }
                double mittelwert = 0;
                for (int i = 0; i < zahlenarr.length; i++) {
                    mittelwert += zahlenarr[i];
                }
                System.out.println("Mittelwert: " + mittelwert/zahlenarr.length);
            }
            else{
                System.out.println("Es wurde eine Zahl kleiner oder gleich 0 eingegeben");
                System.out.println("Bitte noch mal");
                Program.main(null);
            }
        }catch(NumberFormatException e){
            System.out.println("Es wurde keine ganze Zahl eingegeben");
            System.out.println("Bitte noch mal");
            Program.main(null);
        }
    }
}
