/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fout = new FileOutputStream("D:\\file1.txt")) {
            String str="We are studying file input and output stream in JAVA";
            byte[] b=str.getBytes();
            fout.write(b);
            System.out.println("\nInformation is stored into the file. Let's see it.\t");
        }
    }
}
