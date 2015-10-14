
package vektory;

import java.util.Scanner;

/**
 *
 * @author david.lukes1
 */
public class Vektory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner vstup = new Scanner(System.in);
         System.out.print("vlož počet vektorů: ");
         int pocet = vstup.nextInt();
         for (int i=1; i<=pocet; i++) {
             System.out.print("Vektor: "+i+":");
             System.out.print("První složka: ");
             int a = vstup.nextInt();
             System.out.print("Druhá složka: ");
             int b = vstup.nextInt();
             System.out.println("Velikost vektoru: "+
                     Math.sqrt(a*a)+(b*b));
         }
    }
    
}
