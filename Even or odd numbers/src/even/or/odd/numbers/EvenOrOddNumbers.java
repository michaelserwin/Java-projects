/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package even.or.odd.numbers;

/**
 *
 * @author Micha
 */
public class EvenOrOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("enter the num");
    int n=sc.nextInt();
    if(n%2==0)
        System.out.println(n+"is even");
    else
        System.out.print(n+"is odd");
    }
    
}
