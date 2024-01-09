package Seminar_2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Василий";

        Market market = new Market();

        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();

    }
    
}