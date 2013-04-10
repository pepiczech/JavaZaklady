/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.util.Scanner;



/**
 *
 * @author Pepe
 */
public class Matice {

    int [][] pole;
    int x,y;
    Scanner sc = new Scanner(System.in);

    public Matice(int x, int y) {
        this.x = x;
        this.y = y;
        pole = new int[x][y];
    }

    public void nactiMatici(){
        for (int i = 0; i<pole.length;i++){
            for (int j = 0; j<pole[0].length;j++){
                System.out.print("Zadej prvek pole ");
                pole[i][j] = sc.nextInt();
            }
        }

    }
    public void vypisMatici(){
        for (int i = 0; i<pole.length;i++){
            for (int j = 0; j<pole[0].length;j++){
                System.out.print(pole[i][j] + " ");
            }
            System.out.println("");
        }

    }




   


}
