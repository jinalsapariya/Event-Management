/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import Business.Customers.Customer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jay_c
 */
public class Event {
    private String eventName;
    private String eventType;
    private String eventCatagory;
    private int capacity;
    private double price;
    private Date eventDate;
    private String venue;
    private String time;
    private int act_booking;
    private ArrayList<Customer> customers;
    
    public Event(){
        customers = new ArrayList();
        act_booking = 0;
    }
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventCatagory() {
        return eventCatagory;
    }

    public void setEventCatagory(String eventCatagory) {
        this.eventCatagory = eventCatagory;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public int getAct_booking() {
        return act_booking;
    }

    public void setAct_booking(int act_booking) {
        this.act_booking = act_booking;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    @Override
    public String toString(){
        return this.eventName;
    }
}
