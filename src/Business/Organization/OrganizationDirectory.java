/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.EventOrganizingCommittee.getValue())){
            organization = new EventOrganizingCommittee();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DirectorOffice.getValue())){
            organization = new DirectorOfficeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HRDept.getValue())){
            organization = new HRDeptOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FinanceDept.getValue())){
            organization = new FinanceDeptOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BudgetingDept.getValue())){
            organization = new BudgetingDeptOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public boolean checkIfOrgTypeExists(Organization.Type type, ArrayList<Organization> o){
        for(Organization org: o){
            if(org.getName().equals(type.getValue())){
                return true;
            }
            
        }
        return false;
    }
}
