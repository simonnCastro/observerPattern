public class Subscriber implements SubscriberObserver{
    private String subscriberName;

    public String getSubscriberName(){
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName){
        this.subscriberName = subscriberName;
    }
}