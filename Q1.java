/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sujeeban
 */
public class Q1 {
    public static void main(String args[]){
    int num = 12345;
    int reversed = 0;
    
    while(num !=0){
    int digit = num% 10;
    reversed = reversed * 10 + digit;
    num /= 10;
    }
        System.out.println("Reversec"
                + "d number is " + reversed);
    
    }
    
}
