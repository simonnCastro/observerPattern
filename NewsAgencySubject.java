public interface NewsAgencySubject{
    public void subscribe(Subscriber subscriber);
    public void unSubscribe(Subscriber subscriber);
    public String notifySubscriber();
}
