/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differencecipher;

/**
 *
 * @author Pau
 */
public class DifferenceCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String originalText = Utils.readString();
        //Call a method to read a string
        
        String[] decompositedText = StringTreatment.decompositeString(originalText);
        //Call a method that will split the string into characters
        
        int[] encryptedText = Cipher.encryptText(decompositedText);
        //Encrypt text
        
        String decryptedText = Cipher.decryptText(encryptedText);
        //decrypt text and print it
        
        //Print result
        System.out.println("Texto: "+decryptedText);
    }
    
}
