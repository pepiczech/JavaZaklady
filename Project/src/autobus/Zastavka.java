/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autobus;

/**
 *
 * @author Pepe
 */
public class Zastavka {

    int pocetCestujicich = 0;

    public Zastavka() {
    }

    public Zastavka(int pocetCestujicich) {
        this.pocetCestujicich = pocetCestujicich;
    }

    public int getPocetCestujicich() {
        return pocetCestujicich;
    }

    public void setPocetCestujicich(int pocetCestujicich) {
        this.pocetCestujicich = pocetCestujicich;
    }


}
