public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed; // Speed in mph
    private int soundLevelOfRoar; // Sound level of roar

    public Tiger() {
        super("Tiger"); // Call the parent constructor with the tiger's name
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    // Add the following methods exactly as needed
    public void setSoundLevel(int soundLevel) {
        this.soundLevelOfRoar = soundLevel; // Assuming this is the variable that stores the sound level
    }

    public int getSoundLevel() {
        return soundLevelOfRoar; // Returns the current sound level
    }

    @Override
    public void eatingFood() {
        System.out.println("Tiger: I am eating meat.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " mph.");
    }
}
