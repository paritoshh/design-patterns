package observer;

public class MobileListener implements EventListener {
    @Override
    public void update(Event event) {
        System.out.println("Mobile notification received for :"+event.toString());
    }
}
