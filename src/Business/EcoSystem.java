/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customers.Customer;
import Business.Customers.CustomerDirectory;
import Business.Event.EventDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CustomerDirectory customerList;
    private EventDirectory eventDirectory;

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network AddandCreateNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
        customerList = new CustomerDirectory();
        eventDirectory = new EventDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public CustomerDirectory getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerDirectory customerList) {
        this.customerList = customerList;
    }    
    
     public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
}
