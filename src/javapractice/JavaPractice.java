/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;
import java.util.Scanner;

/**
 *
 * @author User:Chamano the dev
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        
        String myInput = myobj.next();
        System.out.print(" The input you have entred is: " + myInput +" " );
        
        System.out.print("Starting ");
        
        basics.Basics.basic();
    }
    
}
