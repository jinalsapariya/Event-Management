/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventOrganizingCommittee;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EventOrganizingCommitteeRole.EventOrganizingCommitteeDashPanel;
import UserInterface.SysAdminDashPanel.SysAdminDashPanel;
import javax.swing.JPanel;

/**
 *
 * @author jay_c
 */
public class EventOrganizingCommitteeRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new EventOrganizingCommitteeDashPanel(userProcessContainer, account, (EventOrganizingCommittee)organization, enterprise, system);
    }
}
