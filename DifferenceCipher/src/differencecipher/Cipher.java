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
public class Cipher {
    public static int[] encryptText(String[] decompositedText){
        int[] encryptedText = new int[decompositedText.length];
        
        for(int i = 0; i < decompositedText.length; i++){
            if(i == 0){
                encryptedText[i] = (int) decompositedText[i].charAt(0);
            }else{
                encryptedText[i] = (int) (decompositedText[i].charAt(0) - decompositedText[i-1].charAt(0));
            }
        }
        
        return encryptedText;
    }
    
    public static String decryptText(int[] encryptedText){
        char[] arrayCharacter = new char[encryptedText.length];
        String decryptedText;
        int sumOfASCII = 0;
        
        for(int i = 0; i < encryptedText.length; i++){
            if(i == 0){
                arrayCharacter[i] = (char)encryptedText[i];
            }else{
                for(int j = 0; j < i; j++){
                    sumOfASCII = sumOfASCII + (char)encryptedText[j];
                }
                arrayCharacter[i] = (char)(encryptedText[i]+sumOfASCII);
                sumOfASCII = 0;
            }
            
        }
        decryptedText = String.valueOf(arrayCharacter);
        System.out.println("Texto: "+decryptedText);
        
        return decryptedText;
    }
}
