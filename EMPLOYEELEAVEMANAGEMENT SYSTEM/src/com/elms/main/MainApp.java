package com.elms.main;

import java.util.Scanner;
import com.elms.model.*;
import com.elms.service.*;

public class MainApp {

    public static void main(String[] args) {

        LeaveService service = new LeaveService();

        service.addEmployee(new Employee(1, "Wayne", "IT"));
        service.addEmployee(new Employee(2, "Rikhotso", "HR"));

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
        	//menu options

            System.out.println("\n===== Employee Leave Management System =====");
            System.out.println("1. Apply Leave");
            System.out.println("2. Check Leave Status");
            System.out.println("3. Admin: View All Leaves");
            System.out.println("4. Admin: Approve Leave");
            System.out.println("5. Admin: Reject Leave");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Leave ID: ");
                    int leaveId = sc.nextInt();

                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Leave Type: ");
                    String type = sc.nextLine();

                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();

                    service.applyLeave(new Leave(leaveId, empId, type, days));

                    System.out.println("Leave Applied Successfully.");

                    break;

                case 2:

                    System.out.print("Enter Employee ID: ");
                    int empCheck = sc.nextInt();

                    service.checkLeaveStatus(empCheck);

                    break;

                case 3:

                    service.viewLeaves();

                    break;

                case 4:

                    System.out.print("Enter Leave ID to Approve: ");
                    int approveId = sc.nextInt();

                    service.approveLeave(approveId);

                    break;

                case 5:

                    System.out.print("Enter Leave ID to Reject: ");
                    int rejectId = sc.nextInt();

                    service.rejectLeave(rejectId);

                    break;

                case 6:

                    System.out.println("Exiting System...");

                    break;

                default:

                    System.out.println("Invalid choice.");

            }

        } while (choice != 6);

        sc.close(); 
    }
}