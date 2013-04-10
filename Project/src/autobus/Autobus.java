/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autobus;

/**
 *
 * @author Pepe
 */
public class Autobus {

    int pocetMist = 50;
    int pocetCestujicich = 0;
    int obsazenychMist = 0;


    public Autobus(int pocetMist) {
        this.pocetMist = pocetMist;
    }

    public int getObsazenychMist() {
        return obsazenychMist;
    }

    public void setObsazenychMist(int obsazenychMist) {
        this.obsazenychMist = obsazenychMist;
    }

    public int getPocetCestujicich() {
        return pocetCestujicich;
    }

    public void setPocetCestujicich(int pocetCestujicich) {
        this.pocetCestujicich = pocetCestujicich;
    }

    public int getPocetMist() {
        return pocetMist;
    }

    public void setPocetMist(int pocetMist) {
        this.pocetMist = pocetMist;
    }
    public void nastupovani(int pocetCestujicich) {
        this.pocetCestujicich = pocetCestujicich;

        if (pocetCestujicich <= (getPocetMist()-getObsazenychMist())){

            setObsazenychMist(getObsazenychMist() + pocetCestujicich);
            System.out.println("nastoupilo všech " + pocetCestujicich + " cestujicich");

        }else {

            int pocetNastupujicich = getPocetMist() - getObsazenychMist();
            int pocetCekajicich = pocetCestujicich - pocetNastupujicich;
            setObsazenychMist(getPocetMist());
            System.out.println("Muze nastoupit " + pocetNastupujicich + "cestujicich");
            System.out.println("Na dalsi autobus musi pockat " + pocetCekajicich + " cestujicich");

        }

    }



}
