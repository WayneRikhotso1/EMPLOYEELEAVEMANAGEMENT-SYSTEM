package com.elms.model;

public class Leave {
    private int leaveId;
    private int employeeId;
    private String leaveType;
    private int days;
    private String status;

    public Leave(int leaveId, int employeeId, String leaveType, int days) {
        this.leaveId = leaveId;
        this.employeeId = employeeId;
        this.leaveType = leaveType;
        this.days = days;
        this.status = "Pending";
    }

    public int getLeaveId() { 
    	return leaveId;
    	}
    
    public int getEmployeeId() { 
    	return employeeId;
    	}
    
    public String getStatus() { 
    	return status;
    	}

    public void approveLeave() { 
    	status = "Approved";
    	}
    
    public void rejectLeave() { 
    	status = "Rejected";
    	}
    
    public void displayLeave() {
        System.out.println("LeaveID: " + leaveId +
                " | EmployeeID: " + employeeId +
                " | Type: " + leaveType +
                " | Days: " + days +
                " | Status: " + status);
    }
}