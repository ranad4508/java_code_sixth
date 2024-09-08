/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Streams;

import java.io.*;

public class FileExample {
    public static void main(String args[]){
        File f = new File("D:\\filewriter.txt");
        if(f.exists()){
            System.out.println("File name\t"+f.getName());
            System.out.println("File path\t"+f.getPath());
            System.out.println("Full Path\t"+f.getAbsolutePath());
            System.out.println("Writable\t"+f.canWrite());
            System.out.println("Readable\t"+f.canRead());
            System.out.println("Full size in bytes\t"+f.length());
        }
        System.out.println("Is it a directory?");
        if(f.isDirectory()==true){
            System.out.println("It is folder");
        }
        else{
            System.out.println("It is file");
        }
        File dir = new File("D:\\filewriter.txt");
    }
}
