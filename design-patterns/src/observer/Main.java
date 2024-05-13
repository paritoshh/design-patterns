package observer;

public class Main {

    public static void main(String[] args) {
        EmailListener el1 = new EmailListener();
        EmailListener el2 = new EmailListener();
        EmailListener el3 = new EmailListener();
        MobileListener ml = new MobileListener();

        NotificationService ns = new NotificationService();
        ns.subscribe(Event.NEW_ITEM, el1);
        ns.subscribe(Event.SALE, el2);
        ns.subscribe(Event.SALE, el3);
        ns.subscribe(Event.NEW_ITEM, ml);

        Store store = new Store(ns);
        store.addItem(new Items("Knife"));
        store.startSale();
    }
}
