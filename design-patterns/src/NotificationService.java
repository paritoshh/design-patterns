package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NotificationService {

    private HashMap<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void notifyObservers(Event event){
        customers.get(event).forEach(listener -> listener.update(event));
    }
    public void subscribe(Event event, EventListener customer){
        customers.get(event).add(customer);

    }
    public void unsubscribe(Event event, EventListener customer){
        customers.get(event).remove(customer);
    }
}
