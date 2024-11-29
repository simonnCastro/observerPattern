import java.util.List;

public class NewsAgency implements NewsAgencySubject{
    private String news;
    private List<Subscriber> subscriberList ;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }
    
    @Override
    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    @Override
    public void unSubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber(){
        String output = new String();
        for(Subscriber subscriber : subscriberList){
            output += "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += " Today's news is" + news;
        }
        return output;
    }
}