/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scan;

import java.util.Scanner;

/**
 *
 * @author Pepe
 */
public class Scan {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cislo;
        String retezec;
      
        System.out.println ("zadejte cislo: ");
        cislo = sc.nextInt();
        System.out.println("zadejte retezec: ");
        retezec = sc.next();

        System.out.println("Zadane cislo = " + cislo);
        System.out.println("Zadany retezec = " + retezec);


    }
}
