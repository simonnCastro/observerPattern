import java.util.*;

public class Main {
    public static void main(String[] args){

        Subscriber maria = new Subscriber();
        maria.setSubscriberName("Maria");

        Subscriber juan = new Subscriber();
        juan.setSubscriberName("Juan");

        Subscriber oliver = new Subscriber();
        oliver.setSubscriberName("Oliver");

        List<Subscriber> SubscriberList = new ArrayList<>();
        SubscriberList.add(maria);
        SubscriberList.add(juan);
        SubscriberList.add(oliver);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNews("This is an observer pattern!");
        newsAgency.setSubscriberList(SubscriberList);

        System.out.println("NewsUpdates!");
        System.out.println(newsAgency.notifySubscriber());

        newsAgency.unSubscribe(juan);

        Subscriber jerry = new Subscriber();
        jerry.setSubscriberName("Jerry");
        newsAgency.subscribe(jerry);

        System.out.println("News Updates recently!");
        System.out.println(newsAgency.notifySubscriber());
    }
}