
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class Files {

    private static FileInputStream fin;
    private static FileOutputStream fout;

    HashMapLev2 hm = new HashMapLev2();
// 
//   private String fileName;
//   private String plainText;
//   private String binaryText;
//   private String lev1Text;
//   private String hexText;
//   private String finalText;
//    
//    public void setFileName(String fileName){
//        this.fileName = fileName;
//    };

    public String toLevel1(String bin_text) {
        String compare = "";
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k <= bin_text.length() - 2; k = k + 2) {
            // System.out.print("in;loop");
            compare = bin_text.substring(k, k + 2);
            //System.out.print("in;loop");
            //System.out.print("-->"+compare);
            if (compare.equals("00")) {
                sb.append("A");
                //System.out.println("Compare");
            } else if (compare.equals("01")) {
                sb.append("T");
            } else if (compare.equals("10")) {
                sb.append("C");
            } else {
                sb.append("G");
                //System.out.println("Compare");
            }
        }
        String ret = new String(sb);
        return ret;
    }

    public String toLevel2(String lev1) throws IOException {
        HashMapLev2 hm2 = new HashMapLev2();
        HashMap hm = hm2.getMap();
        System.out.println(hm);
        String com = "";
        String lev2 = "";
        for (int k = 0; k <= lev1.length() - 2; k = k + 2) {
            com = lev1.substring(k, k + 2);
            lev2 = lev2 + hm.get(com);
        }
        return lev2;
    }

    /**
     * @param args the command line arguments
     */
    String key = "ACTG";

    public void main(String[] args) throws IOException {
        /*    String text = getFileText("Sample.txt");
        String bin_text = toBinaryForm("Sample.txt");
        String lev1 = toLevel1(bin_text);
        String lev2 = toLevel2(lev1);
        
        System.out.println(text);*/
        String bin_text = toBinaryForm("aAzZdfdsfijldfjldfs");
        System.out.println(bin_text);
        String lev1 = toLevel1(bin_text);
        System.out.println(lev1);
        String encrypt = toLevel2(lev1);
        System.out.println(encrypt);
        String final_en = UtilClass.hexToBinary(encrypt);
        System.out.println(final_en);
    }

    public static String getFileText(String fileName) {
        String str = "";
        char c;
        int i;
        try {
            StringBuffer sb = new StringBuffer();
            FileInputStream fin = new FileInputStream(fileName);
            while ((i = fin.read()) != -1) {
                c = (char) i;
                sb.append(c);
            }
            str = new String(sb);
        } catch (Exception e) {

        }
        return str;
    }

    public String toBinaryForm(String text) {
        String bin_text = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String temp = Integer.toBinaryString((int) ch);
            while (temp.length() < 8) {
                temp = "0" + temp;
            }
            System.out.println(temp + " len : " + temp.length());
            bin_text = bin_text + temp;
        }
        return bin_text;
    }

    public String toDna(String binary_text) {
        StringBuffer sb = new StringBuffer();
        HashMapLev2 hm2 = new HashMapLev2();
        HashMap hm = hm2.getMapReverse();
        for (int i = 0; i < binary_text.length() - 3; i += 4) {
            String str = binary_text.substring(i, i + 4);
            String hex = UtilClass.toHex4digits(str);
            System.out.println(hex + " >> " + str);
            sb.append(hm.get(hex));
        }

        return sb.toString();
    }

    public String toRevLevel1(String dna) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < dna.length(); i++) {
            char ch = dna.charAt(i);
            switch (ch) {
                case 'A':
                    sb.append("00");
                    break;
                case 'T':
                    sb.append("01");
                    break;
                case 'C':
                    sb.append("10");
                    break;
                case 'G':
                    sb.append("11");
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

    //EXTRA
    String toDna(String binary_text, String key) {
        StringBuffer sb = new StringBuffer();
        HashMapLev2 hm2 = new HashMapLev2();
        hm2.setKey(key);
        HashMap hm = hm2.getMapReverse();
        for (int i = 0; i < binary_text.length() - 3; i += 4) {
            String str = binary_text.substring(i, i + 4);
            String hex = UtilClass.toHex4digits(str);
            System.out.println(hex + " >> " + str);
            sb.append(hm.get(hex));
        }

        return sb.toString();
    }
}
