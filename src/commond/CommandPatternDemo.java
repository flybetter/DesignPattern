package commond;

public class CommandPatternDemo {


    public static void main(String[] args) {
        Stock abcStcok = new Stock();

        Order buyOrder = new BuyStock(abcStcok);
        Order sellOrder = new SellStock(abcStcok);


        Broker broker = new Broker();

        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        broker.placeOrders();
    }


}
