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
public class EventDirectory {
    
    private ArrayList<Event> eventList;
    
    public EventDirectory(){
        eventList = new ArrayList();
    }

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }
    
    public Event createEvent(String eName, String eType, String eCatagory, int eCapacity, double price, Date eventDate, String venue, String time){
        Event event = new Event();
        event.setEventName(eName);
        event.setEventType(eType);
        event.setEventCatagory(eCatagory);
        event.setCapacity(eCapacity);
        event.setPrice(price);
        event.setEventDate(eventDate);
        event.setVenue(venue);
        event.setTime(time);
        eventList.add(event);
        
        return event;
    }
}
