/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6_Strings;

class GetCharsExample {

    public static void main(String[] args) {
        String str = "Hello World";
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        str.getChars(1, 4, ch, 2);
        System.out.println(ch);
    }
}
