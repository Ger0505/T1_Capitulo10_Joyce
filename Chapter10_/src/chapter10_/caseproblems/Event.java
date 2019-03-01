/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class Event {
    public static final Integer PRICE_PER_GUEST = 35;
    public static final Integer LARGE_EVENT = 50;
    
    private String event_number;
    private Integer guests;
    private Integer price;

    public Event(String event_number, Integer guests) {
        setEventNumber(event_number);
        setGuests(guests);
    }

    public Event() {
        setEventNumber("A000");
        setGuests(0);
    }
    
    public void setEventNumber(String number){
        this.event_number = number;
    }
    
    public void setGuests(Integer guests){
        this.guests = guests;
        this.price = guests*PRICE_PER_GUEST;
    }

    public String getEvent_number() {
        return event_number;
    }

    public Integer getGuests() {
        return guests;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Event{" + "event_number=" + event_number + ", guests=" + guests + ", price=" + price + '}';
    }
}
