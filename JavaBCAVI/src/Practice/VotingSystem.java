/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Dinesh
 */
public class VotingSystem {

    public boolean VoteEligible(int age) {
        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote");
        }
        return false;
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.VoteEligible(90);
    }

}
