package map;

import java.time.LocalDate;
import java.util.*;

public class EventSchedule {
    private Map<LocalDate,Event> eventSchedule;

    public EventSchedule(){
        this.eventSchedule = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction){
        Event event = new Event(name, attraction);
        eventSchedule.put(date,event);
    }

    public void displaySchedule(){
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventSchedule);
        System.out.println(eventsTreeMap);
    }

    public void getNextEvent(){
        LocalDate atualDate = LocalDate.now();
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventSchedule);
        for(Map.Entry<LocalDate,Event> entry : eventSchedule.entrySet()){
            if(entry.getKey().isEqual(atualDate) || entry.getKey().isAfter(atualDate)){
                System.out.println("Next event " + entry.getKey() + " will be at " + entry.getValue());
                break;
            }
        }
    }
}
