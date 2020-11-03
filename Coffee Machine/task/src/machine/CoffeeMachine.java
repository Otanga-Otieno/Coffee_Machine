package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        menu: while (true) {
            System.out.println("Write action (buy, fil, take, remaining, exit");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    Coffee.buyCoffee();
                    break;
                case "fill":
                    Coffee.fill();
                    break;
                case "take":
                    Coffee.take();
                    break;
                case "remaining":
                    Coffee.display();
                    break;
                case "exit":
                    break menu;
                default:

            }

        }

        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/


        /*System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        System.out.printf("For 25 cups of coffee you will need:\n%d ml of water\n%d ml of milk\n%d g of coffee beans", WATER * cups, MILK * cups, BEANS * cups);

        int watertotal = water/WATER;
        int milktotal = milk/MILK;
        int beanstotal = beans/BEANS;

        int cupstotal = watertotal < milktotal? watertotal < beanstotal? watertotal: beanstotal: milktotal < beanstotal? milktotal: beanstotal;

        if (cupstotal == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupstotal < cups) {
            System.out.println("No, I can make only " + cupstotal + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupstotal - cups) + " more than that");
        }*/

    }
}
