/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package toString;

/**
 *
 * @author Pepe
 */
public class ToString { //TRIDA
        String jmeno = "Karel";
        String prijmeni = "Novak";
        int delkaStudia = 3;

    public ToString() {//KONSTRUKTOR 1
    }

    public ToString(String jmeno, String prijmeni,int delkaStudia) { //KONSTRUKTOR 2
        this.delkaStudia = delkaStudia;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }


    public int getDelkaStudia() { //getter
        return delkaStudia;
    }

    public void setDelkaStudia(int delkaStudia) { //SETTER
        this.delkaStudia = delkaStudia;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    
    
    public String toString(){ //METODA toString
        String retVal = "Student ";
        retVal += jmeno + " ";
        retVal += prijmeni + "\nStuduje ";
        retVal += delkaStudia + " roky";

        return retVal;
        
    }
    
    public static void main(String[] args) {
    
        ToString student = new ToString();//vytvoření objektu podle konstruktoru 1
        ToString student2 = new ToString("Jan", "Stary", 2);//vytvoření objektu podle konstruktoru 2
        System.out.println(student.toString());
        System.out.println(student2.toString());
    }
}
