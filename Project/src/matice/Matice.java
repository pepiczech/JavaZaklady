/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matice;

import java.util.Random;

/**
 *
 * @author Pepe
 */
public class Matice {
    
        Random cislo = new Random();
        int [][] matice;
        int x,y;

public Matice() {

}

public Matice(int x, int y){
    this.x = x;
    this.y = y;
    matice = new int[x][y];
}

public void nactiMatici(){
        for (int i = 0; i<matice.length; i++){
            for (int j = 0; j<matice[0].length; j++){
                matice[i][j] = cislo.nextInt(10);
            }
        }
}
public void vypisMatici(){
        for (int i = 0; i<matice.length; i++){
            for (int j = 0; j<matice[0].length; j++){
                System.out.print(matice[i][j] + " ");
            }
            System.out.println("");
        }
}
//public String toString(){ //METODA toString
//        String retVal = "MATICE:\n ";
//
//        for (int i = 0; i<matice.length; i++){
//            for (int j = 0; j<matice[0].length; j++){
//                retVal += matice[i][j];
//            }
//            retVal += "\n ";
//        }
//        return retVal;
//
//    }
// public void prohozeniMinMax(){
//        int max = Integer.MIN_VALUE;
//        int maxi = 0;
//        int maxj = 0;
//        int min = Integer.MAX_VALUE;
//        int mini = 0;
//        int minj = 0;
//        int pom;
//
//        for(int i = 0; i<matice.length; i++){
//            for (int j = 0; j<matice[0].length;j++){
//                if (max< matice[i][j]){
//                    max = matice[i][j];
//                    maxi = i;
//                    maxj = j;
//                }
//            }
//        }
//        for(int i = 0; i<matice.length; i++){
//            for (int j = 0; j<matice[0].length;j++){
//                if (min> matice[i][j]){
//                    min = matice[i][j];
//                    mini = i;
//                    minj = j;
//                }
//            }
//        }
//        pom = min;
//        matice[mini][minj] = max;
//        matice[maxi][maxj] = pom;
//
//
//    }
//public void najdiMax(){
//        int max = Integer.MIN_VALUE;
//
//        for(int i = 0; i<matice.length; i++){
//            for (int j = 0; j<matice[0].length;j++){
//                if (max< matice[i][j]){
//                    max = matice[i][j];
//                }
//            }
//        }
//        System.out.println("maximum = " + max);
//    }
//public void nactiMatici2(){
//    Random random = new Random();
//
//    for (int i = 0;i<matice.length-1;i++) {
//            for(int j=0 ;j<matice[0].length-1;j++){
//            matice[i][j]=random.nextInt(10);
//            }
//    }
//}
//
//public void vypisMatici2(){
//    for (int i = 0;i<matice.length;i++) {
//            for(int j=0 ;j<matice[0].length;j++){
//                System.out.format("%3d",matice[i][j]);
//            }
//            System.out.println("");
//    }
//}
// public void soucetRadku(){
//
//    int soucet =0;
//
//    for (int i = 0;i<matice.length-1;i++) {
//        for(int j=0 ;j<matice[0].length-1;j++){
//            soucet += matice[i][j];
//        }
//        matice[i][matice[0].length-1] = soucet;
//        soucet = 0;
//    }
//  }
// public void soucetSloupcu() {
//     int soucet2 = 0;
//     for (int j = 0;j<matice[0].length;j++) {
//            for (int i=0;i<matice.length-1;i++) {
//            soucet2+= matice[i][j];
//            matice [matice.length-1][j] = soucet2;
//            }
//            soucet2=0;
//        }
// }
// public void celkovySoucet(){
//     int soucet = 0;
//     for (int i = 0;i<matice.length-1;i++) {
//        for(int j=0 ;j<matice[0].length-1;j++){
//            soucet += matice[i][j];
//        }
//     }
//    matice [matice.length-1][matice[0].length-1] = soucet;
//
// }
//
}
