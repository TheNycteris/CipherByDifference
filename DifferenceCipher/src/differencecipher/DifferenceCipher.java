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
        
        String[] decompositedText = StringTreatment.decompositeString(originalText);
        
        int[] encryptedText = Cipher.encryptText(decompositedText);
        
        String decryptedText = Cipher.decryptText(encryptedText);
    }
    
}
