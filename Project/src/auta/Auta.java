/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package auta;

/**
 *
 * @author Pepe
 */
public class Auta {

    String znacka= "nezadano";
    String typ = "nezadano";
    int spotreba = 0;
    int objemNadrze = 0;

public Auta(){ //KONSTRUKTOR (ALT+INSERT)

}
public Auta(String znacka, String typ){
    this.znacka = znacka;
    this.typ = typ;
   }
public Auta(String znacka, String typ, int spotreba,int objemNadrze){
    this.znacka = znacka;
    this.objemNadrze = objemNadrze;
    this.spotreba = spotreba;
    this.typ = typ;
   }


public void setObjemNadrze(int objemNadrze) { //setter
        if (objemNadrze > 0) {
        this.objemNadrze = objemNadrze;
        }
    }
public int getObjemNadrze() {//getter
        return objemNadrze;
    }


public void setSpotreba(int spotreba) {
        if (spotreba > 0) {
        this.spotreba = spotreba;
        }
    }
public int getSpotreba() {
        return spotreba;
    }


public int vypoctiDojezd(){ //METODA
    int dojezd = 0;
    dojezd = (getObjemNadrze() /getSpotreba())*100;

    return dojezd;
}

    @Override
public String toString(){
    String retVal = "Znacka: ";
        retVal += znacka + "\nTyp: ";
        retVal += typ + "\nSpotřeba ";
        retVal += spotreba + " l/100km \nObjem nádrže ";
        retVal += objemNadrze + "\nDojezd ";
        retVal += vypoctiDojezd() + "km";

    return retVal;
}

}
