package machine;

public class Espresso extends Coffee {
    final int WATER = 250;
    final int BEANS = 16;
    final int PRICE = 4;

    void buy() {
        super.water -= WATER;
        super.beans -= BEANS;
        --super.cups;
        super.money += PRICE;
    }

    void resources(int cups) {
        int watertotal = water/WATER;
        int beanstotal = beans/BEANS;
        int cupstotal = watertotal < beanstotal? watertotal: beanstotal;

        if (cupstotal >= cups) {
            System.out.println("I have enough resources, making you a coffee!");
            this.buy();
        } else if (watertotal < cups) {
            System.out.println("Sorry, not enough water");
            return;
        } else if (beanstotal < cups) {
            System.out.println("Sorry, not enough coffee beans");
            return;
        }

    }

}
