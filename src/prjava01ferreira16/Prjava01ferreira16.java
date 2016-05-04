
package prjava01ferreira16;

import java.awt.Desktop;

import java.io.*;


public class Prjava01ferreira16 {

  
    public static void main(String[] args) {
        
        File f = new File("prj01ferreira16.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina  web de Alex Perez Ferreira");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
            
        }catch(Exception ex){
            
            System.out.println("error handler");
            
        }
        
        
             
    }
    
}
