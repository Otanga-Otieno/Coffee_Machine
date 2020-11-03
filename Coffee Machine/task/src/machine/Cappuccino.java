package machine;

public class Cappuccino extends Coffee {
    final int WATER = 200;
    final int MILK = 100;
    final int BEANS = 12;
    final int PRICE = 6;

    void buy() {
        super.water -= WATER;
        super.milk -= MILK;
        super.beans -= BEANS;
        --super.cups;
        super.money += PRICE;
    }

    void resources(int cups) {
        int watertotal = water/WATER;
        int milktotal = milk/MILK;
        int beanstotal = beans/BEANS;
        int cupstotal = watertotal < milktotal? watertotal < beanstotal? watertotal: beanstotal: milktotal < beanstotal? milktotal: beanstotal;

        if (cupstotal >= cups) {
            System.out.println("I have enough resources, making you a coffee!");
            this.buy();
        } else if (watertotal < cups) {
            System.out.println("Sorry, not enough water");
            return;
        } else if (milktotal < cups) {
            System.out.println("Sorry, not enough milk");
            return;
        } else if (beanstotal < cups) {
            System.out.println("Sorry, not enough coffee beans");
            return;
        }

    }

}
