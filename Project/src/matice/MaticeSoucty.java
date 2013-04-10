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
public class MaticeSoucty extends Matice {

public void nactiMatici2(){

    Random random = new Random();

    for (int i = 0;i<matice.length-1;i++) {
            for(int j=0 ;j<matice[0].length-1;j++){
            matice[i][j]=random.nextInt(10);
            }
    }
}

public void vypisMatici2(){
    for (int i = 0;i<matice.length;i++) {
            for(int j=0 ;j<matice[0].length;j++){
                System.out.format("%3d",matice[i][j]);
            }
            System.out.println("");
    }
}
 public void soucetRadku(){

    int soucet =0;

    for (int i = 0;i<matice.length-1;i++) {
        for(int j=0 ;j<matice[0].length-1;j++){
            soucet += matice[i][j];
        }
        matice[i][matice[0].length-1] = soucet;
        soucet = 0;
    }
  }
 public void soucetSloupcu() {
     int soucet2 = 0;
     for (int j = 0;j<matice[0].length;j++) {
            for (int i=0;i<matice.length-1;i++) {
            soucet2+= matice[i][j];
            matice [matice.length-1][j] = soucet2;
            }
            soucet2=0;
        }
 }
 public void celkovySoucet(){
     int soucet = 0;
     for (int i = 0;i<matice.length-1;i++) {
        for(int j=0 ;j<matice[0].length-1;j++){
            soucet += matice[i][j];
        }
     }
    matice [matice.length-1][matice[0].length-1] = soucet;

 }

}

//    public void soucetSloupcu(){
//
//        int soucet =0;
//        int min = 0, mini = 0,minj = 0, max = 0, maxi = 0, maxj = 0;
//        Random random = new Random();

//        for (int i = 0;i<matice.length-1;i++) {
//            for(int j=0 ;j<matice[0].length-1;j++){
//            matice[i][j]=random.nextInt(100);
//            soucet += matice[i][j];
////            celkovySoucet+= matice[i][j];
//
//            if(matice[i][j]<min){
//            min=matice[i][j];
//            mini=i;
//            minj=j;
//            }
//            if(matice[i][j]>max){
//            max=matice[i][j];
//            maxi=i;
//            maxj=j;
//            }
//            }
//
//            matice[i][matice[0].length-1] = soucet;
//            soucet = 0;
//        }
//    }


