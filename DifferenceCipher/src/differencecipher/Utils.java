/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differencecipher;
import java.util.Scanner;

/**
 *
 * @author Pau
 */
public class Utils {
    
    public static String readString(){
        String originalText;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        originalText = scan.nextLine();
        return originalText;
    }
    
    
    
    
    
    
}