package bigtalkdesignpattern.proxypattern;

public class Proxy extends Requests {

    private Requests requests;

    public Proxy() {
        if (requests ==null){
            this.requests = new RealRequests();
        }

    }

    @Override
    public void sendRequests() {
        this.requests.sendRequests();
    }
}
