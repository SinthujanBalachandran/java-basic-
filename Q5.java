
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
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner  sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        for(int i=1;i<=m;i++){
            if(m%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
