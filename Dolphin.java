public class Dolphin extends Animal implements Swim {
    private int swimmingSpeed; // Speed in nautical miles per hour

    public Dolphin() {
        super("Dolphin"); // Call the parent constructor with the dolphin's name
    }

    // Add the following methods exactly as needed
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed; // Set the swimming speed
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed; // Return the current swimming speed
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
