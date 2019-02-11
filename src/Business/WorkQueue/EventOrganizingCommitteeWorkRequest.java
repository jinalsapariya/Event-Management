/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author jay_c
 */
public class EventOrganizingCommitteeWorkRequest extends WorkRequest {
    private String eventName;
    private String eventType;
    private String eventCatagory;
    private int capacity;
    private double budget;
    private Date eventDate;
    private String result;
    private String acceptingEnterprise;
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getAcceptingEnterprise() {
        return acceptingEnterprise;
    }

    public void setAcceptingEnterprise(String acceptingEnterprise) {
        this.acceptingEnterprise = acceptingEnterprise;
    }
    
    @Override
    public String toString(){
        return this.getEventName();
    }
    
}
