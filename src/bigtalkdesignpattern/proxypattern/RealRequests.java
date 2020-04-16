package bigtalkdesignpattern.proxypattern;

public class RealRequests extends Requests {
    @Override
    public void sendRequests() {
        System.out.println("send the requests");
    }
}
