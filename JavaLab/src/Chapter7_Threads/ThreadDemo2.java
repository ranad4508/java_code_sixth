
package Chapter7_Threads;

/**
 Chapter string. page no. 6, 7, 8, 9, 11, 12, 16, 14.
 * Chapter Streams. page no. 8, 9, 11, 12.
 */
public class ThreadDemo2 extends Thread {
    @Override
    public void run(){
        System.out.println("This is thread extending thread class");
    }

    public static void main(String[] args) {
        ThreadDemo2 td2=new ThreadDemo2();
        td2.start();
        System.out.println(td2.getId());
        System.out.println(td2.getName());
    }
}