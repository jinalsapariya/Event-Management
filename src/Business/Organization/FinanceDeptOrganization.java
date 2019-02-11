/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventOrganizingCommitteeRole;
import Business.Role.FinanceDeptRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public class FinanceDeptOrganization extends Organization {
    
    public FinanceDeptOrganization() {
        super(Type.FinanceDept.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceDeptRole());
        return roles;
    }
}
