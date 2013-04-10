/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

import java.util.Random;

/**
 *
 * @author Pepe
 */
public class Rand {
    public static void main(String[] args) {
        Random ran = new Random();
        int cislo = ran.nextInt(10);//nah.cisla od 0 do 9
        int cislo2 = (ran.nextInt(10))+3;//nah cislo od 3 do 12

        System.out.println(cislo);
        System.out.println(cislo2);


    }

}
