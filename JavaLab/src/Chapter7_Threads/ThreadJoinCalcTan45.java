/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Threads;

/**
 *
 * @author Dinesh
 */
public class ThreadJoinCalcTan45 {
    private double sin45;
    private double cos45;
    
        public static void main(String[] args) throws InterruptedException {
            final ThreadJoinCalcTan45 obj=new ThreadJoinCalcTan45();
            Thread sin45T=new Thread(){
            @Override
                public void run() { 
                    obj.sin45=Math.sin(Math.PI/4); 
                }
            };

    Thread cos45T=new Thread(){
        public void run(){
            obj.cos45=Math.cos(Math.PI/4); 
        } 
    };
        sin45T.start();
        cos45T.start();
        sin45T.join();
        cos45T.join();
        double Tan45=Math.round(obj.sin45/obj.cos45);
        System.out.println("The Value of Tan45 is:"+Tan45); 
        }
}
