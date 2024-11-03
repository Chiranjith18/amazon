import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for getting input
        Scanner keyboard = new Scanner(System.in);
        // for loop continuation - 1 represents true
        int continueOuterLoop;
        int continueInnerLoop;
        // for menu choice
        int menuChoice;
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                    do {
                        System.out.println("The animal which is chosen is: Tiger");
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Set the sound level of the tiger:");
                                int soundLevel = keyboard.nextInt();
                                tigerObject.setSoundLevel(soundLevel);
                                break;
                            case 2:
                                System.out.println("Sound level of the tiger: " + tigerObject.getSoundLevel());
                                break;
                            case 3:
                                tigerObject.eatingFood();
                                break;
                            case 4:
                                System.out.println("Tiger is walking.");
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2:
                    menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                    do {
                        System.out.println("The animal which is chosen is: Dolphin");
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Set the swimming speed of the dolphin:");
                                int swimSpeed = keyboard.nextInt();
                                dolphinObject.setSwimmingSpeed(swimSpeed);
                                break;
                            case 2:
                                System.out.println("Swimming speed of the dolphin: " + dolphinObject.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphinObject.eatingFood();
                                break;
                            case 4:
                                System.out.println("Dolphin is swimming.");
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                    do {
                        System.out.println("The animal which is chosen is: Penguin");
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Is the penguin swimming (true/false):");
                                boolean isSwimming = keyboard.nextBoolean();
                                penguinObject.setSwimming(isSwimming);
                                System.out.println("Enter the walking speed of the penguin:");
                                int walkSpeed = keyboard.nextInt();
                                penguinObject.setWalkSpeed(walkSpeed);
                                System.out.println("Enter the swimming speed of the penguin:");
                                int swimSpeed = keyboard.nextInt();
                                penguinObject.setSwimSpeed(swimSpeed);
                                break;
                            case 2:
                                System.out.println(penguinObject.getDetails());
                                break;
                            case 3:
                                if (penguinObject.isSwimming()) {
                                    System.out.println("The penguin is swimming.");
                                } else {
                                    System.out.println("The penguin is walking.");
                                }
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal (1-3):");
        return keyboard.nextInt();
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("Enter choice (1-4):");
        return keyboard.nextInt();
    }
}
