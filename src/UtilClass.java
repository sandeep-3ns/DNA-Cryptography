/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep kumar
 */
public class UtilClass {

    /**
     * @param args the command line arguments
     */
    
    public static String hexToBinary(String hexdec)
    {
        StringBuffer sb=new StringBuffer();
         for(int i=0;i<hexdec.length();i++){
         char ch=hexdec.charAt(i);
          switch (ch) { 
            case '0': 
                sb.append("0000");
                break; 
            case '1': 
                sb.append("0001");
                break; 
            case '2': 
                sb.append("0010");
                break; 
            case '3': 
                sb.append("0011"); 
                break; 
            case '4': 
                sb.append("0100"); 
                break; 
            case '5': 
                   sb.append("0101");
                break; 
            case '6': 
                sb.append("0110"); 
                break; 
            case '7': 
                sb.append("0111");; 
                break; 
            case '8': 
                sb.append("1000"); 
                break; 
            case '9': 
                sb.append("1001"); 
                break; 
            case 'A': 
            case 'a': 
                sb.append("1010"); 
                break; 
            case 'B': 
            case 'b': 
                sb.append("1011"); 
                break; 
            case 'C': 
            case 'c': 
                sb.append("1100"); 
                break; 
            case 'D': 
            case 'd': 
                sb.append("1101"); 
                break; 
            case 'E': 
            case 'e': 
                sb.append("1110"); 
                break; 
            case 'F': 
            case 'f': 
                sb.append("1111"); 
                break; 
            }  
        } 
         return sb.toString();
    }
    
    public static String binaryToHex(String data){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<data.length()-3;i+=4){
            String str=data.substring(i, i+4);
            switch(str)
            {
                case "0000":
                    sb.append("0");
                   break;
                case "0001":
                    sb.append("1");
                    break;
               case "0010":
                    sb.append("2");
                    break; 
                 case "0011":
                    sb.append("3");
                    break;
                    
                  case "0100":
                    sb.append("4");
                    break;
                 case "0101":
                    sb.append("5");
                    break;
                 case "0110":
                    sb.append("6");
                    break;    
                  case "0111":
                    sb.append("7");
                    break;
                    
                   case "1000":
                    sb.append("8");
                    break;
                  case "1001":
                    sb.append("9");
                    break;
                 case "1010":
                    sb.append("A");
                    break;
                   case "1011":
                    sb.append("B");
                    break;
                    
                   case "1100":
                    sb.append("C");
                    break;
                case "1101":
                    sb.append("D");
                    break;
                   case "1110":
                    sb.append("E");
                    break;
               case "1111":
                    sb.append("F");
                    break;
               default:
                     break;
            }
            
        }
        return sb.toString();
    }
    
    public static String toHex4digits(String str){
        StringBuffer sb = new StringBuffer();
        switch (str) {
            case "0000":
                sb.append("0");
                break;
            case "0001":
                sb.append("1");
                break;
            case "0010":
                sb.append("2");
                break;
            case "0011":
                sb.append("3");
                break;

            case "0100":
                sb.append("4");
                break;
            case "0101":
                sb.append("5");
                break;
            case "0110":
                sb.append("6");
                break;
            case "0111":
                sb.append("7");
                break;

            case "1000":
                sb.append("8");
                break;
            case "1001":
                sb.append("9");
                break;
            case "1010":
                sb.append("A");
                break;
            case "1011":
                sb.append("B");
                break;

            case "1100":
                sb.append("C");
                break;
            case "1101":
                sb.append("D");
                break;
            case "1110":
                sb.append("E");
                break;
            case "1111":
                sb.append("F");
                break;
            default:
                break;
        }

    return sb.toString();

    }
    

    
}
