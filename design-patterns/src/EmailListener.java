package observer;

public class EmailListener implements EventListener{
    @Override
    public void update(Event event) {
        System.out.println("Email received for :"+event.toString());
    }
}
