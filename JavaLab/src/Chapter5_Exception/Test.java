/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Exception;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class ReadAndWrite {
    void readWrite() throws FileNotFoundException {
    FileInputStream fis=new FileInputStream("D:/file1.txt");
    }
    void save() throws FileNotFoundException {
    String s="this is demo";
    FileOutputStream fos=new FileOutputStream("D:/file1.txt");
    }
}
public class Test {
    public static void main(String[] args){
    ReadAndWrite r=new ReadAndWrite();
    try{
    r.readWrite();
    }catch (FileNotFoundException e){
    e.printStackTrace();
    }
    System.out.println("Hi Dinesh");
    }
}
