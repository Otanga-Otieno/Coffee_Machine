package machine;

public class Latte extends Coffee {
    final int WATER = 350;
    final int MILK = 75;
    final int BEANS = 20;
    final int PRICE = 7;

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
