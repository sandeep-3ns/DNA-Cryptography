import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep kumar
 */
public class HashMapLev2 {
    /**
     * @param args the command line arguments
     */
   private static HashMap<String,String> hm = new HashMap<String,String>();
   
   private String hexKey = "79ABCDEF01234568";

    
   public HashMap getMap(){
       if(hexKey.length()==16){
       hm.put("AA","" + hexKey.charAt(0));
       hm.put("AT", "" + hexKey.charAt(1));
       hm.put("AG", "" + hexKey.charAt(2));
       hm.put("AC", "" + hexKey.charAt(3));

       hm.put("TA", "" + hexKey.charAt(4));
       hm.put("TT", "" + hexKey.charAt(5));
       hm.put("TG", "" + hexKey.charAt(6));
       hm.put("TC", "" + hexKey.charAt(7));

       hm.put("GA", "" + hexKey.charAt(8));
       hm.put("GT", "" + hexKey.charAt(9));
       hm.put("GG", "" + hexKey.charAt(10));
       hm.put("GC", "" + hexKey.charAt(11));

       hm.put("CA", "" + hexKey.charAt(12));
       hm.put("CT", "" + hexKey.charAt(13));
       hm.put("CG", "" + hexKey.charAt(14));
       hm.put("CC", "" + hexKey.charAt(15));
       }else{
           System.out.println("Error Key");
       }
        return hm;
    }
   private String keyRev="AAATAGACTATTTGTCGAGTGGGCCACTCGCC";
   private static HashMap<String,String> hmRev = new HashMap<String,String>();
    public HashMap getMapReverse() {
        if (keyRev.length() == 32) {
            hmRev.put(hexKey.charAt(0)+"", keyRev.substring(0,2));
            hmRev.put(hexKey.charAt(1)+ "", keyRev.substring(2,4));
            hmRev.put(hexKey.charAt(2)+"", keyRev.substring(4,6));
            hmRev.put(hexKey.charAt(3)+"",keyRev.substring(6,8));

            hmRev.put(hexKey.charAt(4)+"" , keyRev.substring(8,10));
            hmRev.put(hexKey.charAt(5)+"", keyRev.substring(10,12));
            hmRev.put(hexKey.charAt(6)+ "" , keyRev.substring(12,14));
            hmRev.put(hexKey.charAt(7)+ "" , keyRev.substring(14,16));

            hmRev.put(hexKey.charAt(8)+"" , keyRev.substring(16,18));
            hmRev.put(hexKey.charAt(9)+"" , keyRev.substring(18,20));
            hmRev.put(hexKey.charAt(10)+"" , keyRev.substring(20,22));
            hmRev.put(hexKey.charAt(11)+ "" , keyRev.substring(22,24));

           hmRev.put(hexKey.charAt(12)+"" , keyRev.substring(24,26));
            hmRev.put(hexKey.charAt(13)+"", keyRev.substring(26,28));
            hmRev.put(hexKey.charAt(14)+"" , keyRev.substring(28,30));
            hmRev.put(hexKey.charAt(15)+"" , keyRev.substring(30,32));  
        } else {
            System.out.println("Error Key");
        }
        return hmRev;
    }
   
    private static HashMap<String, String> hmRev2 = new HashMap<String, String>();
    public HashMap getMapReverse2() {
        if (keyRev.length() == 32) {
            hmRev.put("0000", "" + keyRev.substring(0, 2));
            hmRev.put("0001", "" + keyRev.substring(2, 4));
            hmRev.put("0010", "" + keyRev.substring(4, 6));
            hmRev.put("0011", "" + keyRev.substring(6, 8));

            hmRev.put("0100", "" + keyRev.substring(8, 10));
            hmRev.put("0101", "" + keyRev.substring(10, 12));
            hmRev.put("0110", "" + keyRev.substring(12, 14));
            hmRev.put("0111", "" + keyRev.substring(14, 16));

            hmRev.put("1000", "" + keyRev.substring(16, 18));
            hmRev.put("1001", "" + keyRev.substring(18, 20));
            hmRev.put("1010", "" + keyRev.substring(20, 22));
            hmRev.put("1011", "" + keyRev.substring(22, 24));

            hmRev.put("1100", "" + keyRev.substring(24, 26));
            hmRev.put("1101", "" + keyRev.substring(26, 28));
            hmRev.put("1110", "" + keyRev.substring(28, 30));
            hmRev.put("1111", "" + keyRev.substring(30, 32));

        } else {
            System.out.println("Error Key");
        }

        return hmRev;
    }
   //EXTRA METHOD
    void setKey(String key) {
      hexKey = key;
    }
}
