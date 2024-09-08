/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
    FileInputStream fin=new FileInputStream("D:\\file1.txt");
    int i=0;
    while( (i=fin.read())!=-1){
        System.out.print((char) i);
    }
    fin.close();
    }

}
