/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeesalary;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class EmployeeSalary {
    static void calculate(int netsalary){
int HRA,TA,GS,PF;
double basicsalary;
double ESI;
HRA=(4*netsalary)/100;
TA =(2*netsalary)/100;
GS=netsalary+TA+HRA;
ESI=(0.75*netsalary)/100;
PF=(12*netsalary)/100;
basicsalary=GS-(PF-ESI);
System.out.println("basicsalary:"+basicsalary);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int netsalary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter net Salary:");
        netsalary=sc.nextInt();
        calculate(netsalary);
    }
  
    
}
