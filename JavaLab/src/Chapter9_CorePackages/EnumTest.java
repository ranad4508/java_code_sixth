/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_CorePackages;

enum WeekDays{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Firday, Saturday;
}
public class EnumTest {
    public static void main(String[] args) {
        WeekDays arr[]=WeekDays.values();
        for (WeekDays wk:arr) {
        System.out.println(wk);
        } 
    }
}
