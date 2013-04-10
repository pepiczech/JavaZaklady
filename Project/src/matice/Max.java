/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matice;

/**
 *
 * @author Pepe
 */
public class Max extends Matice {//vložit do třídy matice->



    public void najdiMax(){
        int max = Integer.MIN_VALUE;
        int maxi, maxj;

        for(int i = 0; i<matice.length; i++){
            for (int j = 0; j<matice[0].length;j++){
                if (max< matice[i][j]){
                    max = matice[i][j];
                }
            }
        }

        System.out.println("maximum = " + max);
    }
    public void najdiMin(){
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i<matice.length; i++){
            for (int j = 0; j<matice[0].length;j++){
                if (min> matice[i][j]){
                    min = matice[i][j];
                    }
            }
        }
        
        System.out.println("maximum = " + min);
    }
    public void prohozeniMinMax(){
        int max = Integer.MIN_VALUE;
        int maxi = 0;
        int maxj = 0;
        int min = Integer.MAX_VALUE;
        int mini = 0;
        int minj = 0;
        int pom;

        for(int i = 0; i<matice.length; i++){
            for (int j = 0; j<matice[0].length;j++){
                if (max< matice[i][j]){
                    max = matice[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        for(int i = 0; i<matice.length; i++){
            for (int j = 0; j<matice[0].length;j++){
                if (min> matice[i][j]){
                    min = matice[i][j];
                    mini = i;
                    minj = j;
                }
            }
        }
        pom = min;
        matice[mini][minj] = max;
        matice[maxi][maxj] = pom;
        
        
    }


}
