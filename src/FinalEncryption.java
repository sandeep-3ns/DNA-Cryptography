
import java.awt.SystemColor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep kumar
 */
public class FinalEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void saveText(String text) throws IOException{
        try{
            String fileName = JOptionPane.showInputDialog(null, "Enter file Name");
            File f = new File(fileName);
            PrintStream out = new PrintStream(text);
        }catch(Exception e){
            
        }
    }

    static void saveText(String text, File fileToSave) {
        try {
          //  String fileName = JOptionPane.showInputDialog(null, "Enter file Name");
            PrintStream out = new PrintStream(fileToSave);
            out.println(text);
            System.out.println("File Text "+text);
            out.close();
        } catch (Exception e) {

        }
    }
    
}
