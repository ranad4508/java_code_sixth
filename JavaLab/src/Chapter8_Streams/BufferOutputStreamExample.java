/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.*;

public class BufferOutputStreamExample {
    public static void main(String[] args) throws IOException {
    FileOutputStream fout=new FileOutputStream("D://Bfile1.txt");
    BufferedOutputStream bout=new BufferedOutputStream(fout);
    String str="Students of EIC College\nLearning Chapter File Handling\n";
    byte[] b=str.getBytes();
    bout.write(b);
    bout.flush();//forcefully place content from ram into file
    System.out.println("Lets look the content written in the file in the mentioned location.");
    bout.close();
    fout.close();
    }
}
