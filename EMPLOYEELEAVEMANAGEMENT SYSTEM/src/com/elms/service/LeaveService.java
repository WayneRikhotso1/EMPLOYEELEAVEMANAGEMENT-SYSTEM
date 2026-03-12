package com.elms.service;

import java.util.ArrayList;
import com.elms.model.*;

public class LeaveService {

    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Leave> leaves = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void applyLeave(Leave leave) {
        leaves.add(leave);
    }
    
    public void viewLeaves() {

        if (leaves.isEmpty()) {
            System.out.println("No leave records found.");
            return;
        }

        for (Leave l : leaves) {
            l.displayLeave();
        }
    }
    
    public void checkLeaveStatus(int empId) {

        boolean found = false;

        for (Leave l : leaves) {
            if (l.getEmployeeId() == empId) {
                l.displayLeave();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No leave records for this employee.");
        }
    }
    
    public void approveLeave(int leaveId) {

        for (Leave l : leaves) {
            if (l.getLeaveId() == leaveId) {
                l.approveLeave();
                System.out.println("Leave Approved.");
                return;
            }
        }

        System.out.println("Leave ID not found.");
    }
    
    public void rejectLeave(int leaveId) {

        for (Leave l : leaves) {
            if (l.getLeaveId() == leaveId) {
                l.rejectLeave();
                System.out.println("Leave Rejected.");
                return;
            }
        }

        System.out.println("Leave ID not found.");
    }
   
}