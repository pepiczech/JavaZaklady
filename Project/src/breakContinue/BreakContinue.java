/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package breakContinue;

/**
 *
 * @author Pepe
 */
public class BreakContinue {
 
    public static void main(String[] args) {
        
        for(int i = 0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("");
        for(int i = 0; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i + " ");
        }
    }

}
