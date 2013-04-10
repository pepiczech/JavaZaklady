/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cykly;

/**
 *
 * @author Pepe
 */
public class cykly {
    public static void main(String[] args) {
        int i = 11;
        int I = 11;
        int j = 13;
        int k = 9;
        int max;

        if (i>j && i>k){                                //IF
            max = i;
        } else if (j>k) {
            max = j;
        } else {
            max = k;
        }
        System.out.println("maximum: " + max);

        for (int a = 0; a <= j; a++) {                    //FOR
            System.out.print(a + " ");
        }
        System.out.println("");
        while (i<max){                                      //WHILE
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        do{                                                 //DO WHILE
            System.out.print(I + " ");
            I++;

        }while(I<max);


    }

}
