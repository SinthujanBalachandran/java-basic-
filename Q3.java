/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sujeeban
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 1;
        int m=10;
        int t1=0, t2=1;
        
        do{
            int sum = t1+t2;
            t1=t2;
            t2=sum;
            i++;
            
            System.out.print(t1 + ",");   
        }while(i<=m);
    }

}
