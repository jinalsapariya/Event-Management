/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory empDirectory;
    private UserAccountDirectory userDirectory;
    private int orgId;
    private static int counter = 0;
    
    public enum Type{
        Admin("Admin Organization"), EventOrganizingCommittee("EventOrganizing Committee"), DirectorOffice("Director's Office"), HRDept("Human Resource Department"), FinanceDept("Finance Department"), BudgetingDept("Budgetary Department");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name){
        this.name = name;
        workQueue = new WorkQueue();
        empDirectory = new EmployeeDirectory();
        userDirectory = new UserAccountDirectory();
        orgId = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmpDirectory() {
        return empDirectory;
    }

    public void setEmpDirectory(EmployeeDirectory empDirectory) {
        this.empDirectory = empDirectory;
    }

    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrgId() {
        return orgId;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
}
