/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BudgetingDeptRole;
import Business.Role.DirectorOfficeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public class BudgetingDeptOrganization extends Organization{
    public BudgetingDeptOrganization() {
        super(Organization.Type.BudgetingDept.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BudgetingDeptRole());
        return roles;
    }
}
