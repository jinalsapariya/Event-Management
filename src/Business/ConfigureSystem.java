/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jay_c
 */
public class ConfigureSystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmpDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        
        return system;
    }
}
