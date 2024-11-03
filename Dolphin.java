public class Dolphin extends Animal implements Swim {
    private int swimmingSpeed; // Speed in nautical miles per hour
    private String color; // Color of the dolphin

    public Dolphin() {
        super("Dolphin"); // Call the parent constructor with the dolphin's name
    }

    // Method to set the swimming speed
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed; // Set the swimming speed
    }

    // Method to get the swimming speed
    public int getSwimmingSpeed() {
        return swimmingSpeed; // Return the current swimming speed
    }

    // Method to set the color
    public void setColor(String color) {
        this.color = color; // Set the color of the dolphin
    }

    // Method to get the color
    public String getColor() {
        return color; // Return the current color of the dolphin
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour.");
    }
}
