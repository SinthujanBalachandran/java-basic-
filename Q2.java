/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sujeeban
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1;
        
        for(int i = 1;i<=num;++i){
            factorial = factorial*i;
        }
        System.out.printf("Factorial of no %d = %d",num,factorial);
    }
    
}
