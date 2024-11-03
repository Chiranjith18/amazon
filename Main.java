import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop = 1;
        int continueInnerLoop;
        int menuChoice;

        // Create instances of Tiger, Dolphin, and Penguin
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal chosen is: " + tigerObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);

                        switch (menuChoice) {
                            case 1:
                                System.out.print("Enter the age of the tiger: ");
                                tigerObject.setAge(keyboard.nextInt());

                                System.out.print("Enter the height of the tiger: ");
                                tigerObject.setHeight(keyboard.nextDouble());

                                System.out.print("Enter the weight of the tiger: ");
                                tigerObject.setWeight(keyboard.nextDouble());
                                break;

                            case 2:
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                break;

                            case 3:
                                tigerObject.walking();
                                break;

                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2:
                    do {
                        System.out.println("The animal chosen is: " + dolphinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);

                        switch (menuChoice) {
                            case 1:
                                System.out.print("Enter the age of the dolphin: ");
                                dolphinObject.setAge(keyboard.nextInt());

                                System.out.print("Enter the height of the dolphin: ");
                                dolphinObject.setHeight(keyboard.nextDouble());

                                System.out.print("Enter the weight of the dolphin: ");
                                dolphinObject.setWeight(keyboard.nextDouble());
                                break;

                            case 2:
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                break;

                            case 3:
                                dolphinObject.swimming();
                                break;

                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    do {
                        System.out.println("The animal chosen is: " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);

                        switch (menuChoice) {
                            case 1:
                                System.out.print("Enter the age of the penguin: ");
                                penguinObject.setAge(keyboard.nextInt());

                                System.out.print("Enter the height of the penguin: ");
                                penguinObject.setHeight(keyboard.nextDouble());

                                System.out.print("Enter the weight of the penguin: ");
                                penguinObject.setWeight(keyboard.nextDouble());

                                System.out.print("Enter the walk speed of the penguin: ");
                                penguinObject.setWalkSpeed(keyboard.nextInt());

                                System.out.print("Enter the swim speed of the penguin: ");
                                penguinObject.setSwimSpeed(keyboard.nextInt());

                                System.out.print("Is the penguin swimming (true/false): ");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                break;

                            case 2:
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Walking Speed: " + penguinObject.getWalkSpeed());
                                System.out.println("Swimming Speed: " + penguinObject.getSwimSpeed());
                                System.out.println(penguinObject.isSwimming() ? "The penguin is swimming." : "The penguin is walking.");
                                break;

                            case 3:
                                if (penguinObject.isSwimming()) {
                                    penguinObject.swimming();
                                } else {
                                    penguinObject.walking();
                                }
                                break;

                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.println("Continue with this animal? (Enter 1 for yes / 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes / 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal (1-3): ");
        return keyboard.nextInt();
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal());
        System.out.println("1. Set Age, Height, and Weight");
        System.out.println("2. Display Age, Height, and Weight");
        System.out.println("3. Perform Action (Walk or Swim)");
        System.out.println("4. Feed Animal");
        System.out.print("Enter choice (1-4): ");
        return keyboard.nextInt();
    }
}
