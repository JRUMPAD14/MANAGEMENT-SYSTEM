package it2e.employees;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeRegExp.test;

public class IT2EEMPLOYEES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        while (true) {
   
         System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");

            System.out.print("Enter Action: ");
            int action = sc.nextInt();
            IT2EEMPLOYEES emp = new IT2EEMPLOYEES();
            
            
            switch (action) {
                case 1:
                    IT2EEMPLOYEES.addEmployees(conf, sc);
                    break;
                case 2:
                    IT2EEMPLOYEES.viewEmployees();
                    break;
                case 3:
                   IT2EEMPLOYEES.viewEmployees();
                   IT2EEMPLOYEES.updateEmployees();     
                    break;
                case 4:
                    IT2EEMPLOYEES.vieEmployees();
                    IT2EEMPLOYEES.deleteEmployees();
                    IT2EEMPLOYEES.viewEmployees();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
    }

    public static void addEmployees(config conf, Scanner sc) {
        System.out.print("First Name: ");
        String fname = sc.next();

        System.out.print("Last Name: ");
        String lname = sc.next();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Position: ");
        String position = sc.next();                

        System.out.print("Status: ");
        String status = sc.next();

        String sql = "INSERT INTO tbl_employee (e_fname, e_lname, e_email, e_position, e_status) VALUES (?, ?, ?, ?, ?)";
        conf.addRecord(sql, fname, lname, email, position, status);

        System.out.println("Employee added successfully.");
    }

    private static void viewEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void updateEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void vieEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

   