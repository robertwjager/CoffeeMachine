package machine;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // MACHINE CURRENT SUPPLY
        int machineWaterAmount = 400;
        int machineMilkAmount = 540;
        int machineBeansAmount = 120;
        int machineDisposableCups = 9;
        int machineMoney = 550;

        String choiceMenu;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            choiceMenu = scanner.next();

            switch (choiceMenu) {
                case "buy", "Buy" -> {
                    // SHOW COFFEE CHOICES
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back to menu: ");
                    String coffeeChoices = scanner.next();
                    if (coffeeChoices.equals("back")) {
                        break; //RETURN TO CHOICE MENU
                    }
                    switch (coffeeChoices) {
                        case "1" -> { // ESPRESSO
                            if (machineWaterAmount >= 250 && machineBeansAmount >= 16 && machineDisposableCups >= 1) {
                                machineWaterAmount -= 250;
                                machineBeansAmount -= 16;
                                machineMoney += 4;
                                machineDisposableCups -= 1;
                            }
                        }
                        case "2" -> { // LATTE
                            if (machineWaterAmount >= 350 && machineMilkAmount >= 75 && machineBeansAmount >= 20 && machineDisposableCups >= 1) {
                                machineWaterAmount -= 350;
                                machineMilkAmount -= 75;
                                machineBeansAmount -= 20;
                                machineMoney += 7;
                                machineDisposableCups -= 1;
                            }
                        }
                        case "3" -> { // CAPPUCCINO
                            if (machineWaterAmount >= 200 && machineMilkAmount >= 100 && machineBeansAmount >= 12 && machineDisposableCups >= 1) {
                                machineWaterAmount -= 200;
                                machineMilkAmount -= 100;
                                machineBeansAmount -= 12;
                                machineMoney += 6;
                                machineDisposableCups -= 1;
                            }
                        }
                    }
                }
                case "fill", "Fill" -> {
                    // REFILL THE MACHINE
                    System.out.println("Write how many ml of water you want to add: ");
                    machineWaterAmount += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    machineMilkAmount += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    machineBeansAmount += scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    machineDisposableCups += scanner.nextInt();
                }
                case "take", "Take" -> {
                    // TAKE MONEY FROM THE MACHINE
                    System.out.println("I gave you $" + machineMoney);
                    machineMoney = 0;
                }
                case "remaining", "Remaining" ->
                    // REMAINING MACHINE SUPPLY
                        displayMachineSupply(machineWaterAmount,
                                machineMilkAmount,
                                machineBeansAmount,
                                machineDisposableCups,
                                machineMoney);
                case "exit", "Exit" -> System.exit(0);
            }

            System.out.println();
        } while (true);
    }

    public static void displayMachineSupply(int waterAmount, int milkAmount, int beansAmount, int disposableCups, int money) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(waterAmount + " ml of water");
        System.out.println(milkAmount + " ml of milk");
        System.out.println(beansAmount + " g of beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
}
