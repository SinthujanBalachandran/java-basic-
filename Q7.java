
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Enter word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
                char[] inputArray = word.toCharArray();
                int countVow = 0;
                int countCon = 0;
                
                for(char i :inputArray){
                   // if(i.matches("A|E|I|O|U|a|e|i|o|u"){
                    System.out.println(i);
                    }
                    
                
                }

    }
    

