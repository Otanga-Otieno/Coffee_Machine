package machine;

import java.util.Scanner;

public class Coffee {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static boolean areCups() {
        if (cups > 0) {
            return true;
        } else {
            return false;
        }
    }

    static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        if (!areCups()) {
            System.out.println("Sorry, not enough disposable cups");
            return;
        }

        switch (action) {
            case "1" :
                Espresso espresso = new Espresso();
                espresso.resources(1);
                break;
            case "2" :
                Latte latte = new Latte();
                latte.resources(1);
                break;
            case "3" :
                Cappuccino cappuccino = new Cappuccino();
                cappuccino.resources(1);
                break;
            case "back" :
                return;
            default:

        }
        System.out.println();
    }

    static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    static  void display() {
        System.out.printf("The coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n%d of disposable cups\n%d of money", water, milk, beans, cups, money);
        System.out.println();
    }

    static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

}
