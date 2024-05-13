package observer;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Items> itemsList;
    private final NotificationService notificationService;
    Store(NotificationService notificationService){
        itemsList = new ArrayList<>();
        this.notificationService = notificationService;
    }
    public void addItem(Items item) {
        itemsList.add(item);
        notificationService.notifyObservers(Event.NEW_ITEM);
    }

    public void startSale() {
        notificationService.notifyObservers(Event.SALE);
    }
}
