package bigtalkdesignpattern.proxypattern;

public class Context {
    public static void main(String[] args) {
        Requests requests = new Proxy();
        requests.sendRequests();
    }
}
