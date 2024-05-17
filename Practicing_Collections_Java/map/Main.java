package map;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String args[]){
        EventSchedule event = new EventSchedule();
        event.addEvent(LocalDate.of(2024, Month.MAY, 25),"Local event1","Bu ne");
        event.addEvent(LocalDate.of(2024, Month.JULY, 25),"Local event2","O ne");
        event.addEvent(LocalDate.of(2004, Month.AUGUST, 25),"Local event3","Kim ne");

        event.displaySchedule();
    }
}
