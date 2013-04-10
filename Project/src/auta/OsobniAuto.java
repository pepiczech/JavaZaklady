/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package auta;

/**
 *
 * @author Pepe
 */
public class OsobniAuto extends Auta {
    
    int maxRychlost = 0;

    public OsobniAuto(){

    }
    public OsobniAuto(String znacka, String typ,int maxRychlost){
        super(znacka,typ);
        this.maxRychlost = maxRychlost;

    }
    public OsobniAuto(String znacka, String typ, int spotreba, int objemNadrze){
        super(znacka,typ, spotreba, objemNadrze);

    }
    public OsobniAuto(String znacka, String typ, int spotreba, int objemNadrze,int maxRychlost){
        super(znacka,typ, spotreba, objemNadrze);
        this.maxRychlost = maxRychlost;

    }



    @Override
    public String toString(){
    String retVal = super.toString();
        retVal += "\nmaximální rychlost: ";
        retVal += maxRychlost ;


    return retVal;
}
}
