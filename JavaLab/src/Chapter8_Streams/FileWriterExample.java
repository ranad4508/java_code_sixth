/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
    public static void main(String args[]) throws IOException{
        FileWriter fw = new FileWriter("D:\\filewriter.txt");
        fw.write("Java is a interesting प्रोग्रामिङ. \n You will enjoy it.");
        fw.close();
        System.out.println("\n Information is added to file");
    }
}
