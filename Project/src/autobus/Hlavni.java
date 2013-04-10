/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autobus;

/**
 *
 * @author Pepe
 */
public class Hlavni {
    public static void main(String[] args) {
        Zastavka grand = new Zastavka (10);
        Zastavka tesco = new Zastavka (8);
        Zastavka hradecka = new Zastavka (51);

        Autobus karosa = new Autobus(50);
        
        karosa.nastupovani(grand.getPocetCestujicich());
        karosa.nastupovani(tesco.getPocetCestujicich());
        karosa.nastupovani(hradecka.getPocetCestujicich());

    }

}
