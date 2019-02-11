/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customers;

import java.util.ArrayList;

/**
 *
 * @author jay_c
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    public Customer createCustomer(String fname, String lname, String email, String contact){
        Customer customer = new Customer();
        customer.setName(fname);
        customer.setLastName(lname);
        customer.setEmail(email);
        customer.setContactNo(contact);
        customerList.add(customer);
        
        return customer;
    }
}
