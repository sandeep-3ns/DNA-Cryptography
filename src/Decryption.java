
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep kumar
 */
public class Decryption {

    /**
     * @param args the command line arguments
     */
    static Files f = new Files();
    

    public static void main(String[] args) throws IOException {
    
        //ENCRYPTION
        
        String binary = f.toBinaryForm("Hello world");
        System.out.println(binary);
        String dna_text = f.toLevel1(binary);
        System.out.println(dna_text);
        String hex_text = f.toLevel2(dna_text);
        System.out.println(hex_text);
        String binary_text = UtilClass.hexToBinary(hex_text);
        System.out.println(binary_text);
        
        //DECRYPTION
        
        String rev_hex=UtilClass.binaryToHex(binary_text);
        System.out.println(rev_hex);
        String dna=f.toDna(binary_text);
        System.out.println(dna);
        String rev_level1=f.toRevLevel1(dna);
        System.out.println(rev_level1);
        
               
        
        toDecimal(rev_level1);
        
    }

    
    
    public  String getDecryptedText(String binary_text){
     
        String rev_hex = UtilClass.binaryToHex(binary_text);
        System.out.println(rev_hex);
        String dna = f.toDna(binary_text);
        System.out.println(dna);
        String rev_level1 = f.toRevLevel1(dna);
        System.out.println(rev_level1);

       return toDecimal(rev_level1);
    }
    
    public static String toDecimal(String  rev_level1){
        StringBuffer finalText = new StringBuffer();
        for(int i=0;i<rev_level1.length()-7;i+=8){
            String compare=rev_level1.substring(i, i+8);
            int decimal=Integer.parseInt(compare,2);
            System.out.println(compare+"len : "+compare.length()+" Int val : "+(char)decimal);
            finalText = finalText.append((char)decimal);
        }
        return finalText.toString();
    }
 
 //EXTRA
   public String getDecryptedText(String binary_text, String key) {
       String rev_hex = UtilClass.binaryToHex(binary_text);
       System.out.println(rev_hex);
       String dna = f.toDna(binary_text,key);
       System.out.println(dna);
       String rev_level1 = f.toRevLevel1(dna);
       System.out.println(rev_level1);

       return toDecimal(rev_level1);
    }
    
}
