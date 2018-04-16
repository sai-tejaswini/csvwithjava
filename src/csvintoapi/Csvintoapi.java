/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvintoapi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Csvintoapi {

    public static void main(String[] args) 
    {
        String ID = "123";
        String NAME = "sai";
        String PHNUM = "9999999999";
        String GENDER = "F";
        String PATH = "USRDATA.csv";
        
        
        saveRecord(ID,NAME,PHNUM,GENDER,PATH);
        
    }

    private static void saveRecord(String ID, String NAME, String PHNUM, String GENDER, String PATH) {

           try
           {
               FileWriter fw = new FileWriter(PATH,true);
               BufferedWriter bw = new BufferedWriter(fw);
               PrintWriter pw = new PrintWriter(bw);
                       
              pw.println(ID +","+NAME+","+PHNUM+","+GENDER);
              pw.flush();
              pw.close();
              
              JOptionPane.showMessageDialog(null,"saved succesfully");
                System.out.println("yes");
                
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null,"not saved"); 
           }
    }

   
}
