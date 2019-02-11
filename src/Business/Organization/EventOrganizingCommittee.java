/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventOrganizingCommitteeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public class EventOrganizingCommittee extends Organization{
    public EventOrganizingCommittee() {
        super(Type.EventOrganizingCommittee.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventOrganizingCommitteeRole());
        return roles;
    }
}
