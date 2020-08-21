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
                //Conversion of the first character of the string
                
            }else{
                encryptedText[i] = (int) (decompositedText[i].charAt(0) - decompositedText[i-1].charAt(0));
                //Conversion of the second character of the string.
            }
        }
        
        return encryptedText;
    }
    
    public static String decryptText(int[] encryptedText){
        char[] arrayCharacter = new char[encryptedText.length];
        String decryptedText;
        
        
        for(int i = 0; i < encryptedText.length; i++){
            if(i == 0){
                arrayCharacter[i] = (char)encryptedText[i];
                //decryption of the first character of the array.
                //basic function that converts int into character based on ASCII code.
            }else{
                int sumOfASCII = 0;
                for(int j = 0; j < i; j++){
                    
                    sumOfASCII = sumOfASCII + (char)encryptedText[j];
                    //in order to decrypt the character we need to know the sum of all the numbers previous to the number that we are getting
                }
                arrayCharacter[i] = (char)(encryptedText[i]+sumOfASCII);
                //we sum the number we got in the last loop and the number of the current array position.
                //This way, we can know which number we mut transform into character with the ASCII converter.
            }
            
        }
        decryptedText = String.valueOf(arrayCharacter);
        
        return decryptedText;
    }
}
