
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sujeeban
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a alphabet");
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();
        
        if(alphabet.matches("A|E|I|O|U|a|e|i|o|u")){
            System.out.println("The alphabet is a vowel");
        }
        else if(sc.hasNextInt()){
            System.out.println("The alphabet is a number");
        }else{
            System.out.println("The alphabet is a consonant");
        }
    
    }
    
}
